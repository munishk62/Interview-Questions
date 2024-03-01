package interviewquestions;

public class Print1To100WithoutUsingNumbers {
    public static void main(String[] args) {
        int one = 'A'/'A';
        String s1 = "..........";

        for(int i = one; i <= (s1.length()*s1.length()); i++) {
            System.out.println(i);
        }

        for(int i = one; i <= 'd'; i+=one) {
            System.out.println(i);
        }

    }
}
