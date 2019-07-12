package com.stackroute.java;

public class StringChar {
    public static  void  main(String[]args)
    {
        char[] ch={'s','r','i','j','a','k','o','t','a','g','i','r','i'};
        String s1=" ";
        String s2="name";
        s1=s1.copyValueOf(ch);
        System.out.println("String:"+s1);
        s2=s2.copyValueOf(ch,3,8);
        System.out.println("String:"+s2);

    }
}

