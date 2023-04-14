package com.itphutran.demo;
package fa.training.main;

import java.util.Scanner;

public class SolEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		do {
			System.out.println("Select your option \n 1. Solve first-degree equation \n 2. Solve system of first-degree equations with 2 variables \n 3.Solve the second-degree equation with one variable \n 4. Exit");
			int selec = input.nextInt();
			switch (selec) {
			case 1:
				Scanner in = new Scanner(System.in);
                        System.out.print("Input the value of a: ");
                        int firstInt = in.nextInt();
                        System.out.print("Input the value of b: ");
                        int secondInt = in.nextInt();
                        System.out.printf("The value of X is: %f \n", (float) (0 - secondInt) / firstInt);
				break;
			case 2:
                        Scanner inp = new Scanner(System.in);
                        System.out.print("Input the value of a in first equation ax1 + bx2 = e: ");
                        int a = inp.nextInt();
                        System.out.print("Input the value of b in first equation ax1 + bx2 = e: ");
                        int b = inp.nextInt();
                        System.out.print("Input the value of e in first equation ax1 + bx2 = e: ");
                        int e = inp.nextInt();
                        System.out.print("Input the value of c in second equation cx1 + dx2 = f: ");
                        int c = inp.nextInt();
                        System.out.print("Input the value of d in second equation cx1 + dx2 = f: ");
                        int d = inp.nextInt();
                        System.out.print("Input the value of f in second equation cx1 + dx2 = f: ");
                        int f = inp.nextInt();
                        double det = (a*d-b*c);
                        if (det == 0) {
                        System.out.print("This equation may have infinite solution or no solution");
                        } else {
                        double x1 = (d*e - b*f) / det;
                        double x2 = (a*f - c*e) / det;
                        System.out.printf("The value of x1 is: %f \n", (float) x1);
                        System.out.printf("The value of x2 is: %f \n", (float) x2);
                        }
                        break;
			case 3:
				
				break;
			default:
				System.out.println("Goodbye");
				cont = false;
				break;
			}
		} while (cont);
	}
}