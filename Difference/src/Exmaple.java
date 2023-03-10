import java.util.Scanner;

public class Exmaple {

	public static void main(String[] args) {
	int x;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number :");
	x= sc.nextInt();
	if(x>0)
		System.out.println("positive Number:"+x);
	else
		System.out.println("Negative Number:"+x);
	if(x%2==0)
		System.out.println("Even Number:"+x);
	else
		System.out.println("Odd Number:"+x);
	

	}

}
