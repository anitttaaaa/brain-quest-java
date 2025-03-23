package com.challenges.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {

    public static void task7() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list (N):");

        int N = sc.nextInt();
        sc.nextLine();

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter " + N + " space-separated integers:");

        String[] numbers = sc.nextLine().split(" ");
        for (String num : numbers) {
            list.add(Integer.parseInt(num));
        }

        System.out.println("Enter the number of queries (Q):");

        int Q = sc.nextInt();

        System.out.println("Enter " + Q + " queries: (Insert x y or Delete x)");

        for (int i = 0; i < Q; i++) {

            String query = sc.next();

            if(query.equalsIgnoreCase("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();

                list.add(x, y);

            }else if (query.equalsIgnoreCase("Delete")){
                int d = sc.nextInt();
                list.remove(d);
            }
        }
        System.out.println("Updated list:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
/*For this problem, we have 2 types of queries you can perform on a List:

1. Insert y at index x:

Insert
x y
2. Delete the element at index x:

Delete
x
Given a list, L, of N integers, perform Q queries on the list. Once all queries are completed,
print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer, N (the initial number of elements in L).
The second line contains  N space-separated integers describing L.
The third line contains an integer, Q (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers x y,
and the value y must be inserted into L at index x.
If the first line of a query contains the String Delete, then the second line contains index x,
whose element must be deleted from L.
Constraints 1<=N<=4000, 1<=Q<=4000

Each element in is a 32-bit integer.
Output Format

Print the updated list L as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
*/