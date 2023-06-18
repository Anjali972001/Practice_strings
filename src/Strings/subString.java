package Strings;

public class subString {
    public static void main(String[] args) {
        String str="abcde";
        // substring means the continuous part of a string.
        System.out.println(str.substring(0,2));// last index of the given range will be excluded
        System.out.println(str.substring(0));// all the string will be printed till last
    }
}
