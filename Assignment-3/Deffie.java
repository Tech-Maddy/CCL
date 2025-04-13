
import java.util.Scanner;

public class Deffie {

    public static void main(String[] args) {
        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Prime number:: ");
        int p = sc.nextInt();
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Enter a Primitive root:: ");
            int g = sc.nextInt();
            System.out.println("Enter a value of Xa:: ");
            int Xa = sc.nextInt();
            System.out.println("Enter a value of Xb:: ");
            int Xb = sc.nextInt();
            if ((Xa < p) && (Xb < p)) {
                int Ya = (int) ((Math.pow(g, Xa)) % p);
                int Yb = (int) ((Math.pow(g, Xb)) % p);
                int keyofXa = (int) ((Math.pow(Yb, Xa)) % p);
                int keyofXb = (int) ((Math.pow(Ya, Xb)) % p);
                System.out.println("Key for Xa:: " + keyofXa);
                System.out.println("Key for Xa:: " + keyofXb);
                if (keyofXa == keyofXb) {
                    System.out.println("Wooo !! You can start connection");
                } else {
                    System.out.println("Something went wrong");
                }
            }
        } else {
            System.out.println("Invalid output!!!");
        }
    }
}
