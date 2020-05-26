/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.Scanner;

/**
 *
 * @author anhnv_tt
 */
public class Validate {

    Scanner scanner = new Scanner(System.in);

    public int intputInt(int number) {
        Scanner scanner = new Scanner(System.in);

        do {
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
                System.out.print("Please enter int number: ");
            }
            number = scanner.nextInt();
        } while (number < 0);
        return number;
    }
}
