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
Viết một chương trình tính giai thừa của một số nguyên dương n.
Với n được nhập từ bàn phím. Ví dụ, n = 8 thì kết quả đầu ra
phải là 1*2*3*4*5*6*7*8 = 40320.
 */
public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        System.out.println("Giai thua cua " + n + " la " + tinhGiaiThua(n));

    }

    public static long tinhGiaiThua(int n) {
        if (n > 0) {
            return n * tinhGiaiThua(n - 1);
        } else {
            return 1;
        }
    }
}
