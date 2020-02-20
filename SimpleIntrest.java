package com.epam;
import java.io.*;
import java.util.*;

class SimpleIntrest 
{
	static 
	{
		Scanner sc = new Scanner(System.in);
		double amount,time,rate,si,ci;
		PrintStream t = new PrintStream(new FileOutputStream(FileDescriptor.out));
		t.print("Enter the amount:\n");
		amount = sc.nextDouble();
		t.print("Enter Number of Years:\n");
		time = sc.nextDouble();
		t.print("Enter the Rate of intrest:\n");
		rate = sc.nextDouble();
		si = (amount * time * rate)/100;
		ci = amount * Math.pow(1.0+rate/100,time);
		t.print("Simple Intrest:\n"+si);
		t.print("\n");
		t.print("Compound Intrest:\n"+ci);
	}
	public static void main(String[] args)
	{
		
	}
	
	
}