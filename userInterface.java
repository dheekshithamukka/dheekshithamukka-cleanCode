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
  	  
  	  out.print("\nHouse construction");
  	  
  	  out.print("\nEnter Total area \nStandard(1-standard 2-above standard 3-high-standard)\n");
  	  double total_area=sc.nextDouble();
  	  int standard=sc.nextInt();
  	  out.print("\nDo you want a fully automated home??\n if yes press 1 else 0");
  	  int press=sc.nextInt();
  	  boolean fully_automated_home=press==1?true:false;
  	  
  	  construct_cost cc=new construct_cost(total_area,standard,fully_automated_home);
  	  out.print("\nConstruction cost of home is:"+cc.estimate());
  	  
  	  sc.close();
    }
}
