package com.aditya.banking;
import java.util.Scanner;
public class Login {
	//String username="Kiyan";
	//int password=9891;
	//Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Welcome to Sbi");
		System.out.println("Please Login via Credentials");
		String username="Kiyan";
		String password="9891";
		double balance= 1000;
		Scanner sc=new Scanner(System.in);
		 
	
		
		System.out.println("Enter Your Name");
		
		String Name =sc.nextLine();
		
		System.out.println("Enter Password:");
		
		String Pass =sc.nextLine();
		
		if (username.equals(Name) && password.equals(Pass))
			
		{	
			System.out.println("Login Succesfull");
			while(true)
			{	
				System.out.println("1.Withdraw");
				System.out.println("2.Deposit");
				System.out.println("3.Check Balance");
				System.out.println("4.Exit");
				
				System.out.println("Enter Your Choice");
				int choice = sc.nextInt();
				
				switch(choice) {	
				case 1:
					System.out.println("Enter Amount");
					double Withdrawl_amount=sc.nextDouble();
					if(Withdrawl_amount>0 && Withdrawl_amount<=balance) {	
						balance -= Withdrawl_amount;
						System.out.println("Withdrawl Succesfull");
					}
					break;
				case 2:
					System.out.println("Enter Amount for Deposit");
					double Depo_Amount= sc.nextDouble();
					if(Depo_Amount>0) {
						balance+=Depo_Amount;
						System.out.println("Amount Deposited Succesfully");
					}
					break;
				case 3:
					System.out.println("Your Current Balance Is:"+balance);
					break;
				case 4:
					System.out.println("You will be redirected to Home Page!!");
					break;
					
				}

			}
				
				
			
		}
		else
		{	
			System.out.println("Login Failed");
		}
		//sc.close();
		

	}

}
