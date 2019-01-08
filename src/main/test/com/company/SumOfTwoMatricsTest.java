package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfTwoMatricsTest {

    SumOfTwoMatrics    sumOfTwoMatrics;

    @org.junit.Before
    public void setUp() throws Exception {
        sumOfTwoMatrics    =   new SumOfTwoMatrics();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        sumOfTwoMatrics    =   null;
    }

}