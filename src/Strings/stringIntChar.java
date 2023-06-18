package Strings;
import java.util.*;
public class stringIntChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="abc";
      //  str=str + "def";
       str += "def";
        str += 'r';// this will be converted into the string the it will be concatinated
        str += 10;// this will be firstly converted into the string
        System.out.println(str);
        System.out.println("anjali"+"kumari");
    }
}
