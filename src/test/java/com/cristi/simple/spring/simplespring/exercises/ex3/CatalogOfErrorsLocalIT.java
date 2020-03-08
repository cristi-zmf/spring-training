package com.cristi.simple.spring.simplespring.exercises.ex3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CatalogOfErrorsLocalIT {
    @Autowired
    private CatalogOfErrors sut; //sut = system under test
    @Test
    void should_have_error_messages_injected() {
        assertThat(sut.getPageNotFoundErrorMessage()).isEqualTo("Page not found");
        assertThat(sut.getUserForbiddenErrorMessage()).isEqualTo("User is forbidden");
    }
}
