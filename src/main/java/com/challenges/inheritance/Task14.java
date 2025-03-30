package com.challenges.inheritance;

class Arithmetic {

    Integer add(int a, int b) {
        return a + b;
    }

}

class Adder extends Arithmetic {


}

public class Task14 {

    public static void task14() {

        Adder adder = new Adder();

        System.out.println("My superclass is: " + adder.getClass().getGenericSuperclass().getTypeName());


        System.out.println(adder.add(40, 2) + " " + adder.add(10, 3) + " " + adder.add(10, 10));
    }
}
/*

        Task: Java Inheritance II

Write the following code in your editor below:

1. A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named Arithmetic.
Your classes should not be public .

Input Format

You are not responsible for reading any input from stdin; a
locked code stub will test your submission by calling the add method on an Adder object and passing it 2 integer parameters.

Output Format

You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.

Sample Output

The main method in the Solution class above should print the following:

My superclass is: Arithmetic
42 13 20*/