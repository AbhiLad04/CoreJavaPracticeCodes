import java.io.*;
import java.util.*;


class Atm
{

  static short pin = 4444;
  static int CurrentBalance = 1000;

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("\n===== Welcome To Atm Banking System ===== \nPlease Enter Your Pin To Proceed :- ");
	short Pin = sc.nextShort();
	if (Pin == pin)
	{
	Menu();
	}
	else
	{
	System.out.print("\nInvalid Pin :)\n");
	}

	}


	public static void Menu()
	{

	Scanner sc1 = new Scanner(System.in);
	
	System.out.print("\nSelect the Operation to Perform : \n1.Deposit \n2.Withdrawal \n3.Check Balance \n4.Exit\n");
	System.out.print("Enter your Choice :- ");
	byte choice = sc1.nextByte();

	switch (choice)
	{

	case 1:
	Deposit();
	break;
	
	case 2:
	Withdrawal();
	break;

	case 3:
	CheckBalance();
	break;

	case 4:
	Exit();
	break;

	default :
	System.out.print("\nInvalid Choice.\n");

	}

	}




	public static void Deposit()
	{
	
	Scanner sc2 = new Scanner(System.in);

	System.out.print("\nEnter The Amount to Deposit :- ");
	int Amount = sc2.nextInt();
	CurrentBalance = CurrentBalance + Amount;
	System.out.print("\nDeposit Successfull");
	System.out.print("\nCurrent Balance After Deposit is :- " + CurrentBalance+"\n");

	}

	
	public static void Withdrawal()
	{
	
	Scanner sc3 = new Scanner(System.in);
	System.out.print("\nEnter the Amount to Withdraw :- ");
	int Amount = sc3.nextInt();
	if (Amount <= CurrentBalance)
	{
	CurrentBalance = CurrentBalance - Amount;
	System.out.print("\nWithdrawal Successfull");
	System.out.print("\nCurrent Balance After Withdrawal is :- " + CurrentBalance+"\n");
	}
	else
	{
	System.out.print("\nInsufficient Balance for Withdrawal\n");
	}

	}


	public static void CheckBalance()
	{

	System.out.print("\nYour Current Balance is :- " + CurrentBalance+"\n");

	}


	public static void Exit()
	{
	
	System.out.print("\nThank You for Choosing US :)\n");

	}
	
}