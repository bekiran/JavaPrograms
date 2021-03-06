package com.brigelabz.utility;

import java.util.Scanner;

public class Utility 
{	
	static Scanner sc1=new Scanner(System.in);
	
	public static int inputInteger()
	{
		return sc1.nextInt();
	}
	
	
//---------------------------------------------------------------------------------------------------------------------------
	
	// 1. String Replace
	
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
		
//----------------------------------------------------------------------------------------
		
	// 2. Flip coins to find number of head and tail
		
	public  int headOrTailCoin()
	{
		long head = 0, tail = 0;
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
				System.out.println("Occurance of head is "+i);
				headcount=headcount+1;
			}
		}
		
		System.out.println("Head Count = "+headcount);
		System.out.println("Tail count = "+tailcount);
		int tailPercent=(tailcount/n);
		int headPercent=(headcount/n);
		System.out.println("Percentage of head vs tail: "+headPercent+":"+tailPercent);
		
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

//--------------------------------------------------------------------------------------------------------
	
	// 3. Leap year
	
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
	
//---------------------------------------------------------------------------------------------------------
	
	// 4. power of 2 
	
	public static void powerOfTwo(int num)
	{
		//int n = 8;
		 
        int i = 1;
        int power = 1;
		System.out.println("Powers of 2 that are less than 2^"+num);
        while (i <= num)
        {	 
            
            System.out.println("2^"+i+" = " + power);
            power = power * 2;
            i++;
        }
		
	}
	
//---------------------------------------------------------------------------------------------------------
	
	// 5. harmonic program
	
	public static void Harmonic(int N)
	{	double result=0.0; 
		//int i=1;
		while(N>0)
		{
		result=result+(double) 1/N;	
		N--;
		System.out.println("result: "+result);
		}
		System.out.println("The result of harmonic series is: "+result);
	}
	
//--------------------------------------------------------------------------------------------------------
	
	// 6. Factor
	
	public static void Factor(int N)
	{
		while(N%2==0)
		{
			System.out.print(2+" ");
			N/=2;
		}
		for(int i=3;i<Math.sqrt(N);i+=2)
		{
			while(N%i==0)
			{
				System.out.print(i+" ");
				N/=i;
			}
		}
		if(N>2)
		{
			System.out.print(N+" ");
		}
	}

//---------------------------------------------------------------------------------------------------------------------

	// 7. gambler
	
	public static void gambler(int stake, int trails, int target)
	{
		int win=0, loss=0;
		
		for(int i =0; i<trails;i++) 
		{
			while(stake>0 && stake<target && trails>0)
			{
				if(Math.random()>0.5)
				{
					stake++;
					win++;
					trails--;
				}
				else
				{
					stake--;
					loss++;
					trails--;
				}
			}
		}
		double percentwin = (win*100)/(win+loss);
		double percentloss= (loss*100)/(win+loss);
		
		System.out.println("The Player won = "+win);
		System.out.println("The player lost = "+loss);
		System.out.println("Percentage of win is "+percentwin+"%");
		System.out.println("Percentage of loss is "+percentloss+"%");
	}
}



