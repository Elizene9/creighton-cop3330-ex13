/*
* UCF COP 3330 Summer 2021 Assignment 1 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Write a program to compute the value of an investment compounded over time.
The program should ask for the starting amount, the number of years to invest,
 the interest rate, and the number of periods per year to compound.

The formula you’ll use for this is A = P(1 + r/n)^(n*t) where
P is the principal amount.
r is the annual rate of interest.
t is the number of years the amount is invested.
n is the number of times the interest is compounded per year.
A is the amount at the end of the investment.

Example Output
What is the principal amount? 1500
What is the rate? 4.3
What is the number of years? 6
What is the number of times the interest is compounded per year? 4
$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.

Constraints
Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
Ensure that fractions of a cent are rounded up to the next penny.
Ensure that the output is formatted as money.
 */

package Exercise_13;

import java.lang.Math;
import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");

        double prin = input.nextDouble();

        System.out.print("\nWhat is the rate? ");

        double rate = input.nextDouble();

        System.out.print("\nWhat is the number of years? ");

        int year = input.nextInt();

        System.out.print("\nWhat is the number of times the interest is compounded per year? ");

        int comp = input.nextInt();

        double RN = 1 + (rate / 100) / comp;
        double squared = Math.pow(RN, (comp * year));
        double ans = prin * squared;

        System.out.printf("$%.2f invested at %.1f%s %d years compounded %d times per year is $%.2f",
                prin, rate, "% for", year, comp, ans);
    }

}
