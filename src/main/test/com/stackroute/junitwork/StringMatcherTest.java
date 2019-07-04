package com.stackroute.junitwork;

import org.junit.After;
import org.junit.Before;
import org.junit.*;
import static org.junit.Assert.*;

public class StringMatcherTest {
    StringMatcher obj= new StringMatcher();
    @Before
    public void setUp() throws Exception {


        CountOccurances obj= new CountOccurances();

    }

    @After
    public void tearDown()  {

    }

    @Test
    public void matching() {
        String expected="Found at: 4 - 6\n" +
                "Found at: 10 - 12\n" +
                "Found at: 27 - 29";
        String actual=obj.matching("She sells seashells by the seashore","se");
        assertEquals(expected,actual);
    }

    @Test
    public void matchingNotNull() {
        String actual=obj.matching("She sells seashells by the seashore","se");
        assertNotNull(actual);
    }

}