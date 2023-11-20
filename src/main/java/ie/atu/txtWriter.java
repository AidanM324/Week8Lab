package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class txtWriter {
    public static void main(String[] args) {

        String fileName = "File13.txt";

        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))){
            // Notice there is no close method called. This is a try with resources
            // Write content to the file

                writer.println("words in file.\n");


            System.out.println("content was successfully written to the file.");
        }
        catch(IOException e){
            System.out.println("An error occured while writing the file");
            e.printStackTrace();
        }


    }


}
