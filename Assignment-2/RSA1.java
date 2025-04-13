
import java.util.Scanner;

public class RSA1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two valid prime numbers:");
        int p = sc.nextInt();
        int q = sc.nextInt();
        boolean flag = false;
        for (int i = 2; (i < p && i < q); i++) {
            if (p % i == 0 || q % i == 0) {
                flag = true;
            }
        }
        if (!flag) {
            int n = p * q;
            int fi = (p - 1) * (q - 1);
            System.out.println("Enter a Message:");
            int msg = sc.nextInt();
            System.out.println("Enter a value of e:");
            int e = sc.nextInt();

            while (gcd(e, fi) != 1) {
                System.out.println("Invalid e, enter a value such that gcd(e, fi) = 1:");
                e = sc.nextInt();
            }

            int d = 0;
            for (int j = 1;; j++) {
                if ((e * j) % fi == 1) {
                    d = j;
                    break;
                }
            }

            int ciphermain = 1;
            for (int i = 0; i < e; i++) {
                ciphermain = (ciphermain * msg) % n;
            }
            System.out.println("Cipher: " + ciphermain);

            int message = 1;
            for (int i = 0; i < d; i++) {
                message = (message * ciphermain) % n;
            }
            System.out.println("Message: " + message);
        } else {
            System.out.println("Entered numbers are not valid primes.");
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
