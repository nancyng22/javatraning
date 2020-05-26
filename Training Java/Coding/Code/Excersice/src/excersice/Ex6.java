/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersice;

import java.util.Scanner;

/**
 *
 * @author anhnv_tt
 */
/*
Viết chương trình tìm ước số chung lớn nhất (USCLN) và bội số chung nhỏ nhất (BSCNN)
của hai số nguyên dương a và b nhập từ bàn phím.
 */
public class Ex6 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ener a: ");
        int a = scanner.nextInt();
        System.out.println("Ener b: ");
        int b = scanner.nextInt();
        System.out.println("UCLB = "  + UCLN(a, b));
        System.out.println("BCNN = " + BCNN(a, b));

    }

    public static int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return UCLN(a, a % b);
    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
}
