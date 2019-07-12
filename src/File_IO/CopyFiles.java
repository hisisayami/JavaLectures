package File_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {

    public static void main (String[] args) {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            File infile = new File("ReadFile.txt");
            File outFile = new File("CopyOfReadFile.txt");

            inputStream = new FileInputStream(infile); //reading from old file
            outputStream = new FileOutputStream( outFile); //writing in new file

            byte [] buffer = new byte [1024]; //storing in temporary memory and is hard coded// creating array to read the value and writes in new files

            //Or can be written like this
           // byte [] buffer = new byte [(int) infile.length()];

            int length;

            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer,0,length);

            }

            inputStream.close();
            outputStream.close();

            System.out.println("File copied ! !");

        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
