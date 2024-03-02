package practice;

public class ex39 {

	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 1; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				for(int k = 1; k < 5; k++) {
					if(i != j && j !=k && i != k) {
						System.out.println(i+""+j+""+k);
						count++;
					}
					
				}
			}
		}
		System.out.println("Number count: "+count);
	}

}
