package ss16.baitap.copy_file;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList arrayList = new ArrayList();
        arrayList= readAndWriteFile.readFile("D:\\codegym\\module2_a05\\src\\ss16\\baitap\\copy_file\\sourceFile.csv");
        readAndWriteFile.writeFile("D:\\codegym\\module2_a05\\src\\ss16\\baitap\\copy_file\\TargetFile.csv", arrayList);
    }
}
