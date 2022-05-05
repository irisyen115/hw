import java.util.Scanner;

public class JPD202 {

	public static void main(String[] args) {

		// TO DO
		int a =0;
		try {
			Scanner sc = new Scanner(System.in);
			// TO DO
			a =sc.nextInt();

		} catch (Exception e) {
			System.out.println("error");
            return;
		}
			if (a %2 ==0){
				System.out.print(a  + " is an even number.");

			}else{
				System.out.print( a + " is an odd number.");
			}
		    
	}


}