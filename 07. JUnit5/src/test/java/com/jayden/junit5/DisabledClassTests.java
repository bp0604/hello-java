package com.jayden.junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Disabled until bug #99 has been fixed")
class DisabledClassTests {

    @Test
    void testWillBeSkipped() {
    }
}
