package com.house.com.house;
import java.util.*;

public class HouseMain {
	private static Scanner sc;
	private static float totalArea;
	private static int ch;
	private static float automated_res;
	private static float above_res;
	private static float standard_res;
	private static float high_std_materials;
	
	

	public static void main(String args[])
	{
		/* function for calculating total house estimation cost*/
		recheck();
	}
		private static void recheck() {
		// TODO Auto-generated method stub
			sc=new Scanner(System.in);
			
			System.out.println("Enter total area of house");
			totalArea = sc.nextFloat();
			System.out.println("Do you want fully automated home if yes enter 1 orelse enter 0");
			ch=sc.nextInt();
			CostEstimation obj=new CostEstimation();
			if(ch==1)
			{
				automated_res = obj.automated_home(totalArea);
				System.out.println("Automated home cost estimation="+automated_res);
				System.out.println("Do you want to continue? if yes enter 1 else enter 0");
				{
					int y=sc.nextInt();
					if(y==1)
					{
						recheck();
					}
					else {
						System.out.println("Thank you!");
					}
					
				}
			}
			else
			{
				System.out.println("For standard materials enter:2\n"
						+ "For above standard materials enter:3\n"
						+ "For high standard materials enter:4");
				ch=sc.nextInt();
				if(ch==2)
				{
					
					standard_res =obj.cost_estimation(totalArea,1200);
					System.out.println("Standard materials cot estimation="+standard_res+"rs");
					System.out.println("Do you want to continue? if yes enter 1 else enter 0");
					{
						int y=sc.nextInt();
						if(y==1)
						{
							recheck();
						}
						else {
							System.out.println("Thank you!");
						}
						
					}
				}
				else if(ch==3)
				{
					above_res = obj.cost_estimation(totalArea,1500);
					System.out.println("Above standard cost estimation="+above_res+"rs");
					System.out.println("Do you want to continue? if yes enter 1 else enter 0");
					{
						int y=sc.nextInt();
						if(y==1)
						{
							recheck();
						}
						else {
							System.out.println("Thank you!");
						}
						
					}
				}
				else if(ch==4)
				{
					high_std_materials=obj.cost_estimation(totalArea,1800);
					System.out.println("high standard materials cost estimation="+high_std_materials+"rs");
					System.out.println("do you want to continue? if yes enter 1 else enter 0");
					{
						int y=sc.nextInt();
						if(y==1)
						{
							recheck();
						}
						else {
							System.out.println("Thank you!");
						}
						
					}
					
				}
			}
			}
		
		
	}
		
		
		
		
	



	


