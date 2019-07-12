package File_IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class CreateFile {
    public static void main(String[] args) {
        try {
            createFileUsingClass();
            createFileUsingFileOutoutStream();
            createFileUsingNIO();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void createFileUsingClass() throws IOException {

        File file = new File("TestFileOne.txt");

        //Create the file
        if (file.createNewFile()){
            System.out.println("File has been created");
        } else {
            System.out.println("File is already exist");
        }

        //Write to the file
        FileWriter writer = new FileWriter(file); //file is object name of TestFileOne.txt
        writer.write("File writer class...");
        writer.close();
    }

    public static void createFileUsingFileOutoutStream() throws IOException{
        String content = "This is using File Input stream";

        FileOutputStream out = new FileOutputStream("TestFileTwo.txt;");
        out.write(content.getBytes()); //getBytes- converts string to binary and sent it to processor
        out.close();

    }

    public static void createFileUsingNIO() throws IOException {
        String content = "Using class from NIO package";
        Files.write(Paths.get("TestFileThree.txt"), content.getBytes());




    }
}
