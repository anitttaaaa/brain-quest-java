package com.challenges.basics;

import java.util.Scanner;

public class Task18 {

    public static void task18() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer between -100 and 100:");

        Integer n;
        n = sc.nextInt();
        if(n>=-100 && n<=100){
            String string = String.valueOf(n);
            System.out.println("Good job");
        }else {
            System.out.println("Wrong answer");
        }
        sc.close();
    }
}
/*
You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor.
If your code successfully converts  into a string s the code will print "Good job". Otherwise it will print "Wrong answer".

n can range between -100 to 100 inclusive.

Sample Input

100
Sample Output

Good job
*/