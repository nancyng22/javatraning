/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author anhnv_tt
 */
public class swappingExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        swapFuntion(a, b);
    }

    public static void swapFuntion(int a, int b) {
        System.out.println("Before swap: " + a + " - " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: " + a + " - " + b
        );

    }
}
