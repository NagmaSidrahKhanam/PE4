package com.stackroute.junitwork;

import org.junit.After;
import org.junit.Before;
import org.junit.*;
import static org.junit.Assert.*;

public class TransposeTest {
    Transpose obj = new Transpose();
    @Before
    public void setUp() throws Exception {


        CountOccurances obj= new CountOccurances();

    }

    @After
    public void tearDown()  {

    }

    @Test
    public void transpose() {
        String expected="a kciuq nworb xof spmuj revo eht yzal god";
        String actual=obj.transpose("a quick brown fox jumps over the lazy dog");
        assertEquals(expected,actual);
    }

    @Test
    public void transposeNull() {

        String actual=obj.transpose(null);
        assertNull(actual);
    }

    @Test
    public void transposeNotNull() {

        String actual=obj.transpose("a quick brown fox jumps over the lazy dog");
        assertNotNull(actual);
    }


}