package ss3.baitap;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[] arr = new int[SIZE];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Nhập giá trị cho phần tử thứ " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int minValue = arr[0];
        for (int i = 1; i < SIZE; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
        scanner.close();
    }
}
