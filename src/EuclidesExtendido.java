import java.util.Scanner;

public class EuclidesExtendido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int r, q;
        int[] x = new int[3];
        int[] y = new int[3];

        x[0] = 0;
        x[1] = 1;
        y[0] = 1;
        y[1] = 0;

        while (true) {
            r = m % n;

            if (r == 0) {
                break;
            }

            q = m / n;
            m = n;
            n = r;

            x[2] = x[1];
            x[1] = x[0];
            x[0] = x[2] - q * x[1];
            y[2] = y[1];
            y[1] = y[0];
            y[0] = y[2] - q * y[1];
        }
        System.out.println(n);
        System.out.println("x: " + x[0]);
        System.out.println("y: " + y[0]);
    }
}
