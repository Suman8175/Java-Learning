import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHanding {
    public static void main(String[] args) {
        File f1=new File("checkingfile.txt");
        try {
            //To create and write in a file
//            f1.createNewFile();
            FileWriter writer=new FileWriter("checkingfile.txt");
            writer.write("I'm writing to a newly created file again...\n New line...\n Again..\nLast...\nNow Over");
            writer.close();
            System.out.println("File has been created sucessfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Read from File
        try {
            Scanner sc=new Scanner(f1);
            while (sc.hasNextLine()){
                String result=sc.nextLine();
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Append a file
        try {

            FileWriter writer=new FileWriter("checkingfile.txt",true);
            writer.write("\nAppended");
            writer.close();
            System.out.println("File has been created sucessfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
