package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks studentMarks;
    final String noOfStudents = "5";
    final String grades[] = {"10", "60", "60", "54", "67"};

    @org.junit.Before
    public void setUp() throws Exception {
        studentMarks = new StudentMarks();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        studentMarks = null;
    }

    @Test
    public void setStudentMarksSuccess() {
        String expectedValue = "10 60 60 54 67 ";
        String actualValue = studentMarks.studentMarks(noOfStudents, grades);

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setStudentMarksFailure() {
        String expectedValue = "10 70 60 54 67 ";
        String actualValue = studentMarks.studentMarks(noOfStudents, grades);

        Assert.assertNotEquals(expectedValue, actualValue);
    }


}