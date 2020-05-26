
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anhnv_tt
 */
public class RegularExpression {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter input: ");
            String input = scanner.nextLine();

            String regex = "^[a-zA-z]+[a-zA-Z0-9]*@{1}[a-zA-Z]+mail.com$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println("OK");
            } else {
                System.out.println("Enter again!");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
