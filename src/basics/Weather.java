package basics;

public class Weather {
public static void main(String[] args) {
	//what to wear based on the weather
	
	double temp;
	temp = 14;
	
	if (temp < 15) {
		System.out.println("Wear jacket");
	} else if (temp > 28) {
		System.out.println("It's really hot!");
	} else {
		System.out.println("The weather is very nice, wear t-shirt and shorts");
	}
	
}
}
