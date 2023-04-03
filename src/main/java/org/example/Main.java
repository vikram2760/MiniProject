package org.example;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main
{

    //private static final Calculator.logger Calculator.logger = LogManager.getCalculator.logger(Calculator.class);
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        Calculator.logger.entry();
        System.out.println("Calculator Opened");
        System.out.println("Select the required operation by entering the corresponding number");
        System.out.println("1. Square root function - √x");
        System.out.println("2. Factorial function - x!");
        System.out.println("3. Natural logarithm (base е) - ln(x)");
        System.out.println("4. Power function - x^" + "b");
        System.out.println("Enter the choice : ");
        int choice = sc.nextInt();

        if (choice == 1)
        {
            System.out.println("Square root function - √x");
            System.out.println("Enter the value of n : ");
            double n = sc.nextDouble();
            double ans = calc.root(n);
            if (Double.isNaN(ans))
            {
                System.out.println("Invalid input, Please Try again");
                Calculator.logger.error("Invalid input, Entered input is not of the expected type");

                return;
            }
            System.out.println("Result = " + ans);
        }

        else if(choice==2)
        {
            System.out.println("Factorial function - x!");
            System.out.println("Enter the value n : ");
            int n=sc.nextInt();
            double ans=calc.factorial(n);
            if(Double.isNaN(ans))
            {
                System.out.println("Invalid input, Please Try again");
                Calculator.logger.error("Invalid input, Entered input is not of the expected type");

                return;
            }
            System.out.println("Result is : "+ ans);
        }
        else if(choice==3)
        {
            System.out.println("Natural logarithm (base е) - ln(x)");
            System.out.println("Enter the value of n : ");
            double n=sc.nextDouble();
            double ans=calc.log(n);
            System.out.println("Invalid input, Please Try again");

            if(Double.isNaN(ans))
            {
                return;
            }
            System.out.println("Result: "+ ans);
        }
        else if(choice==4)
        {
            System.out.println("Power function - x^"+ "b");
            System.out.println("Enter the value a & b (with space between them) : ");
            double n1=sc.nextDouble();
            double n2=sc.nextDouble();
            double ans=calc.power(n1,n2);
//			if(ans.isNaN()) {
//				System.out.println("Invalid input, Please Try again");
//				return;
//			}
            System.out.println("Result is : "+ ans);
        }
        else
        {
            System.out.println("Invalid input, Please Try again");

        }

    }
}
