package com.jayden.junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * TestInstance.Lifecycle.PER_CLASS: 클래스마다 인스턴스 생성
 * TestInstance.Lifecycle.PER_METHOD: 메서드마다 인스턴스 생성 (기본 전략)
 */
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class TestInstanceLifeCycleTests {

    @BeforeAll
    void beforeAll() {
        System.out.println("BeforeAll");
    }

    @Test
    void test() {
        System.out.println("Test");
    }

    @AfterAll
    void afterAll() {
        System.out.println("AfterAll");
    }
}
