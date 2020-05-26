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
public class RegularExpression5 {

    private static final String regex = "cat";
    private static final String input = "catttttttttttttttt";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);

        System.out.println("Regex is: " + regex);
        System.out.println("Input is: " + input);

        System.out.println("lookngAt(): " + matcher.lookingAt());
        System.out.println("matchar(): " + matcher.matches());

    }
}
