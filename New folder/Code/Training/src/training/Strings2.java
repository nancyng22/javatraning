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
public class Strings2 {

    public static void main(String[] args) {
        reverse("hello");
        reverse("");
        reverse("1");
        reverse("ng anh");

    }

    public static void reverse(String str) {
        System.out.println("Input:" + str);
        if (str.isEmpty()) {
            System.out.println("String is emtpy");
            return;
        }
        if (str.length() == 1) {
            System.out.println("Can't reverse 1 character");
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Output: " + sb.reverse());

    }
}
