import java.util.Scanner;

public class JPD201 {

	public static void main(String[] args) {
		double num1, num2;

		Scanner sc = new Scanner(System.in);
		// TO DO
		String a = sc.next();
		String b = sc.next();
		try {
			// TO DO
			num1 = Double.parseDouble(a);

		} catch (Exception e) {
			// TO DO
			num1 = 0;
			a = "0";
		}
		// TO DO
		try {
			num2 = Double.parseDouble(b);
		} catch (Exception e) {
			//TODO: handle exception
			num2 = 0;
			b = "0";
		}
		if (num1 > num2){
			System.out.printf("%s>%s\n",a,b);
		} else if (num1 < num2) {
			System.out.printf("%s<%s\n",a,b);
		} else {
			System.out.printf("%s=%s\n",a,b);
		}
		sc.close();
	}
}
