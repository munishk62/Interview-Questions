package streams;

import java.util.HashMap;

public class FirmInIqTest {
    public static void main(String[] args) {
        String str = "this this is is magic world and magic is everwhere in world";
        countWords(str);
    }
    private static void countWords(String str) {
        String[] wordsArray = str.split(" ");
        HashMap<String, Integer> wordsMap = new HashMap();
        for(int i = 0; i < wordsArray.length; i++) {
            String currentWord = wordsArray[i];
            if(wordsMap.containsKey(currentWord)) {
                wordsMap.put(currentWord, wordsMap.get(currentWord) + 1);
            } else {
                wordsMap.put(currentWord, 1);
            }
        }

        wordsMap.forEach((word, count) -> System.out.println(word + " count = " +  count));
    }
}
