package com.challenges.arrays;

import java.util.Scanner;

public class Task5 {

    public static void task5() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers separated by spaces:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int countNegativeSubarrays = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {

                sum +=arr[j];
                if(sum<0){
                    countNegativeSubarrays++;
                }
            }
        }
        sc.close();
        System.out.println(countNegativeSubarrays);
    }
}
/*
Task: Java Subarray I

We define the following:

A subarray of an n-element array is an array composed from a contiguous block of the original array's elements.
For example, if array = [1,2,3], then the subarrays are [1] ,[2] ,[3] ,[1,2] ,[2,3]  and [1,2,3] .
Something like [1,3] would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of n integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, n, denoting the length of array A = [ao,a1,..., an-1] .
The second line contains n space-separated integers describing each respective element, ai, in array A.

Constraints:

1 ≤ n ≤ 100
-10^4 ≤ a_i ≤ 10^4

Output Format

Print the number of subarrays of A having negative sums.

Sample Input

5
1 -2 4 -5 1
Sample Output

9
*/