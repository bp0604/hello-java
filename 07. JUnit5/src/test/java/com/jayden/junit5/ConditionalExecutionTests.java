package com.jayden.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.*;
import static org.junit.jupiter.api.condition.OS.WINDOWS;

class ConditionalExecutionTests {

    // operating system conditions
    @Test
    @EnabledOnOs(OS.MAC)
    void onlyOnMacOs() {
    }

    @Test
    @EnabledOnOs(WINDOWS)
    void onlyOnWindows() {
    }

    @TestOnMac
    void testOnMac() {
    }

    // java runtime environment conditions
    @Test
    @EnabledOnJre(JAVA_8)
    void onlyOnJava8() {
    }

    @Test
    @EnabledOnJre({JAVA_9, JAVA_10, JAVA_11})
    void onJava9Or10or11() {
    }

    @Test
    @EnabledForJreRange(min = JAVA_8, max = JAVA_11)
    void fromJava8to11() {
    }

    // system property conditions
    @Test
    @DisabledIfSystemProperty(named = "ci-server", matches = "true")
    void notOnCiServer() {
    }

    // environment variable conditions
    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "staging-server")
    void onlyOnStagingServer() {
    }
}
