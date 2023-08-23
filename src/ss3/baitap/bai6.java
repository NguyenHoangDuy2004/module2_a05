package ss3.baitap;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Nhập cột muốn tính tổng: ");
        int targetColumn = scanner.nextInt();
        int columnSum = 0;
        for (int i = 0; i < rows; i++) {
            columnSum += array[i][targetColumn];
        }
        System.out.println("Tổng các số trong cột " + targetColumn + " là: " + columnSum);
        scanner.close();
    }
}
