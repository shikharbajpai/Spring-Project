package org.example.services;

import org.junit.*;

public class CalculatorServiceTest {

    int counter = 0;

    // To execute/initialize code before running any test cases,
    // this is a class level method
    // a class-level method is a method that is associated with the class itself
    // rather than with instances of the class
    @BeforeClass
    public static void init() {
        System.out.println("Before all test cases");
        System.out.println("Started test.....");
    }

    // this will execute after all the cases are executed
    @AfterClass
    public static void cleanup() {
        System.out.println("after all test cases");
        System.out.println("test cases ended....");
    }

    // Executes the method before each test case
    @Before
    public void beforeEachTestCases() {
        System.out.println("Execute before each test cases");
        counter = 0;
    }

    // Executes the method after each test case
    @After
    public void afterEachTestCases() {
        System.out.println("Execute after each test cases");
    }

    // Test Method of addTwoNumbers
    // this is a class level method
    @Test
    public void addTwoNumbersTest() {
        for (int i = 0; i < 20; i++) {
            counter++;
        }
        System.out.println("test for addTwoNumbersTest");
        int actualResult = CalculatorService.addTwoNumbers(12, 45);
        int expectedResult = 57;
        System.out.println("The counter value in first test case is: " + counter);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumAnyNumberTest() {
        for (int i = 0; i < 10; i++) {
            counter++;
        }
        System.out.println("test case for sumAnyNumberTest");
        int actualResult = CalculatorService.sumAnyNumber(2, 7, 4, 7);
        int expectedResult = 20;
        System.out.println("The counter value in second test case is: " + counter);
        Assert.assertEquals(expectedResult, actualResult);
    }
}

