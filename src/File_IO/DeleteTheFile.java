package File_IO;

import java.io.File;
import java.sql.SQLOutput;

public class DeleteTheFile {
    public static void main(String[] args) {

        try {

            File file = new File("TestFileOne.txt");

            //creating file
            if (file.createNewFile()){
                System.out.println("File is created...");
            }

            //deleting file
            if (file.delete()) {
                System.out.println("File has been deleted");
            } else {
                System.out.println("File cannot be deleted");
            }

        } catch (Exception e){
            System.out.println("exception");
        }

    }
}
