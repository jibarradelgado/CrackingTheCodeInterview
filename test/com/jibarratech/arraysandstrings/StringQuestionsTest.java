package com.jibarratech.arraysandstrings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Jorge on 2016-01-23.
 */
public class StringQuestionsTest {

    @Test
    public void testUniqueCharacters(){
        String test1 = "aaabbb";
        assertFalse(StringQuestions.UniqueCharacters(test1));
        String test2 = "ab";
        assertTrue(StringQuestions.UniqueCharacters(test2));
        String test3 = "";
        assertTrue(StringQuestions.UniqueCharacters(test3));
    }

    @Test
    public void testReverse(){
        String test1 = "aabb";
        assertEquals("bbaa", StringQuestions.reverse(test1));
    }

    @Test
    public void testIsPermutation(){
        String test1_1 = "amor";
        String test1_2 = "mora";
        assertEquals(true, StringQuestions.isPermutation(test1_1, test1_2));
    }

    @Test
    public void testReplace(){
        char[] test1 = "Mr John Smith    ".toCharArray();
        assertEquals(Arrays.toString("Mr%20John%20Smith".toCharArray()), Arrays.toString(StringQuestions.replace(test1)));
    }

    @Test
    public void testCompress(){
        String test1 = "aabcccccaaa";
        assertEquals("a2b1c5a3", StringQuestions.compress(test1));

        String test2 = "abcd";
        assertEquals("abcd", StringQuestions.compress(test2));

        String test3 = "aabccccca";
        assertEquals("a2b1c5a1", StringQuestions.compress(test3));
    }




}