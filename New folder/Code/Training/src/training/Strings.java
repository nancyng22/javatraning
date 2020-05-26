/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.HashMap;

/**
 *
 * @author anhnv_tt
 */
public class Strings {

    public static void main(String[] args) {
        findDuplicateChar("Hello");
        findDuplicateChar("Java");
        findDuplicateChar("HHHHEEEE");
        findDuplicateChar("ABCDE");
        findDuplicateChar("");
    }

    public static void findDuplicateChar(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Can't found");
            return;
        }
        String original = str;
        str = str.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.compute(str.charAt(i), (k, v) -> v + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        if (map.isEmpty()) {
            System.out.println("Can't found");
            return;
        }
        System.out.println("List duplicate of " + original + ": ");
        map.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " ");
            }
        });
    }
}
