package interviewquestions;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CharsCount {
    public static void main(String[] args) { 
		String str = "My name is munish";
		count(str);
    }
	static void count(String str) {
		char[] ch = str.toCharArray();
		for( int i=0; i<ch.length; i++) {
			//System.out.print(ch[i]);

			//Declare string with empty initialization

			String s = "";

			while(i<ch.length && ch[i] != ' ') {

			// Concat with declared string

			  s = s + ch[i];
			  i++;
			}
			if(s.length() > 0) {
				System.out.println(s + "->" + s.length());
			}
			
			
			
					/*
	    String[] charArray = str.split(" ");
		System.out.println("charArray="+charArray);
        for( int i = 0; i < charArray.length; i++) {
            String individualString = charArray[i];
            System.out.println("Individual Word="+individualString);
            char[] wordCharsArray = individualString.toCharArray();
            System.out.println("Individual Word Lengthg="+wordCharsArray.length);
        }
		*/
		
		
		
		
		}
	}
}