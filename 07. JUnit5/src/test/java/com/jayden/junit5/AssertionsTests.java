package com.jayden.junit5;

import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class AssertionsTests {

    @Test
    void standardAssertions() {
        int number1 = 10;
        int number2 = 20;

        assertEquals(30, Math.addExact(number1, number2));
        assertEquals(200, Math.multiplyExact(number1, number2));

        assertTrue('a' < 'b', () -> "Assertion messages can be lazily evaluated -- "
                + "to avoid constructing complex messages unnecessarily.");
    }

    @Test
    void groupedAssertions() {
        Person person = new Person("Jane", "Tom");

        assertAll("person",
                () -> assertEquals("Jane", person.getFirstName()),
                () -> assertEquals("Doe", person.getLastName()) // fail assertion
        );
    }

    @Test
    void exceptionTesting() {
        Exception exception = assertThrows(ArithmeticException.class, () -> Math.floorDiv(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    void timeoutNotExceeded() {
        assertTimeout(ofMillis(100L), () -> {
            Thread.sleep(200L);
        });
    }
}
