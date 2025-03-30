package com.challenges.loops;

import java.util.Scanner;

public class Task1 {


    public static void task1() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10:");
        int N=sc.nextInt();

        if (N >= 2 && N <= 20) {

            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + (N * i));
            }
        } else{
            System.out.println("Wrong number. ");
        }
    }
}
    /*
    Task: Java Loops I

    Objective:
    In this challenge, we're going to use loops to help us perform some simple math.
    The goal is to print the first 10 multiples of a given integer.

    Task:
    Given an integer N, print its first 10 multiples. Each multiple N x i (where 1<= i <= 10) should be printed on a new line in the form:
    N x i = result

    Input Format:
    - A single integer N.

    Constraints:
    2 <= N <= 20

    Output Format:
    - Print 10 lines of output; each line i (where 1<= i <= 10) contains the result of N x i in the form:
     N x i = result

    Sample Input:
    2

    Sample Output:
    2 x 1 = 2
    2 x 2 = 4
    2 x 3 = 6
    2 x 4 = 8
    2 x 5 = 10
    2 x 6 = 12
    2 x 7 = 14
    2 x 8 = 16
    2 x 9 = 18
    2 x 10 = 20
*/


