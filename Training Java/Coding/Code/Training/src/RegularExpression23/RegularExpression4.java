/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegularExpression23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anhnv_tt
 */

//sample the start and end Methods
public class RegularExpression4 {

    private static final String regex = "\\bcat\\b";
    private static final String input = "cat cat cat catttt cat";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int count = 0;

        while (matcher.find()) {
            count++;
            System.out.println("Matcher number: " + count);
            System.out.println("Start(): " + matcher.start());
            System.out.println("End(): " + matcher.end());
        }
        System.out.println("Can't find");
    }
}
