package com.stackroute.junitwork;

import org.junit.After;
import org.junit.Before;
import org.junit.*;
import static org.junit.Assert.*;

public class SortTest {
    Sort obj = new Sort();
    @Before
    public void setUp() throws Exception {


        CountOccurances obj= new CountOccurances();

    }

    @After
    public void tearDown()  {

    }

    @Test
    public void sortWordsInParagraph() {
        String []expected="A, A, Though, a, a, a, an, any, are, by, consists, dealing, discourse, expected, formal, idea., in, is, language, longer, more, not, of, of, of, of, one, or, or, organize, paragraph, paragraph, paragraphs, part, particular, point, prose, required, self-contained, sentences., syntax, the, to, unit, used, usually, with, writing, writing".split("[\\s,]+");
        String []actual=obj.sortWordsInParagraph("A paragraph is a self-contained unit of a discourse in writing dealing with a particular point or idea. A paragraph consists of one or more sentences. Though not required by the syntax of any language, paragraphs are usually an expected part of formal writing, used to organize longer prose");
        assertArrayEquals(expected,actual);
    }
    @Test
    public void sortWordsInParagraphNull() {

        String []actual=obj.sortWordsInParagraph(null);
        assertNull(actual);
    }

    @Test
    public void sortWordsInParagraphNotNull() {

        String []actual=obj.sortWordsInParagraph("A paragraph is a self-contained unit of a discourse in writing dealing with a particular point or idea. A paragraph consists of one or more sentences. Though not required by the syntax of any language, paragraphs are usually an expected part of formal writing, used to organize longer prose");
        assertNotNull(actual);
    }

    @Test
    public void sortWordsIParagraph() {
        String []expected="ab cd ef ".split("[\\s,]+");
        String []actual=obj.sortWordsInParagraph("ef ab cd");
        assertArrayEquals(expected,actual);
    }
}