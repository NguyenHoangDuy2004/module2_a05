package ss17.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProductManager> productManagers = new ArrayList<>();
        File file = new File("D:\\codegym\\module2_a05\\src\\ss17\\baitap\\Product.csv");
        ObjectOutputStream objectOutputStream = null ;
        try {
            FileOutputStream fileOutputStream =new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productManagers);
        }catch (FileNotFoundException e){
            System.out.println("file không tìm thấy");
        }catch (IOException e) {
            System.out.println("lỗi ghi file ");
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");
            }
        }

    }
}

