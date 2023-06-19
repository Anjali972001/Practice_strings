package StringBuilders;

import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println(str);
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            boolean flag=true;// It is capital letter
            if(ch==' ') continue;
            int ascii=(int)ch;
            if(ascii>=97)
            {
               flag=false;// small letter
            }
            if(flag==true)
                {
                    ascii += 32;
                    char dh=(char)ascii;
                    str.setCharAt(i,dh);

                }
            else {
                ascii -=32;
                char dh=(char)ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);

    }
}
/*
Given the string and the task is to toggle all the characters of the string (convert upper case to lower case and the vice versa)

*/