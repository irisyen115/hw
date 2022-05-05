import java.util.Scanner;

public class JPD305 {
    public static void main(String[] args) {
        for (int i = 0;i<3;i++){
            test();
        }
    }

    private static void test() {
        System.out.print("Please enter one value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 10 || n < 1) {
            System.out.println("Error, the value is out of range. ");
        } else {
            int prod = 1;
            for (int i =1;i <= n; i++) {
                prod *= i;
            }
            System.out.printf("%d!: %d\n",n,prod);
            sc.close();
        }
    }
}
