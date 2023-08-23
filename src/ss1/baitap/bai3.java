package ss1.baitap;


import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập số tiền usd");
        usd = sc.nextDouble();
        double quyDoi = usd * 23000;
        System.out.print("giá trị tiền việt là " + quyDoi);
    }
}
