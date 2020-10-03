package com.jayden.junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TaggingTests {

    @Test
    @Tag("fast")
    void fastTesting() {
    }

    @Test
    @Tag("slow")
    void slowTesting() {
    }
}
