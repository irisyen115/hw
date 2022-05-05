import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * JPD01
 */
public class JPD01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n5 = 0, n10 = 0;
        int total = 0;
        try {
            n1 = sc.nextInt();
            if (n1 < 0) n1 = 0;
        } catch (Exception e) {
            //TODO: handle exception
            sc.next();
        }
        try {
            n5 = sc.nextInt();
            if (n5 < 0) n5 = 0;
        } catch (Exception e) {
            //TODO: handle exception
            sc.next();
        }
        try {
            n10 = sc.nextInt();
            if (n10 < 0 ) n10 = 0;
        } catch (Exception e) {
            //TODO: handle exception
        }

        total = n1 * 1 + n5 *5 + n10 * 10;
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println(formatter.format(total));
    }
}