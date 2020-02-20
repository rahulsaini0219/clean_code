package com.epam;
import java.io.*;
import java.util.*;
public class Construction 
{
	static
	{
		Scanner sc = new Scanner(System.in);
		PrintStream t = new PrintStream(new FileOutputStream(FileDescriptor.out));
		t.print("Options:\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High Standard Material with Fully Automated Home\n");
		t.print("Choose one of the above option:\n");
		int material = sc.nextInt(),area;
		switch(material)
		{
			case 1:
				t.print("Enter the total area of house you want:\n");
				area = sc.nextInt();
				t.print("Cost of the house is:\n"+area*1200+"INR");
				break;

			case 2:
				t.print("Enter the total area of house you want:\n");
				area = sc.nextInt();
				t.print("Cost of the house is:\n"+area*1500+"INR");
				break;
				
			case 3:
				t.print("Enter the total area of house you want:\n");
				area = sc.nextInt();
				t.print("Cost of the house is:\n"+area*1800+"INR");
				break;
			
			case 4:
				t.print("Enter the total area of house you want:\n");
				area = sc.nextInt();
				t.print("Cost of the house is:\n"+area*2500+"INR");
				break;
				
			default:
				t.print("Select a valid option");
				
		}
		
	}
	public static void main(String[] args)
	{
		
	}
}
