package com.jayden.junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DisabledMethodTests {

    @Disabled("Disabled until bug #42 has been resolved")
    @Test
    void testWillBeSkipped() {
    }

    @Test
    void testWillBeExecuted() {
        System.out.println("TestWillBeExecuted");
    }
}
