/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asg2;

import java.util.Scanner;

/**
 *
 * @author anhnv_tt
 */
public class Asg2 {

    public static void main(String[] args) {
        System.out.print("Enter input: ");
        Scanner scanner = new Scanner(System.in);
        String content = scanner.nextLine();
        Asg2 counter = new Asg2();
        System.out.print("Total word: " + counter.countWord(content));
        System.out.println("\nTotal character: " + content.length());

    }

    public int countWord(String content) {
        int count = 0;
        if (content == null || content.isEmpty()) {
            return 0;
        }
        String[] words = content.split("\\s+");
        return words.length;

    }
}
