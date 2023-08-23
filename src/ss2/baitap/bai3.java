package ss2.baitap;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Hiển thị số dãy số tự nhiên nhỏ  100:");

        for (int number = 2; number < 100; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
