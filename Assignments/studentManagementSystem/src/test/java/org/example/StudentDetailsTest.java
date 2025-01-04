package org.example;

import org.junit.*;

public class StudentDetailsTest {
    StudentDetails studentDetails;

    @BeforeClass
    public static void beforeAllCases() {
        System.out.println("Executes one time before all test cases");
    }

    @AfterClass
    public static void afterAllCases() {
        System.out.println("Executes at the end of all test cases");
    }

    @Before
    public void setUp() {
        studentDetails = new StudentDetails(100, "John Doe", 12);
    }

    @After
    public void tearDown() {
        System.out.println("It executes after the end of every single test...");
    }

    @Test
    public void testGetId() {
        int expectedId = 100;
        int actualId = studentDetails.getId();
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void testSetId() {
        int expectedId = 2;
        studentDetails.setId(expectedId);
        int actualId = studentDetails.getId();
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void testGetStudentName() {
        String expectedStudentName = "John Doe";
        String actualStudentName = studentDetails.getStudentName();
        Assert.assertEquals(expectedStudentName, actualStudentName);
    }

    @Test
    public void testSetStudentName() {
        String expectedStudentName = "Jane Smith";
        studentDetails.setStudentName(expectedStudentName);
        String actualStudentName = studentDetails.getStudentName();
        Assert.assertEquals(expectedStudentName, actualStudentName);
    }

    @Test
    public void testGetStudentClass() {
        int expectedStudentClass = 12;
        int actualStudentClass = studentDetails.getStudentClass();
        Assert.assertEquals(expectedStudentClass, actualStudentClass);
    }

    @Test
    public void testSetStudentClass() {
        int expectedStudentClass = 10;
        studentDetails.setStudentClass(expectedStudentClass);
        int actualStudentClass = studentDetails.getStudentClass();
        Assert.assertEquals(expectedStudentClass, actualStudentClass);
    }

    @Test
    public void testTestToString() {
        String expectedToString = "{id=100, studentName='John Doe', studentClass='12'}\n";
        String actualToString = studentDetails.toString();
        Assert.assertEquals(expectedToString, actualToString);
    }
}