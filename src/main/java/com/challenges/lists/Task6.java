package com.challenges.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {


    public static void task6() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines (n):");

        int n = sc.nextInt();
        sc.nextLine();


        List<List<Integer>> lines = new ArrayList<>();

        System.out.println("Enter " + n + " lines. Each line should start with an integer (d), followed by d space-separated integers:");

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");

            List<Integer> numbers = new ArrayList<>();

            for (int j = 1; j < arr.length; j++) {
                numbers.add(Integer.parseInt(arr[j]));
            }

            lines.add(numbers);
        }

        System.out.println("Enter the number of queries (q):");

        int q = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + q + " queries. Each query consists of two integers: x (line number) and y (position in the line):");

        for (int i = 0; i < q; i++) {
            String[] query = sc.nextLine().split(" ");
            int x = Integer.parseInt(query[0]) - 1;
            int y = Integer.parseInt(query[1]) - 1;


            if (x >= 0 && x < lines.size() && y >= 0 && y < lines.get(x).size()) {
                System.out.println("Result: " + lines.get(x).get(y));
            } else {
                System.out.println("ERROR! Position does not exist.");
            }
        }

        sc.close();

    }
}
/*
Task: Java ArrayList

Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature.
Try to solve this problem using Arraylist.

You are given n lines. In each line there are zero or more integers.
You need to answer a few queries where you need to tell the number located in yth position of xth line.

Take your input from System.in.

Input Format
The first line has an integer n. In each of the next n lines
there will be an integer d denoting number of integers on that line and then
there will be d space-separated integers. In the next line there will be an integer q denoting number of queries.
Each query will consist of two integers x and y.

Constraints: 1<=n<=2000, 0<=d<=5000, 1<=q<=1000, 1<=x<=n

Each number will fit in signed integer.
Total number of integers in n lines will not cross 10^5.

Output Format
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
*/