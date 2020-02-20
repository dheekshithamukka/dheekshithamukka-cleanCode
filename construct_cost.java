package com.epam.cleancode;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class construct_cost {
	public static void evaluate_cost() {
	Scanner sc2= new Scanner(System.in);
	PrintStream pts=new PrintStream(new FileOutputStream(FileDescriptor.out));
	pts.println();
	pts.println("CONSTRUCTION COST ESTIMATION");
	pts.println();
	pts.println("Variants Available");
	pts.println("1. Construction with standard materials");
	pts.println("2. Construction with above standard materials");
	pts.println("3. Construction with high standard materials");
	pts.println("4. Construction with high standard materials and fully automated");
	pts.println("Enter your choice (1-4): ");
	try {
	int ch=sc2.nextInt();
	switch(ch)
	{
	case 1:
		pts.println("Enter the area of house: ");
		pts.println("Cost ="+sc2.nextDouble()*1200 +" INR");
		break;
	case 2:
		pts.println("Enter the area of house: ");
		pts.println("Cost ="+sc2.nextDouble()*1500 +" INR");
		break;
	case 3:
		pts.println("Enter the area of house: ");
		pts.println("Cost ="+sc2.nextDouble()*1800 +" INR");
		break;
	case 4:
		pts.println("Enter the area of house: ");
		pts.println("Cost ="+sc2.nextDouble()*2500 +" INR");
		break;
	default:
		pts.println("Enter a valid input ... ");
		
	
		
	}
	}
	
	catch (Exception e) {
	
		pts.println("Enter a valid input ... ");
		
	}
	sc2.close();
	
}
	public static void main(String args[]) {
		construct_cost.evaluate_cost(); 
	}
}
