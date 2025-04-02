package com.challenges.basics;

import java.util.Scanner;

public class Task17 {
    static int B;
    static int H;

    static{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the breadth (B) of the parallelogram:");
        B = sc.nextInt();
        System.out.println("Enter the height (H) of the parallelogram:");
        H = sc.nextInt();

        if(B<-100 || B > 100 || H<-100 || H > 100 || B<=0 || H<=0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            System.exit(0);
        }
        sc.close();

    }

    public static void task17() {
        System.out.println("The area of the parallelogram is: " + (B * H));

    }

}
/*

    Task: Static Initializer Block

Static initialization blocks are executed when the class is loaded,
and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks.
You can read about it here.

You are given a class Solution with a main method.
Complete the given code so that it outputs the area of a parallelogram
with breadth B and height H. You should read the variables
from the standard input.

If B<=0 or H<=0 , the output should be "java.lang.Exception:
Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains B: the breadth of the parallelogram.
The next line contains H: the height of the parallelogram.

Constraints:
-100<= B <= 100
-100<= H <= 100


Output Format

If both values are greater than zero, then the main method must output
the area of the parallelogram. Otherwise, print "java.lang.Exception:
Breadth and height must be positive" without quotes.

Sample input 1
1
3

Sample output 1
3

Sample input 2
-1
2

Sample output 2

java.lang.Exception: Breadth and height must be positive
*/