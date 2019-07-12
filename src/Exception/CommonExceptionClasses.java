package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CommonExceptionClasses {
    public static void main(String[] args) {

        //IO Exception = INPUT/OUTPUT

        //1. File not found

//        try{
//            new FileReader(new File("Test.text"));
//        }catch (FileNotFoundException e){
//            System.out.println("File not found")
//        }
//
//        //URL website address not found
//
//        try {
//            new URL ( "htp://yahoo.com");
//        }catch (MalformedURLException e){
//            System.out.println("URL is not correctly define");
//
//        }

        /// Parse exception
        try {
            new SimpleDateFormat("MM,dd,yyyy").parse("Invalid-date");
        } catch (ParseException e){
            System.out.println("Date format is not readable");

        }
        try {
            Thread.sleep(3L);
        }catch (InterruptedException e){
            System.out.println("Thread exception");
        }

        ///String index about of bound

        String str = "Hello World";
        try{
            System.out.println(str.charAt(50));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundException");
        }

        ////NumberFormat
        String s = "10ABC";
        try{
            int x = Integer.parseInt(s);
            System.out.println(x);
        }catch (NumberFormatException e){
            System.out.println("This is NumberFormatException");
        }

        ////Illegal Argument

        try{
            Thread.sleep(-100);
        }catch (IllegalArgumentException | InterruptedException e){
            System.out.println("This is IllegalArgumentException");
        }
    }
}
