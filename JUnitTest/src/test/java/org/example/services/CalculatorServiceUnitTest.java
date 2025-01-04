package org.example.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceUnitTest {

    // Before all test cases to execute
    @BeforeAll
    public static void init() {
        System.out.println("Before executing other test cases...");
    }

    // After all, test cases are executed
    @AfterAll
    public static void cleanup() {
        System.out.println("After executing all other test cases...");
    }

    // Executes before each test case
    @BeforeEach
    public void beforeEachTestCase() {
        System.out.println("Execute Before Each test case!!!");
    }

    //Executes after each test case
    @AfterEach
    public void afterEachTestCase() {
        System.out.println("After Each test case!!!");
    }

    @Test
    @DisplayName("Adding two integer numbers")
    public void addTwoNumbersTest() {
        System.out.println("Executing first test case");
        int actualResult = CalculatorService.addTwoNumbers(12, 12);
        int expectedResult = 24;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Disabled
    public void sumAnyNumberTest() {
        System.out.println("Executing second test case");
        int actualResult = CalculatorService.sumAnyNumber(1, 2, 3);
        int expectedResult = 6;
        Assertions.assertEquals(expectedResult, actualResult);


    }
}
