package com.java;
import java.util.*;

	public class Calculator {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			System.out.println("Enter your Choice");
			System.out.println("1: +(Addition)");
			System.out.println("2: -(Substraction)");
			System.out.println("3: *(Multiplication)");
			System.out.println("4: /(Division)");
			System.out.println("5: %(Modular)");
			int Choice=sc.nextInt();
			
			int result=0;
			switch(Choice) {
			case 1:
				result=a+b;
				System.out.println("Addition is:" + result);
				break;
			case 2:
				result=a-b;
				System.out.println("Sub is:" + result);
				break;
			case 3:
				result=a*b;
				System.out.println("Multiplication is:" + result);
				break;
			case 4:
				if(b!=0) {
					result=a/b;
					System.out.println("Division is:" + result);
				}else {
					System.out.println("Error:0 is not allowed");
				}
				break;
			case 5:
				if(b!=0) {
					result=a%b;
					System.out.println("Modulor is:" + result);
				}else {
					System.out.println("Error:0 is not allowed");
				}
				break;
			default:
				System.out.println("Invalid operation");
			}
		}

	}
