package com.prolo.com.prolo;
import java.util.*;

public class Interest {
	private static Scanner sc;
	private static float principle;
	private static float time;
	private static float rate;
	private static float res;
	private static float res1;

	public static void main(String args[])
	{
		sc=new Scanner(System.in);
		
		System.out.println("enter principle amount");
		principle = sc.nextFloat();
		System.out.println("enter time period");
		time=sc.nextFloat();
		System.out.println("enter rate of interest");
		rate=sc.nextFloat();
		/*creating objects for class*/
		SICI obj=new SICI();
		res = obj.SimpleInterest(principle,time,rate);
		System.out.println("SimpleInterest="+res);
		res1 = obj.CompoundInterest(principle,time,rate);
		System.out.println("CompoundInterest="+res1);
		
	}
}
