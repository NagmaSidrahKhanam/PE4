package com.stackroute.junitwork;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.*;

public class SearchNameTest {
    SearchName obj = new SearchName();
    @Before
    public void setUp() throws Exception {


        CountOccurances obj= new CountOccurances();

    }

    @After
    public void tearDown()  {

    }

    @Test
    public void searchname() {
        String expected="Is Harry here ? true";
        String actual=obj.searchHarry("This is Harry");
        assertEquals(expected,actual);
    }

    @Test
    public void searchnamedoesntexist() {
        String expected="Is Harry here ? false";
        String actual=obj.searchHarry("This is Henry");
        assertEquals(expected,actual);
    }

}