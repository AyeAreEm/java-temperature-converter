import java.util.Scanner;

public class TempConvert {
	
	static Scanner input = new Scanner(System.in);
	
	public static void ConvertToF() {
		System.out.print("Enter °C: ");
		String cTemp = input.nextLine();
		
		int fTemp = Integer.parseInt(cTemp) / 5 * 9 + 32;
		System.out.println("°F: " + fTemp);
	}
	
	public static void ConvertToC() {
		System.out.print("Enter °F: ");
		String fTemp = input.nextLine();
		
		int cTemp = (Integer.parseInt(fTemp) - 32) * 5 / 9;
		System.out.println("°C: " + cTemp);
	}

	public static void main(String[] args) {
		System.out.print("°C to °F or °F to °C (1 or 2): ");
		String corf = input.nextLine();
		
		switch (corf) {
			case "1":
				ConvertToF();
				break;
			
			case "2":
				ConvertToC();
				break;
				
			default:
				System.out.println("That is not an option");
		}
		
	}

}
