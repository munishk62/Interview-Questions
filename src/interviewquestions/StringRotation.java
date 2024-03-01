package interviewquestions;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class StringRotation {
    public static void main(String[] args) { 
		String str1 = "ABCD";
		String str2 = "CDAB";
		if(isRotation(str1, str2)) {
			System.out.println("Rotation of string is present");
		}else {
			System.out.println("Rotation not found");
		}
	}

	public static boolean isRotation(String str1, String str2) {
		return (str1.length() == str2.length()) && ((str1 + str2).indexOf(str2) != -1);
	}

}