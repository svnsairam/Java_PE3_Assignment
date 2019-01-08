package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOfPlacesTest {

    ArrayOfPlaces   arrayOfPlaces;
    @Before
    public void setUp() throws Exception {
        arrayOfPlaces   =   new ArrayOfPlaces();
    }

    @After
    public void tearDown() throws Exception {
        arrayOfPlaces   =   null;
    }

    @Test
    public void arrayOfPlacesSuccess() {
        String  expectedValue    =   "bnglr hydrbd dlh Nv Mmb ";
        String  places[]         =   {"bangalore","hyderabad","delhi","Navi Mumbai"};
        String  actualValue      =    arrayOfPlaces.arrayOfPlaces(places);

        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void arrayOfPlacesFailure() {
        String  expectedValue    =   "bnglr new dlh Nv Mmb ";
        String  places[]         =   {"bangalore","hyderabad","delhi","Navi Mumbai"};
        String  actualValue      =    arrayOfPlaces.arrayOfPlaces(places);

        Assert.assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void arrayOfPlacesInvalidString() {
        String  expectedValue    =   "Invalid places name";
        String  places[]         =   {"bangalore","hyderabad","02delhi","Navi Mumbai"};
        String  actualValue      =    arrayOfPlaces.arrayOfPlaces(places);

        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void arrayOfPlacesNull() {
        String  expectedValue    =   "Null input is not expected";
        String  places[]         =   null;
        String  actualValue      =    arrayOfPlaces.arrayOfPlaces(places);

        Assert.assertEquals(expectedValue,actualValue);
        Assert.assertNotNull(actualValue);
    }



}