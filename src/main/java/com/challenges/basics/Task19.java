package com.challenges.basics;

import java.util.Calendar;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        int dayOfTheWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] daysOfTheWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        return daysOfTheWeek[dayOfTheWeek - 1];
    }
}

public class Task19 {

    public static void task19() {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter the date in the format MM DD YYYY: ");
            String input = scanner.nextLine();
            String[] firstMultipleInput = input.split(" ");

            int month = Integer.parseInt(firstMultipleInput[0]);
            int day = Integer.parseInt(firstMultipleInput[1]);
            int year = Integer.parseInt(firstMultipleInput[2]);

            String res = Result.findDay(month, day, year);
            System.out.println(res);


        } catch (NumberFormatException e) {
            System.err.println("Błąd formatu liczb: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Wystąpił nieoczekiwany błąd: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
/*
Task: Java Date and Time

The Calendar class is an abstract class that provides methods for converting
between a specific instant in time and a set of calendar fields such as
YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating
the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, getDay,
which returns the day on that date. To simplify your task,
we have provided a portion of the code in the editor.

Example
 month = 8
 day = 14
 year = 2017

The method should return MONDAY as the day on that date.

Function Description

Complete the findDay function in the editor below.
findDay has the following parameters:

int: month
int: day
int: year

Returns:
string: the day of the week in capital letters

Input Format
A single line of input containing the space separated month,
day and year, respectively, in MM/DD/YYY   format.

Constraints
2000 < year < 3000

Sample Input
08 05 2015

Sample Output
WEDNESDAY

Explanation
The day on August 5th 2015 was WEDNESDAY.

*/