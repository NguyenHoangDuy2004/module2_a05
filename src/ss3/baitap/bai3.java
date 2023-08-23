package ss3.baitap;

public class bai3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};

        int size1 = array1.length;
        int size2 = array2.length;
        int size3 = size1 + size2;

        int[] array3 = new int[size3];

        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < size3; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
