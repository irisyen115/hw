import java.util.Scanner;

/**
 * JPD301
 */
public class JPD301 {

    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1 ; i <=n ; i++ ){
            sum += i;
        }
        System.out.printf("1 + ... + %d = %d\n",n,sum);
        sc.close();
    }
}