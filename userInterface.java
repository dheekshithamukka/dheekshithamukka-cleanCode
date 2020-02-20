package com.epam.cleancode;
import java.io.PrintStream;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

public class userInterface {

    public static void main(String args[])
    {
  	  Scanner sc=new Scanner(System.in);
  	  PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
  	  int principal;
  	  double interest;
  	  int number;
  	  int time;
  	  out.print("SIMPLE AND COMPOUND INTEREST");
  	  out.print("\nEnter principal amount:");
  	  principal=sc.nextInt();
  	  out.print("\nEnter rate of interest:");
  	  interest=sc.nextDouble();
  	  out.print("\nEnter time in years:");
  	  time=sc.nextInt();
  	  out.print("\nEnter no. of times interest applied");
  	  number=sc.nextInt();
  	  Interest myInterest=new Interest();
  	  double simpleValue=myInterest.SimpleInterest(principal, interest, time);
  	  out.print("\nSimple interest"+simpleValue);
  	  double compoundvalue=myInterest.CompoundInterest(principal, interest, time, number);
  	  out.print("\ncompound interest"+compoundvalue);
    } 	  
}
