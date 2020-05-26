/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author anhnv_tt
 */
public class characters {

    public static void main(String[] args) {
        System.out.println("5 is letter? " + Character.isLetter('5'));
        System.out.println("5 is digit? " + Character.isDigit('5'));
        System.out.println("  is space? " + Character.isSpaceChar(' '));
        System.out.println("A is uppercase? " + Character.isUpperCase('A'));
        System.out.println("A is lowercase? " + Character.isLowerCase('A'));
        System.out.println("C to lowercase: " + Character.toLowerCase('C'));
        System.out.println("c to uppercase: " + Character.toUpperCase('c'));
        System.out.println("5 to string " + Character.toString(('5')));
    }
}
