package Epam.CalculatorApplication;
import java.util.*;
public class Calculator
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
		int firstNumber,secondNumber;
		System.out.print("Enter The First Number :");
		firstNumber =sc.nextInt();
		System.out.print("Enter The Second Number :");
		secondNumber =sc.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multipication\n4.Division");
		System.out.println("Enter The Operation that you want to perform");
		int n=sc.nextInt();
		switch(n) {
			case 1 :
					System.out.println(firstNumber + secondNumber);
					break;
			case 2: 
					System.out.println(firstNumber-secondNumber);
					break;
			case 3:
					System.out.println(firstNumber*secondNumber);
					break;
			case 4:System.out.println(firstNumber /(float)secondNumber);
			break;
			default:System.out.println("Enter Valid Operator");
					break;
		}
    }
}
