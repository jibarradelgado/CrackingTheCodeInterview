package com.jibarratech.arraysandstrings;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Jorge on 2016-01-23.
 */
public class StringQuestions {

    /**
     * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional
     * data structures?
     * @param inValue
     * @return
     */
    public static boolean UniqueCharacters(String inValue){

        for(int i=0; i < inValue.length(); i++){
            if(inValue.indexOf(inValue.charAt(i)) != inValue.lastIndexOf(inValue.charAt(i))){
                return false;
            }
        }

        return true;
    }

    /**
     * Implement a function void reverse which reverses a null-terminated string
     */
    public static String reverse(String inValue){

        StringBuilder result = new StringBuilder();

        for(int i = inValue.length() - 1; i >= 0 ; i--){
            result.append(inValue.charAt(i));
        }

        return result.toString();
    }

    /**
     * Given two strings, write a method to decide if one is a permutation of the other.
     */
    public static boolean isPermutation(String inValue1, String inValue2){
        char[] chars1 = inValue1.toCharArray();
        char[] chars2 = inValue2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (chars1.length != chars2.length){
            return false;
        } else {
            for (int i = 0; i < chars1.length; i++){
                if(chars1[i] != chars2[i]){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Write a method to replace all spaces in a string with '%20'. You may assume that
     * the string has sufficient space at the end of the string to hold the additional
     * characters, and that you are given "true" length of the string. (Note: if imple-
     * menting in JAVA, please use a character array so that you can perform this opera-
     * tion in place.)
     * EXAMPLE
     * Input: "Mr John Smith    "
     * Output: "Mr%20John%20Smith"
     */
    public static char[] replace(char[] test1) {
        char[] result = new char[test1.length];
        int count = 0;

        for(int i=0; i < test1.length; i++){
            if(test1[i] != ' '){
                result[count] = test1[i];
                count++;
            } else {
                result[count] = '%';
                result[count + 1] = '2';
                result[count + 2] = '0';
                count += 3;
            }

            if(count >= test1.length){
                break;
            }
        }

        return result;
    }

    /**
     * Implement a method to perform a basic string compression using the counts of
     * repeated characters. For example, the string aabcccccaaa would become
     * a2b1c5a3. If the "compressed" string would not become smaller than the original
     * string, your method should return the original string
     */
    public static String compress(String test1) {
        int sizeString = test1.length();
        int sizeCompress;
        StringBuilder result = new StringBuilder();

        if(test1.isEmpty()) {
            return "";
        }

        result.append(test1.charAt(0));
        sizeCompress = 1;

        for(int i=1 ; i < sizeString ; i++){
            //augmenting the number of occurrences
            if(result.charAt(result.length() - 1) == test1.charAt(i)){
                sizeCompress++;
            }
            //put the compress size
            //put the new letter
            //reset the counter
            else {
                result.append(sizeCompress);
                result.append(test1.charAt(i));
                sizeCompress = 1;
            }

            if(i + 1 == sizeString) {
                result.append(sizeCompress);
            }
        }

        if(result.length() > test1.length()) {
            return test1;
        } else {
            return result.toString();
        }
    }


    /**
     * Given an image represented by an NxN matrix, where each pixel in the image is
     * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
     * place?
     */
    public void rotate(int[][] matrix, int n){
        for (int layer = 0; layer < n / 2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; ++i){
                int offset = i - first;
                //save top
                int top = matrix[first][i];

                //left -> top
                matrix[first][i] = matrix[last - offset][first];

                //bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                //right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                //top -> right
                matrix[i][last] = top;
            }
        }
    }

    /**
     * Write an algorithm such that if an element in an MxN matrix is 0, its entire row
     * and column are set to 0.
     */
    public void setZeros(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    /**
     * Assume you have a method isSubstring which checks if one word is a substring
     * of another. Given two strings, s1 and s2, write code to check if s2 is a
     * rotation of s1 using only one call to isSubstring (e.g. "watterbottle" is a
     * rotation of "erbottlewat").
     */
    public boolean isRotation(String s1, String s2) {
        int len = s1.length();

        if(len == s2.length() && len > 0) {
            String s1s1 = s1 + s1;
            //return isSubstring(s1s1, s2);
        }
        return false;
    }

}
