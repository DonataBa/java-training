package practice;

public class ex37 {

	public static void main(String[] args) {
		
		String initial = "The quick brown fox";
		String result = "";
		
		for (int i = initial.length() - 1; i >=0 ; i--) {
			
			result = result+initial.charAt(i);
		}
		System.out.println(result);
	}

}
