/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersice;

import java.util.ArrayList;

/**
 *
 * @author anhnv_tt
 */
/*
*Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5,
nằm trong đoạn 10 và 200 (tính cả 10 và 200).Các số thu được sẽ được in thành chuỗi 
trên một dòng, cách nhau bằng dấu phẩy.
 */
public class Ex1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 10; i < 201; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                list.add(i);
            }
        }
        showList(list);
    }

    public static void showList(ArrayList<Integer> list) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i) + ", ");
            }
            System.out.println(list.get(list.size() - 1));
        }
    }
}
