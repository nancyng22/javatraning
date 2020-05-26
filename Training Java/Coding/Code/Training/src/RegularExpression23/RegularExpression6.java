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
public class RegularExpression6 {

    private static String regex = "dog";
    private static String input = "The dog say meoz, the dog love meoz";
    private static String replace = "cat";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        input = matcher.replaceAll(replace);
        System.out.println(input);

    }
}
