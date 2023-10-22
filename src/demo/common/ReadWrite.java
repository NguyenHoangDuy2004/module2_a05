package demo.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) {
        File file = new File("");
        FileWriter fileWriter = null ;
        try {
            fileWriter = new FileWriter(file , true);
            fileWriter.write("A05");
        }catch (IOException e){
            System.out.println("sai");
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("sai 2");
            }
        }
    }
}
