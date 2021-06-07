package pack1;
import java.util.Scanner;
public class factorialdemo {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		int factorial = fact(num);
		System.out.println("Factorial of entered number is: "+factorial);
		}
		static int fact(int num)
		{
		int output;
		if(num==1){
		return 1;
		}
		output = fact(num-1)* num;
		return output;
		}
		

}
