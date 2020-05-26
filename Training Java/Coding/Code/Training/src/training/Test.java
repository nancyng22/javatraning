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
public class Test {

    //viet chuong trinh nhap vao n so nguyen va tim so lon nhat
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        System.out.print("Enter number of array: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter a[" + (i + 1) + "] :");
            arr[i] = scanner.nextInt();
        }
        Test test = new Test();
        System.out.print("Your array: ");
        test.printArray(arr);
        for (int i : arr) {
            max = Math.max(max, i);
            min = Math.min(min, i + 1);
        }
        System.out.println("\nMaximum of array:  " + max);
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
