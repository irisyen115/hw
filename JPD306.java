import java.util.*;

public class JPD306{
    public static void main (String argv[]) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        m = sc.nextInt();
        while (m != 999) {
            n = sc.nextInt();
            System.out.println(powerOf(m, n));
            System.out.println("Input:");
            m = sc.nextInt();
        }
    }  
        static int powerOf (int m, int n) {
            int total = 1;
            while (n > 0) {
            total *= m;
            n--;
            }
        return total;
        }
}