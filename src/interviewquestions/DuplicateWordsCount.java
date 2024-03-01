package interviewquestions;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import com.sun.jdi.Value;

import java.util.*;
import java.util.logging.Filter;

class DuplicateWordsCount {
    public static void main(String[] args) { 
		String str = "Hey java is java best language is java";
		findDuplicateWords(str);
    }
	static void findDuplicateWords(String str) {
		String[] words = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for( int i = 0; i < words.length; i++) {
			String word = words[i];
			if(map.get(word) == null) {
				map.put(word, 1);
			}else {
				map.put(word, map.get(word) + 1);
			}
		}

		// Approach 1

//		map.forEach((Word, Count) -> {
//			if(Count > 1)
//				System.out.println(Word);
//		});

		// Approach 2
        /*
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
        */


		// Approach 3
		Set<Map.Entry<String, Integer>> set =  map.entrySet();
		System.out.println(set);

		// Approach 4
      /*  System.out.println(">>>>>>>>>>>>>>");
		for(Map.Entry<String, Integer> entry :  map.entrySet()){
             System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
      */
	}
}