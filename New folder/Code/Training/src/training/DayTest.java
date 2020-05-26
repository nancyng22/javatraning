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
public class DayTest {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        // E: friday, a: AM/PM, zzz: Time zone 
        System.out.println("Current Date: " + ft.format(date));
        //date formatting using 'printf'
        String str = String.format("Current Date/Time: %tc", date);
        System.out.printf(str);
        System.out.printf("\n%1$s %2$tB %2$td, %2$tY", "Due date:", date);
        System.out.printf("\n%s %tB %<te, %<tY", "Due date:", date);
    }
}
