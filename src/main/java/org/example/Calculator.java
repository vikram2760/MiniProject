package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;
public class Calculator
{
    public static final Logger logger = LogManager.getLogger(Calculator.class);
    public double root(double n)
    {
        logger.info("[ROOT] - " + n);
        if (n < 0)
        {
            return Double.NaN;
        }

        double ans;
        ans = Math.sqrt(n);
        logger.info("[RESULT - ROOT] - " + ans);
        return ans;
    }
    public double factorial (int n)
    {
        logger.info("[FACTORIAL] - " + n);
        if(n<0)
        {
            return Double.NaN;
        }
        int ans=1;
        for(int i=1;i<n+1;i++) {
            ans*=i;
        }
        logger.info("[RESULT - FACTORIAL] - " + ans);
        return ans;
    }
    public double log(double n)
    {
        logger.info("[LOG] - " + n);
        double ans;
        ans = Math.log(n);
        logger.info("[RESULT - LOG] - " + ans);
        return ans;
    }
    public double power (double n1,double n2)
    {
        logger.info("[POW] - " + n1+"-"+n2);
        double ans;
        ans = Math.pow(n1,n2);
        logger.info("[RESULT - POW] - " + ans);
        return ans;
    }
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//    	logger.entry();
//        System.out.println("Calculator Opened");
//        System.out.println("Select the required operation by entering the corresponding number");
//        System.out.println("1. Square root function - √x");
//        System.out.println("2. Factorial function - x!");
//        System.out.println("3. Natural logarithm (base е) - ln(x)");
//        System.out.println("4. Power function - x^" + "b");
//        System.out.println("Enter the choice : ");
//        int choice = sc.nextInt();
//
//        if (choice == 1)
//        {
//            System.out.println("Square root function - √x");
//            System.out.println("Enter the value of n : ");
//            double n = sc.nextDouble();
//            double ans = root(n);
//            if (Double.isNaN(ans))
//            {
//                System.out.println("Invalid input, Please Try again");
//                //logger.error("Invalid input, Entered input is not of the expected type");
//
//                return;
//            }
//            System.out.println("Result is : " + ans);
//        }
//
//        else if(choice==2)
//        {
//            System.out.println("Factorial function - x!");
//            System.out.println("Enter the value n : ");
//            int n=sc.nextInt();
//            double ans=factorial(n);
//            if(Double.isNaN(ans)) {
//                System.out.println("Invalid input, Please Try again");
//                //logger.error("Invalid input, Entered input is not of the expected type");
//
//                return;
//            }
//            System.out.println("Result is : "+ ans);
//        }
//        else if(choice==3)
//        {
//            System.out.println("Natural logarithm (base е) - ln(x)");
//            System.out.println("Enter the value of n : ");
//            double n=sc.nextDouble();
//            double ans=log(n);
//            System.out.println("Invalid input, Please Try again");
//
//            if(Double.isNaN(ans))
//            {
//				return;
//			}
//            System.out.println("Result: "+ ans);
//        }
//        else if(choice==4)
//        {
//            System.out.println("Power function - x^"+ "b");
//            System.out.println("Enter the value a & b (with space between them) : ");
//            double n1=sc.nextDouble();
//            double n2=sc.nextDouble();
//            double ans=power(n1,n2);
//			if(ans.isNaN()) {
//				System.out.println("Invalid input, Please Try again");
//				return;
//			}
//            System.out.println("Result is : "+ ans);
//        }
//        else
//        {
//            System.out.println("Invalid input, Please Try again");
//
//        }
//
//    }
}