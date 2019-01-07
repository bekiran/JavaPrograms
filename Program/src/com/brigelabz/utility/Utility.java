package com.brigelabz.utility;

import java.util.Scanner;

public class Utility 
{	
	Scanner sc1=new Scanner(System.in);
	
		public void stringReplace() 
		{
			String template="Hello <<Username>>, how are you?";
			System.out.println("Enter user name");
			String name=sc1.next();
			
			if(name.length()<3)
			{
				stringReplace();
				name=sc1.next();	
			}
		
			String str = template.replaceAll("<<Username>>", name);
		
			System.out.println(str);
			
		}
		
	// Flip coins to find number of head and tail
		
	public  int headOrTailCoin()
	{
		long head=0, tail =0;
		int headcount = 0, tailcount = 0;
		
		System.out.println("Enter number of times you wish to filp the coin");
		int n=sc1.nextInt();
		
		if(n<0)
		{
			System.out.println("Please enter valid number");
			n=sc1.nextInt();
			headOrTailCoin();
		}
		for(int i=0;i<n;i++)
		{
			double random = Math.random();
			if(random<0.5)
			{
				System.out.println("Occurance of tail is "+i);
				tailcount=tailcount+1;
			}
			else
			{
				System.out.println("Occurance of tail is "+i);
				headcount=headcount+1;
			}
		}
		
		System.out.println("Head Count = "+headcount);
		System.out.println("Tail count = "+tailcount);
		
		
		if(headcount>tailcount)
		{
			System.out.println("Head count is Greater");
		}
		else
		{
			System.out.println("Tail count is Greater");
		}
		return n;
	}
	
	//Leap year
	
	public  void leapFind(int year)
	{
		if(String.valueOf(year).length()<4)
		{
			System.out.println("Please enter year in 4 digit formate");
			year=sc1.nextInt();
			leapFind(year);
		}
		if(((year%4==0) && (year%100==0)) || (year%400==0))
		{
			System.out.println(year+" is Leap Year");
		}
		else
		{
			System.out.println(year+" is not Leap Year");
		}
	}
}


