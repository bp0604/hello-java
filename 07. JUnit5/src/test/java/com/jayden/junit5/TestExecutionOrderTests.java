package com.jayden.junit5;

import org.junit.jupiter.api.*;

/**
 * MethodOrderer.Alphanumeric.class
 * MethodOrderer.OrderAnnotation.class
 * MethodOrderer.Random.class
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestExecutionOrderTests {

    @DisplayName("첫번째 테스트")
    @Test
    @Order(1)
    void nullValues() {
        // perform assertions against null values
    }

    @DisplayName("두번째 테스트")
    @Test
    @Order(2)
    void emptyValues() throws InterruptedException {
        Thread.sleep(1000);
        // perform assertions against empty values
    }

    @DisplayName("세번째 테스트")
    @Test
    @Order(3)
    void validValues() {
        // perform assertions against valid values
    }
}
