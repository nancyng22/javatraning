/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegularExpression23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anhnv_tt
 */
//tim kiem gan dung
public class RegularExpression2 {

    public static void main(String[] args) {
        String[] fullName = {"Nguyen Van A",
            "Dang Tung A",
            "Nguyen Thi Hoa",
            "Huang Hai Ou",
            "Lee Min Ho"};
        String regex = ".*Nguyen.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (int i = 0; i < fullName.length; i++) {
            matcher = pattern.matcher(fullName[i]);
            if (matcher.find()) {
                System.out.println(fullName[i]);
            }
        }

    }
}
