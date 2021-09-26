package Day1;

import java.util.Scanner;

public class StringClassPractice {
    public static void main(String[] args) {
        //string is just a char array -- string is an object
        //string is the most important class of Java
        //don't need to import it - comes by default with the lang package
        //string has around 13 constructors and more than 47 methods
        //string class is an immutable class - can't be changed
        //
        String str="hello";
        int length=str.length();
        System.out.println("Length: "+length);

        char ch=str.charAt(0); //h
        System.out.println(ch); //h
        char ch1=str.charAt(1); //e
        System.out.println(ch1); //e

        String str1="hello world";
        String str2="from ANDREA";
        //concatenating in one statement
        System.out.println(str1+" "+str2);
        //or String str3=str1+str2 then print

        //to lowercase and uppercase
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());

        //getting a string input from the user using Scanner
        Scanner input=new Scanner(System.in);
        String str4=input.nextLine();

        //substrings
        //String str5=input.nextLine(); INPUT: from ANDREA
        //String str6=str5.substring(5, str5.length());
        //System.out.println(str6); //ANDREA

        //obtaining substrings -- message.substring(beginIncluded, endsNOTIncluded);
        //user gives a time -- INPUT: 11:30 am
        //my purpose is to just get the hour from that time
        String hours=str4.substring(0,2);
        System.out.println(hours); //11

    }
}
