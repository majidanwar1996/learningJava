package org.majid;
import java.io.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException
    {
	// write your code here
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);
        System.out.println("Enter Your Name : ");
        String s1;
        s1 = read.readLine();
        System.out.println("My name is : "+s1);
    }
}
