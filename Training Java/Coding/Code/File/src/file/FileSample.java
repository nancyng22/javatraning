/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author anhnv_tt
 */
public class FileSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        tao file
        File file = new File("test.txt");
        if (file.isFile()) {
            System.out.println("File" + file.getPath());
        } else {
            System.out.println("Not found");
            file.createNewFile();
            System.out.println("Create New File");
        }
        //nhap n bang cach su dung DataInputStream
        System.out.println("Enter N: ");
        DataInputStream inputStream = new DataInputStream(System.in);
        int n = Integer.parseInt(inputStream.readLine());
        System.out.println("N = " + n);

    }

}
