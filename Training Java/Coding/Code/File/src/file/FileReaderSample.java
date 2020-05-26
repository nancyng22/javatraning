/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author anhnv_tt
 */
public class FileReaderSample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("test.txt");
            writer = new FileWriter("test_cp2.txt");
            int ch = reader.read();
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
                writer.write(ch);
            }
            writer.write(("\nXin chao"));
        } catch (Exception e) {
            System.out.println("Error1");
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }

    }
}
