package interviewquestions;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MissingNumberInArray {
    public static void main(String[] args) { 
		int a[] = {1,2,4,5};
		int sum1 = 0;
		for(int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of elements in Array = " + sum1);

		int sum2 = 0;

		for(int i = 1; i <= 5; i++) {
			sum2 = sum2 + i;
		}

		System.out.println("Sum of elements in Actual Array = " + sum2);

		System.out.println("Missing element in Array = " + (sum2 - sum1));
	}
}