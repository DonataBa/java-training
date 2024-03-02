package practice;

public class ex38 {

	public static void main(String[] args) {
		String initial = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;
		
		for (int i = 0; i < initial.length(); i++) {
			char temp = initial.charAt(i);
			if (Character.isDigit(temp)){
				number = number +1;
			} else if (Character.isLetter(temp)) {
				letter = letter +1;
			} else if (Character.isSpace(temp)) {
				space = space +1;
			} else {
				other = other +1;
			}
			
		}
			System.out.println("Letter: "+letter);
			System.out.println("Space: "+space);
			System.out.println("number: "+number);
			System.out.println("Other: "+other);

	}

}
;