/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Logger;

/**
 *
 * @author anhnv_tt
 */
public class InputStream {

    public static void main(String[] args) {

        //read write text/binary
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("test.txt");
            fileOutputStream = new FileOutputStream("test_cp.txt");

            int ch;
            while ((ch = fileInputStream.read()) != -1) {
                System.out.print((char) ch);
//                break;
                fileOutputStream.write(ch);
            }
        } catch (Exception e) {
            System.out.println("Error1");
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception e) {
                    System.out.println("Error2");
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e) {
                    System.out.println("Error2");
                }
            }
        }

    }
}
