public class ElectricBillGenerator {
	public static void main(String args[]) {
		int units = 400;
		double bill = 0;
		switch ((units < 100) ? 0 : 
			(units < 300) ? 1 : 2) {
		
		case 0 :
			bill = units * 1.20;
			System.out.println("The EB bill is "+(int)bill);
			break;
		case 1 :
			bill = 100 * 1.20 + (units - 100) * 2;
			System.out.println("The EB bill is "+(int)bill);
			break;
		case 2 :
			bill = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
			System.out.println("The EB bill is "+(int)bill);
			break;
		}
	}
}

//Output : The EB bill is 820