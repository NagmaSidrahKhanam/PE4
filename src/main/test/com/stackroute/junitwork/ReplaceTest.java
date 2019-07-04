package com.stackroute.junitwork;

import static org.junit.Assert.*;
import org.junit.*;

public class ReplaceTest {
    Replace obj = new Replace();
    @Before
    public void setUp() throws Exception {


        CountOccurances obj= new CountOccurances();

    }

    @After
    public void tearDown()  {

    }

    @Test
    public void replaceCharacters() {
        String expexted="abcf ef";
        String actual=obj.replaceCharacters("abcd ef");
        assertEquals(expexted,actual);

    }

    @Test
    public void replaceCharactersl() {
        String expexted="ijkt efqt";
        String actual=obj.replaceCharacters("ijkl efqt");
        assertEquals(expexted,actual);

    }

    @Test
    public void replaceCharactersNull() {
        String actual=obj.replaceCharacters(null);
        assertNull(actual);

    }

    @Test
    public void replaceCharachterNotNull()
    {
        String actual=obj.replaceCharacters("  ");
        assertNotNull(actual);
    }

}