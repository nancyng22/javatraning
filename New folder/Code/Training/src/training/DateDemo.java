/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author anhnv_tt
 */
public class DateDemo {

    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1999-07-22" : args[0];
        System.out.println(input + " Parses as ");
        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (Exception e) {
            System.out.println("Unparseable using " + ft);
        }

        System.out.println("Thread sample: ");
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(5000);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Different time is: " + diff / 1000 + "(s)");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }

    }
}
