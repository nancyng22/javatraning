/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author anhnv_tt
 */
public class MininumNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input a: ");
        int a = scanner.nextInt();
        System.out.print("Enter input b: ");
        int b = scanner.nextInt();
        int c = min(a, b);
        System.out.println("Min = " + c);
    }

    public static int min(int a, int b) {
        int min;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        return min;
    }
}
