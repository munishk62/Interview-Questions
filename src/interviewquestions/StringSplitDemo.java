package interviewquestions;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
//.import org.apache.commons.lang3.StringUtils;

class StringSplitDemo {
    public static void main(String[] args) {
          String s = "091-2657687867";
          String str[] = s.split("-");
          printString(str, "String Split Method");
          List<String> strings  = Pattern.compile("-").splitAsStream(s).collect(Collectors.toList());
            System.out.println("Splitting String by pattern class");
            for(String string  :  strings) {
                  System.out.println(string);
              }
            StringTokenizer stri = new StringTokenizer(s, "-");
            System.out.println("Splitting String by String Tokenizer");
            while(stri.hasMoreTokens()){
                String s2 = stri.nextToken();
                System.out.println(s2);
            }


        //String splitArray = StringUtils.split(s, '-');
    }

    private static void printString(String str[], String approach) {
        System.out.println("Splitting sting by using "+approach);
        for(String string : str) {
             System.out.println(string);
        }
    }
}