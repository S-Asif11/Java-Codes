package NitLab.command_lina_arg;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		double inp=Double.parseDouble(args[0]);
		
		double celsius=((inp-32)*5)/9;
		
		System.out.println("Temp is :"+celsius);
	}

}
