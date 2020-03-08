package com.cristi.simple.spring.simplespring.exercises.ex4;

import lombok.SneakyThrows;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.util.FileSystemUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FatBunnyLocalIT {
    @Value("${resources.folder}")
    private String pathToWeightJournal;
    @Autowired
    private FatBunny fatBunny;


    @Test
    @Order(1)
    void when_spring_starts_bunny_should_have_20_KGs() {
        assertThat(fatBunny.getWeight()).isEqualTo(20);
    }

    @SneakyThrows
    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.BEFORE_METHOD)
    @Order(2)
    void verifyWeight() {
        System.out.println("Pathul");
        String weightJournalFile = pathToWeightJournal + "/weightJournal.txt";

        File journalFile = new File(weightJournalFile);
        try {
            Scanner weightJournalStream = new Scanner(journalFile);
            int weightValue = weightJournalStream.nextInt();
            assertThat(weightValue).isEqualTo(10);
            weightJournalStream.close();
            deleteWeightJournal(journalFile);
        } catch (IOException e) {
            throw new IllegalStateException("The bunny must loose weight before spring context ends", e);
        }
    }

    private void deleteWeightJournal(File journalFile) {
        FileSystemUtils.deleteRecursively(journalFile);
        System.out.printf("Deleted file %s", journalFile);
        System.out.printf("File exists: %s", journalFile.getAbsoluteFile().exists());
    }
}
