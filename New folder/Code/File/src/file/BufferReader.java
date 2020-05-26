/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author anhnv_tt
 */
public class BufferReader {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream("test.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] data = new byte[1024];
            int length = bufferedInputStream.read(data);
            System.out.println("length: " + length);
            String result = new String(data, 0, length);
            System.out.println(result);
        } catch (Exception e) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
        }
    }
}
