package File_IO.ReadFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileTypes {
    public static void main(String[] args) {

        String str = readLineByLine("src/File_IO/ReadFile.txt");
        System.out.println(str);
        String strOne = readAllWithReaderClass("src/File_IO/ReadFile.txt\"");
        System.out.println(strOne);

        String strTwo = usingBufferedClass("scr/File_IO/ReadFile.txt");
        System.out.println(strTwo);

        readFileUsingByteArray("scr/File_IO/ReadFile.txt");

    }

    //Read the file convert in String..

    public static String readLineByLine(String filePath){

        StringBuilder stringBuilder = new StringBuilder(); // this will basically create the string
        try{
            Stream<String> stream = Files.lines(Paths.get("src/File_IO/ReadFile.txt"),
                    StandardCharsets.UTF_8);

            stream.forEach(s -> stringBuilder.append(s).append("\n"));

        } catch (IOException e){
            System.out.println("Can not read the file"); //e.getMessage() will print this if file name is incorrect
        }
        return stringBuilder.toString();
    }


    ///Files class read file

    public static String readAllWithReaderClass(String filePath){
        String str = "";

        try{
            str = new String(Files.readAllBytes(Paths.get(filePath)));
        }catch (IOException e){
            e.getMessage();
        }
        return str;
        //return str.toUpperCase(); //it converts everything into UPPERCASE
    }


    //Read file using BufferedReader Class

    public static String usingBufferedClass(String filePath){

        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){

            String currentLine;

            while ((currentLine = bufferedReader.readLine()) != null){
                stringBuilder.append(currentLine).append("\n");
            }

        } catch (IOException e){
            e.getMessage();
        }
        return stringBuilder.toString();

    }

    //Convert data from file into byte [] array then process it

    public static byte[] readFileUsingByteArray(String file){

        FileInputStream inputStream = null;

        byte [] barray = new byte[file.length()];

        try {
            inputStream = new FileInputStream(file);
            inputStream.read(barray);
            inputStream.close();



            for (int i =0; i < barray.length; i++){
                System.out.println((char) barray[i]);  //barray: reads each character not string
            }



        } catch (IOException e){


        }
        return barray;
    }
}
