package Strings;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        String str = "abcd";
     for(int i=0;i<=3;i++)
     {
         for(int j=i+1;j<=4;j++)
         {
             System.out.println(str.substring(i,j)+" ");
         }
     }
    }
}
// Given a string S , print all the substring of s
//input:"abcd"  output:a,ab,abc,abcd,b,bc,bcd,cd,d

