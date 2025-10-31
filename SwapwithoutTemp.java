import java.util.Scanner;

public class SwapwithoutTemp {

	public static void main(String[]  args){

/*	int a = 10;
	int b = 20;

	a = a+b;
	b = a-b;
	a = a-b;

	System.out.println("a = "+a+",b = "+b); 
*/

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter The Number A :- ");
	int a = sc.nextInt();

	System.out.println("Enter The Number B :- ");
	int b = sc.nextInt();

	System.out.println("A = "+a+", B = "+b);

	a = a+b;
	b = a-b;
	a = a-b;

	System.out.println("A = "+a+", B = "+b);



	}

}