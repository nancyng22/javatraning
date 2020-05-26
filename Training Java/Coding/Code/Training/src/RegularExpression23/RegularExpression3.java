/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegularExpression23;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anhnv_tt
 */
//Capturing Groups
public class RegularExpression3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "hello world, QT300! hihi";
        String regex = "(.*)(\\d+)(.*)";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            System.out.println("Found value: " + matcher.group(0));
            System.out.println("Found value: " + matcher.group(1));
            System.out.println("Found value: " + matcher.group(2));
        } else {
            System.out.println("NO MATCH");
        }
    }
}
