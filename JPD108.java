import java.util.Scanner;

public class JPD108 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            System.out.printf("%.4f\n",f(x));
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("error");
        }    
    }

    public static double f(double num) {
        double ans = 2 *num *num *num + 3 *num -1;
        return ans;
    }
}
