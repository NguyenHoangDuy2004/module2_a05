package ss11.baitap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String text = scanner.nextLine();

        text = text.toLowerCase();

        Map<String, Integer> wordCountMap = new TreeMap<>();

        String[] words = text.split("\\s+");

        for (String word : words) {

            word = word.replaceAll("[^a-zA-Z]", "");

            if (!word.isEmpty()) {

                if (wordCountMap.containsKey(word)) {

                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else {

                    wordCountMap.put(word, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }
}
