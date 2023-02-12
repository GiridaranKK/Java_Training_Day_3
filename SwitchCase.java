
public class SwitchCase {

	public static void main(String[] args) {
		int number = 91;
		String number1 = number % 2 == 0 ? "Even" : "Odd";
		switch(number1) {
		case "Even" :
			System.out.print(number+" is "+number1);
			break;
		case "Odd" :
			System.out.println(number+" is "+number1);
			break;
		}
			
	}

}

//Output: 91 is Odd