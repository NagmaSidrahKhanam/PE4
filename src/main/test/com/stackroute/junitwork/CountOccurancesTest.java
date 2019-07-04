package com.stackroute.junitwork;

import static org.junit.Assert.*;
import org.junit.*;

public class CountOccurancesTest {
CountOccurances obj = new CountOccurances();
    @Before
    public void setUp() throws Exception {


        CountOccurances obj= new CountOccurances();

    }

    @After
    public void tearDown()  {

    }


    @Test

        public void characterCount() {
            int expected=1;
            int actual=obj.characterCount("Hello how are you",'a');
            assertEquals(expected,actual);
        }

    @Test
    public void characterCountFailure() {
        int expected=4;
        int actual=obj.characterCount("Hello how are you",'h');
        assertNotEquals(expected,actual);
    }

    @Test
    public void characterCountNotNull() {
        int actual=obj.characterCount("Hello how are you",'J');
        assertNotNull(actual);
    }
    @Test
    public void characterCountNull() {
        int actual=obj.characterCount("Hello how are you",' ');
        assertNotNull(actual);
    }
    @Test
    public void characterCountis() {
        int expected=3;

        int actual=obj.characterCount("Hello how are you",' ');
        assertEquals(expected,actual);
    }



}