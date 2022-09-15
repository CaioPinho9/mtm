import java.util.Locale;
import java.util.Scanner;

public class Lagrange {
    public static void main(String[] args) {
        //Valor x de cada ponto, max 10
        float[] x = new float[10];
        //Valor y de cada ponto, max 10
        float[] y = new float[10];

        //Valor de x0
        float x0;
        //Resultado de x0
        float y0 = 0;

        //ax^2 + bx + c
        float a = 0;
        float b = 0;
        float c = 0;

        //Número de pontos = 3
        int u = 3;
        //Número de elementos
        int n = 0;

        //Manter pedindo pontos S ou N
        String go = "S";

        //Input
        Scanner scanner = new Scanner(System.in);

        //Pedir o x0
        System.out.print("Digite o x: ");
        x0 = scanner.nextInt();

        //Enquanto não mandar parar continue pedindo pontos
        while(go.equals("S")) {

            //Pedir pelo menos 3 pontos
            for (int i = 0; i < u; i++) {
                //Pedir x e y de cada ponto
                System.out.print("Digite o x"+i+": ");
                x[i] = scanner.nextFloat();
                System.out.print("Digite o y"+i+": ");
                y[i] = scanner.nextFloat();
            }
            //Confirmar se deseja continuar adicionando pontos
            System.out.print("Quer adicionar mais um ponto? (S/N)");
            go = scanner.nextLine();
            go = scanner.nextLine();
            go = go.toUpperCase(Locale.ROOT);

            //Atualizar o número de elementos de acordo com o número de pontos.
            n = u - 1;
            //Aumentar o número de pontos caso não tenha quebrado o loop.
            u++;
        }

        //Lagrange
        //Conhecido como Bubble ou Nested loop, loop dentro de loop
        //Loop até o número de elementos
        for (int k = 0; k <= n; k++) {
            //Valores das repostas, 1 para produto e 0 para soma
            float yk = 1;
            float ak = 1;
            float bk = 0;
            float ck = 1;

            //Segundo loop até o número de elementos
            for (int j = 0; j <= n; j++) {
                //Ignora se j == k
                if (k != j) {
                    //Cada conta é mantido o resultado para o proximo loop
                    yk *= (x0 - x[j]) / (x[k] - x[j]);

                    //a = yk se o númerador fosse igual a 1
                    ak *= 1 / (x[k] - x[j]);

                    //b = yk se o x0 fosse igual a 0
                    //Depois que somar todos os númeradores é dividido pelo denominador
                    bk -= x[j];

                    //c = yk se x0 fosse igual a 0
                    ck *= -x[j] / (x[k] - x[j]);
                }
            }
            //Para o b especificamente é necessário somar todos os valores primeiro para depois dividir
            //ak é o denominador de yk, então é possível utilizá-lo como divisor.
            bk *= ak;

            //Multiplicando pelo y desse index
            y0 += yk * y[k];
            a += ak * y[k];
            b += bk * y[k];
            c += ck * y[k];

        }
        //Mostrar Resultado
        System.out.println("O y de x = 0 é " + y0);
        System.out.println(a + "x^2 + " + b + "x + " + c);
    }
}
