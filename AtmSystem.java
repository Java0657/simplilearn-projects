package com.oppsPractice;


import java.util.Scanner;

public class AtmSystem {

	public static void main(String[] args) {
		
		int bal=10000,deposite,withdraw;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			
			System.out.println("ATM SYSTEM");
			System.out.println("Press 1 For deposite");
			System.out.println("Press 2 For Withdraw");
			System.out.println("Press 3 For Cheak Balance");
			System.out.println("Press 4 For Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 :
				
				System.out.println("enter deposite amount");
				deposite = sc.nextInt();
				
				bal = bal+deposite;
				System.out.println("Total ammount = "+bal);
				
				break;
			case 2 :
				
				System.out.println("Please Enter the amoount to be withdraw :");
				withdraw = sc.nextInt();
				
				if(bal>=withdraw) {
					
					bal = bal-withdraw;
					
					System.out.println("Remaning Balance"+bal);
					
				}else {
					
				
					System.out.println("insufficent Fund");
					
					
				}
             break;
				
             
			case 3 :
				System.out.println("Your Balance is"+bal);
             break;
             
			case 4 :
				 
					
				System.exit(0);
				
			}
			
			

			
		}
		
		
	}
		
	}
