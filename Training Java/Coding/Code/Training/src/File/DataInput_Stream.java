/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.*;

/**
 *
 * @author anhnv_tt
 */

public class DataInput_Stream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("C:\\file.txt"));
        dataOut.writeUTF("Hello");
        DataInputStream dataIn = new DataInputStream(new FileInputStream("C:\\file.txt"));
        while (dataIn.available() > 0) {
            String string = dataIn.readUTF();
            System.out.println(string + " ");
        }
    }
}
