package basics;

public class Cities {

	public static void main(String[] args) {
		
		String[] cities = {"Vilnius", "Kaunas", "Jonava"};
		String cars[] = new String[3];
		cars[0] = "BMW";
		cars[2] = "Audi";
		cars[1] = "Toyota";
		
		
		int i = 0;
		
		boolean carIsFound = false;
		
		while (!carIsFound) {
			System.out.println(cars[i]);
			if(cars[i] == "Toyota") {	
				System.out.println("Car is found");
				carIsFound = true;
			}
			i++;
		}
		
		System.out.println("*********");
		for (int j = 0; j < cities.length; j++ ) {
			System.out.println(cities[j]);
		}
		
		System.out.println("*********");
		int k = 0;
		do {
			System.out.println(cities[k]);
			k++;
		} while (k < cities.length);
		
		String name = "Vilnius";
		System.out.println(name.substring(3));

	}

}
