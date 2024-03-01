package interviewquestions;

public class NewPyramid {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++) {
            for(int j = i; j <= 6; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for(int i = 5; i > 0; i--) {
            for(int j = i; j <= 6; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
