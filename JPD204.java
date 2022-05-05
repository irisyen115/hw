import java.util.Scanner;

public class JPD204 {

	public static void main(String[] args) {

		int a=0,b=0;

		Scanner sc = new Scanner(System.in);
		// TO DO a~b之間有多少質數

		try {
			// TO DO
			a= sc.nextInt();
			b= sc.nextInt();
			if (a > 200||b > 100||a <= 0|| b <= 0){
				throw new Exception();
			}

		} catch (Exception e) {
			System.out.print("error");
			return;
		}
		// TO DO
			for(int i = a; i <=b;i++){
				// i 是不是質數
				if(i == 1) 
				continue;
				int flag =1; // 1 代表是質數
				for(int j = 2;j < i;j++){
					if(i % j ==0){
						flag =0; // 0代表可以整除i
						break;
					}
				}
				if (flag == 1) {
					System.out.println(i);
				}
			}

                 //System.out.println(     );
				 sc.close();

				}

}
