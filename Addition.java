import java.util.Scanner;

public class Addition {


	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number A :- ");
	int a = sc.nextInt();
	System.out.println("Enter the number B :- ");
	int b = sc.nextInt();

	Addition A = new Addition();

	int result = A.addOperation(a,b);
	System.out.println("The Addition of A & B is :- "+result);
	
	}

	public int addOperation(int a,int b){

	return a+b;
	} 



}