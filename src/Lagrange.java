import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Lagrange {
    public static void main(String[] args) {
        int n = 0;
        float[] x = new float[10];
        float[] y = new float[10];
        float x0;
        float y0 = 0;
        float a = 0;
        float b = 0;
        float c = 0;
        int i = 0;
        int u = 3;
        String go = "S";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o x: ");
        x0 = scanner.nextInt();

        while(go.equals("S")) {
            for (; i < u; i++) {
                System.out.print("Digite o x"+i+": ");
                x[i] = scanner.nextFloat();
                System.out.print("Digite o y"+i+": ");
                y[i] = scanner.nextFloat();
            }
            System.out.print("Quer adicionar mais um ponto? (S/N)");
            go = scanner.nextLine();
            go = scanner.nextLine();
            go = go.toUpperCase(Locale.ROOT);
            n = u - 1;
            u++;
        }

        for (int k = 0; k <= n; k++) {
            float yk = 1;
            float ak = 1;
            float bk = 0;
            float ck = 1;
            for (int j = 0; j <= n; j++) {
                if (k != j) {
                    yk *= (x0 - x[j]) / (x[k] - x[j]);
                    ak *= 1 / (x[k] - x[j]);
                    bk -= x[j];
                    ck *= -x[j];
                }
            }
            for (int j = 0; j <= n; j++) {
                if (k != j) {
                    bk *= 1 / (x[k] - x[j]);
                    ck *= 1 / (x[k] - x[j]);
                }
            }
            y0 += yk * y[k];
            a += ak * y[k];
            b += bk * y[k];
            c += ck * y[k];

        }
        System.out.println("O y de x = 0 é " + y0);
        System.out.println(a + "x^2 + " + b + "x + " + c);
    }
}
