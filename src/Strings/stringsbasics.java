package Strings;
import java.util.*;
public class stringsbasics {
    public static void main(String[] args) {
       // declaration of the string:
        String str="College Wallah";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        System.out.println(str);

        // length()
        String anjali="Hello";
        int len=anjali.length();
        System.out.println(len);

        // charAt()
        System.out.println(anjali.charAt(3));

        //indexOf()-- character is given ,and it ,return the index of first occurrence
        System.out.println(anjali.indexOf('e'));

        // compareTo()-- lexographically checked
        String str1="bnjali";
        String str2="cnjali";
        System.out.println(str1.compareTo(str2));

        // contains()---> returns true or false
        String hima="College Wallah";
        System.out.println(hima.contains("alla"));

        // startsWith()
        System.out.println(hima.startsWith("Colle"));

        // endsWith()
        System.out.println(hima.endsWith("aha"));

        //toLowerCase(),toUpperCase(),and concat()
        System.out.println(str1.concat(str2));





    }
}
