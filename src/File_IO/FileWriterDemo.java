package File_IO;

import java.io.*;

public class FileWriterDemo {

    static String fileContent = "Using PrintWriter Class";

    public static void main(String[] args) throws  IOException {
        UsingPrintWriter();


    }
    public static void UsingPrintWriter() throws IOException{



        FileWriter fileWriter = new FileWriter("TestFileOne.txt"); // calling class within the class
        PrintWriter printWriter = new PrintWriter(fileWriter);
//      printWriter.print(fileContent); //use append instead of print to write in txt file without replacing previous vlaues
        printWriter.append(fileContent);
        printWriter.printf("Java Class %s", "Java -Topic");
        printWriter.close();
    }

    public static void usingDataOutput() throws IOException {
        FileOutputStream outputStream = new FileOutputStream("src/File_IO/TestFileOne.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(
                new BufferedOutputStream((outputStream)));//Buffer.. converts data types into binary and content cannot be used

        dataOutputStream.writeUTF(fileContent);
        dataOutputStream.close();
    }

}
