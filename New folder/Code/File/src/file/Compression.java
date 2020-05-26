/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 *
 * @author anhnv_tt
 */
public class Compression {

    public static void main(String[] args) throws UnsupportedEncodingException, DataFormatException {
        String input = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";

        byte[] inputObj = input.getBytes("UTF-8");
        System.out.println("length: " + inputObj.length);
        //compress the bytes
        byte[] output = new byte[1024];
        Deflater deflater = new Deflater();
        deflater.setInput(inputObj);
        deflater.finish();
        int compressDateLength = deflater.deflate(output);
        System.out.println(compressDateLength);
        //giai nen
        Inflater inflaterObj = new Inflater();
        inflaterObj.setInput(output, 0, output.length);
        byte[] resultObj = new byte[1024];
        int resultLength = inflaterObj.inflate(resultObj);
        inflaterObj.end();
        String output2 = new String(resultObj, 0, resultLength);
        System.out.println(output2);
    }
}
