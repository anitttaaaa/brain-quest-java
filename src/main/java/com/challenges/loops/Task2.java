package com.challenges.loops;

import java.util.Scanner;

public class Task2 {

    public static void task2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of queries (q):");
        int q = s.nextInt();
        for(int i=1;i<=q;i++){
            System.out.println();
            System.out.println("For each query, enter three space-separated integers: a, b, and n.\n" +
                    "a: The starting value of the series.\n" +
                    "b: The multiplier for the powers of 2.\n" +
                    "n: The number of terms to generate in the series.");
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            if(q<=500&&a>=0&&a<=50&&b>=0&&b<=50&&n>=1&&n<=15){
                int sum = a;
                for(int j=0;j<n;j++){
                    sum = sum + ((int)Math.pow(2, j))*b;
                    System.out.print(sum+" ");
                }

            }
        }
            System.out.println("End of exercise.");
    }
}

/* We use the integers a, b and n to create the following series:  (a+2^0), (a+2^0 * b + 2^1 *b), ..., (a + 2^0 *b + 2^1 *b + ... + 2^n-1 *b)

You are given q queries in the form of a, b and n . For each query, print the series corresponding to the given a, b, and n  values as a single line of  n space-separated integers.

Input Format

The first line contains an integer, q  , denoting the number of queries.
Each line  i of the q subsequent lines contains three space-separated integers describing the respective ai ,bi , and ni values for that query.

Constraints  :  0<=1 <= 500 , 0<=a,b<= 50, 1<=n <= 15

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98*/

