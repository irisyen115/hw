import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Input");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a > b) {
            System.out.printf("%d is large than %d\n",a,b);
        } else{
            System.out.printf("%d is large than %d\n",b,a);
        }
    }
}