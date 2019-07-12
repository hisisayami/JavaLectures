package File_IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Append_File {
    public static void main(String[] args) throws IOException {
        String textTObeAppended = "This is more lines after existing lines";

        BufferedWriter writer =
                new BufferedWriter(new FileWriter("TestFileOne.txt", true));
        writer.newLine(); // to add in next line
        writer.write(textTObeAppended);
        writer.close();


        //another way
        FileOutputStream outputStream = new FileOutputStream("TestFileOne.txt", true);
        byte[] strArray = textTObeAppended.getBytes();
        outputStream.write(strArray);
        outputStream.close();



    }
}
