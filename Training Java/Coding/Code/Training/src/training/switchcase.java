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
public class switchcase {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu: ");
            System.out.println("1. Milk");
            System.out.println("2. Cacao");
            System.out.println("3. Ramen");
            System.out.println("Enter your choice: ");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Your choice: milk  ");
                    break;
                case 2:
                    System.out.println("Your choice: cacao  ");
                    break;
                case 3:
                    System.out.println("Your choice: ramen  ");
                    break;
                default:
                    System.out.println("You can only choice in menu");
            }
        } while (true);

    }
}
