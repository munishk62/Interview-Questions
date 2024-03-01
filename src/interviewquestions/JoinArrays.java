package interviewquestions;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinArrays {
    public static void main(String[] args) {
        String[] batsman = {
                "Gill",
                "Rohit",
                "Kohli",
                "Shreyas",
                "Rishabh"
        };
        String[] bowlers = {
                "Hardik",
                "Shami",
                "Ashwin",
                "Kuldeep",
                "Siraj",
                "Bumrah"
        };
        Stream<String> sBat = Arrays.stream(batsman);
        Stream<String> sBowl = Arrays.stream(bowlers);

        String[] fullTeam = Stream.concat(sBat, sBowl).toArray(size -> new String[size]);

        for(String elem : fullTeam) {
            System.out.println(elem);
        }
    }
}
