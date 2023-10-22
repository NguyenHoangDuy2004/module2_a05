package ss12.baitap;

import java.util.TreeMap;

public class CountWorkMap {
    public static void main(String[] args) {
        String str = " This is a sentence . This is another sentence ";
        TreeMap< String,Integer > countWorkM = new TreeMap();
        String[] words = str.split("\\s+");
        for ( String word : words){
            word = word.toLowerCase();
            if (countWorkM.containsKey(word)){
                int count = countWorkM.get(word);
                countWorkM.put(word,count+1);
            }
            else {
                countWorkM.put(word,1);
            }
        }
        for (String word :countWorkM.keySet()){
            int count= countWorkM.get(word);
            System.out.println(word + " : " + count);
        }
    }
}
