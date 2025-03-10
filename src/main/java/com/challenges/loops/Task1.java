package com.challenges.loops;

import java.util.Scanner;

public class Task1 {


    public static void task1() {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        for(int i = 1; i<=10; i++) {
            System.out.println(N+" x "+i+" = "+(N*i));
        }
    }
}
    /*
    Objective:
    In this challenge, we're going to use loops to help us perform some simple math.
    The goal is to print the first 10 multiples of a given integer.

    Task:
    Given an integer `n`, print its first 10 multiples. Each multiple (where `i` is the multiplier) should be printed on a new line in the following format:
    N x i = result
    where `N` is the input number and `i` is the number from 1 to 10.

    Input Format:
    - A single integer `n` will be provided as input.

    Constraints:
    - The integer will be a positive integer.

    Output Format:
    - The program should print 10 lines of output. Each line will display the result of multiplying `n` by `i` (from 1 to 10). The format should be:
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

    Explanation:
    - The input number is `2`.
    - We multiply `2` by numbers from 1 to 10.
    - For each multiplication, the result is printed in the format: `2 x i = result`.
*/


