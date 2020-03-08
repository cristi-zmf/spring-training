package com.cristi.simple.spring.simplespring.exercises.ex4;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*Dont modify this!!!*/
@Getter
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class WeightInKilograms {
    @Value("${resources.folder}")
    private String pathToJournal;

    private int weight;

    public WeightInKilograms() {
        weight = 20;
    }

    public void dropWeight(int droppedKilos) {
        weight -= droppedKilos;
        writeToJournal();
    }

    @PostConstruct
    public void hereIsThePath() {
        System.out.println("Here is the path: " + pathToJournal);
    }

    private void writeToJournal() {
        String weightJournalFile = pathToJournal + "/weightJournal.txt";
        tryToCreateJournalFile(weightJournalFile);
        try (FileWriter fileWriter = new FileWriter(weightJournalFile)){
            fileWriter.write(String.valueOf(weight));
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void tryToCreateJournalFile(String weightJournalFile) {
        File file = new File(weightJournalFile);
        try {
            if (!file.createNewFile()) {
                throw new IllegalStateException("Could not create " + weightJournalFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
