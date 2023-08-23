package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;

        System.out.print("Nhập số cần chèn (X): ");
        int x = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn (index): ");
        int index = scanner.nextInt();

        if (index < 0 || index > n - 1) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            int[] newArray = new int[n + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = x;
            for (int i = index + 1; i < n + 1; i++) {
                newArray[i] = array[i - 1];
            }

            System.out.println("Mảng sau khi chèn: " + Arrays.toString(newArray));
        }
    }

}
