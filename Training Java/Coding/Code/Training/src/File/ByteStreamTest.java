/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 *
 * @author anhnv_tt
 */
public class ByteStreamTest {

    public static void main(String args[]) throws IOException {
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);

        while (bOutput.size() != 10) {
            bOutput.write("hello".getBytes());
        }
        byte b[] = bOutput.toByteArray();
        System.out.println("Print the content");

        for (int x = 0; x < b.length; x++) {
            System.out.print((char) b[x] + "   ");
        }
        System.out.println("   ");

        int c;
        ByteArrayInputStream bInput = new ByteArrayInputStream(b);
        System.out.println("Converting characters to Upper case ");

        for (int y = 0; y < 1; y++) {
            while ((c = bInput.read()) != -1) {
                System.out.println(Character.toUpperCase((char) c));
            }
            bInput.reset();
        }
    }
}
