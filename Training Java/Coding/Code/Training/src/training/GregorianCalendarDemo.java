/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.*;

/**
 *
 * @author anhnv_tt
 */
public class GregorianCalendarDemo {

    public static void main(String[] args) {
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May",
            "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int year;

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println("Date: ");
        System.out.print(months[gregorianCalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gregorianCalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gregorianCalendar.get(Calendar.YEAR));
        System.out.println("Time: ");
        System.out.print(gregorianCalendar.get(Calendar.HOUR) + " : ");
        System.out.print(gregorianCalendar.get(Calendar.MINUTE) + " : ");
        System.out.println(gregorianCalendar.get(Calendar.SECOND));

        //check if this is leap year or not
        if (gregorianCalendar.isLeapYear(year)) {
            System.out.println("The current year is leap year!");
        } else {
            System.out.println("The current year is not leap year");
        }

    }
}
