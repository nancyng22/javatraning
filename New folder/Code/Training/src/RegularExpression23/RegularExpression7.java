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
public class RegularExpression7 {

    private static String regex = "ab";
    private static String input = "abhihiabihihihibabb";
    private static String replace = "-";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, replace);
        }
        matcher.appendTail(stringBuffer);
        System.out.println(stringBuffer.toString());
    }
}
