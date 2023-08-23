package ss1.baitap;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nháº­p sá»‘ nguyÃªn dÆ°Æ¡ng: ");
        int number = scanner.nextInt();
        System.out.println(convertNumberToWords(number));
    }

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "Zero";
        } else if (number < 0) {
            return "Sá»‘ Ã¢m khÃ´ng Ä‘Æ°á»£c há»— trá»£";
        }

        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] hundreds = {"", "One hundred", "Two hundred", "Three hundred", "Four hundred", "Five hundred", "Six hundred", "Seven hundred", "Eight hundred", "Nine hundred"};

        if (number < 20) {
            return ones[number];
        } else if (number < 100) {
            int unit = number % 10;
            int ten = number / 10;
            return tens[ten] + " " + ones[unit];
        } else {
            int unit = number % 10;
            int ten = (number % 100) / 10;
            int hundred = number / 100;
            return hundreds[hundred] + " " + tens[ten] + " " + ones[unit];
        }
    }

}
