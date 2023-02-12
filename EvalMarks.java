public class EvalMarks {

	public static void main(String[] args) {
        int num = 95;

        switch ((90 <= num && num <= 100 ) ? 0 :
                (75 <= num && num <= 90) ? 1 : 
                (50 <= num && num <= 75) ? 2 : 
                (40<= num && num <= 50) ? 3 : 4) {

            case 0:
                System.out.println("Excellent");
                break;
            case 1:
                System.out.println("Good");
                break;
            case 2:
                System.out.println("Average");
                break;
            case 3:
                System.out.println("Pass");
                break;
            case 4:
                System.out.println("Fail");
                break;
        }
    }

}

// Output: Excellent