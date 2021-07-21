package com.cristi.simple.spring.simplespring.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void emptyStringShouldOutputZero() {
        int result = StringCalculator.add("");
        Assertions.assertThat(result).isZero();
    }

    @Test
    void oneNumberStringShouldOutputTheNumber() {
        int result = StringCalculator.add("1");
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void twoNumbersStringShouldOutputTheirSum() {
        int result = StringCalculator.add("1,2");
        Assertions.assertThat(result).isEqualTo(3);
    }
    @Test
    void nNumbersStringShouldOutputTheirSum() {
        int result = StringCalculator.add("1,2,3,4");
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    void shouldAcceptNewLineSeparatorTogetherWithComma() {
        int result = StringCalculator.add("1,2\n3");
        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    void shouldAcceptNewDelimiter() {
        int result = StringCalculator.add("//;\n1;2");
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void negativeNumbersShouldNotBeAllowed() {
        IllegalStateException illegalStateException = assertThrows(
                IllegalStateException.class,
                () -> StringCalculator.add("-1,-2")
        );

        Assertions.assertThat(illegalStateException).hasMessage("negatives not allowed: -1,-2");
    }
}