package File_IO;

import java.io.File;
import java.io.IOException;

public class HideTheFile {

    public static void main(String[] args) throws IOException {


        File file = new File ("FileToHde.txt");

        if (file.createNewFile()){
            System.out.println("File had been created");
        } else {
            System.out.println("File already exists");
        }

        //INCOMPLETEEE ! ! !
    }
}
