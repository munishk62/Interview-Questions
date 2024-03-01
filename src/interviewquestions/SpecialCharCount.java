package interviewquestions;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SpecialCharCount {
    public static void main(String[] args) { 
		String str = "CloudTech#@!";
		int count = 0;
        String specialCharsRemovedString = "";
		for(int i = 0; i < str.length(); i++) {
			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
				count++;
			} else {
				specialCharsRemovedString = specialCharsRemovedString + str.charAt(i);
			}
       }
       if(count == 0) {
		   System.out.println("There are no special characters in string");
	   } else {
		   System.out.println("Special characters found = " + count);
		   System.out.println("specialCharsRemovedString = "+ specialCharsRemovedString);
	   }
	}
}