package File_IO;

//    1. Rename the file
//    2. make the file read only
//    3. File hidden
//    4. compress the file in zip file

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class DemoExercise_FIleIO {
    public static void main(String[] args) {


        try {

            makefile();
            //makefile2();

        } catch ( Exception e){
            e.printStackTrace();
        }

    }

    //createFileUsingClass
    public static void makefile () throws IOException {

        File file1 = new File("Home.txt");

        if(file1.createNewFile()){
            System.out.println("File has been created");
        } else {
            System.out.println("File already exist ! !");
        }

        //1. Renaming Home.txt file to RenamedFile.txt
        File renameFile =  new File ("RenamedFile.txt");
        if (file1.renameTo(renameFile)){
            System.out.println( file1.getName() + "has been renamed Successfully to"
                    + renameFile.getName());
        } else {
            System.out.println("Rename failed ! !");
        }

        //2.make the file read only

        boolean result = renameFile.setReadOnly();

        if (result){
            System.out.println("File is read only now");
        } else {
            System.out.println("File is still writable");
        }

        //3.make file hidden

        boolean isHidden = renameFile.isHidden();

       System.out.println("Is file hidden" + isHidden);


        // 4. compress the file in zip file

        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(renameFile));
        ZipEntry e = new ZipEntry("NEWFILE.txt");
        out.putNextEntry(e);



        out.close();



    }

    //createFileUsingNIO
    public static void makefile2 () throws IOException {
        String content = "This is file on home 2";
        Files.write(Paths.get("Home2"), content.getBytes());




    }


}
