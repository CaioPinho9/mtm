import java.util.Scanner;


public class Modulo {
    public static void main(String[] args) {
        boolean loop = true;
        int operacao = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual operação?");
        System.out.println("Ler expressão modular[1]");
        System.out.println("Soma modular[2]");
        System.out.println("Multiplicação modular[3]");

        operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                while (loop) {
                    System.out.print("x = ");
                    String expressao = scanner.nextLine();
                    expressao = scanner.nextLine();
                    expressao = expressao.replace(" ", "");

                    String[] expressaoDividida = expressao.split("mod");
                    int valor = Integer.parseInt(expressaoDividida[0]);
                    int modulo = Integer.parseInt(expressaoDividida[1]);
                    int resultado = valor % modulo;
                    resultado = Negativo(resultado, modulo);
                    System.out.println("x = " + resultado);
                    System.out.print("Deseja continuar? (true/false)");
                    loop = scanner.nextBoolean();
                }
                break;

            case 2:
                while (loop) {
                    System.out.print("x = ");
                    String expressao = scanner.nextLine();
                    expressao = scanner.nextLine();
                    expressao = expressao.replace(" ", "");
                    String[] expressaoDividida = expressao.split("mod");
                    String[] soma = expressaoDividida[0].split("\\+");

                    int valor1 = Integer.parseInt(soma[0]);
                    int valor2 = Integer.parseInt(soma[1]);

                    int modulo = Integer.parseInt(expressaoDividida[1]);
                    int resultado = (valor1 % modulo + valor2 % modulo) % modulo;
                    resultado = Negativo(resultado, modulo);
                    System.out.println("x = " + resultado);
                    System.out.print("Deseja continuar? (true/false)");
                    loop = scanner.nextBoolean();
                }
                break;

            case 3:
                while (loop) {
                    System.out.print("x = ");
                    String expressao = scanner.nextLine();
                    expressao = scanner.nextLine();
                    String[] expressaoDividida = expressao.split("mod");
                    String[] multiplicacao = expressaoDividida[0].split("\\*");

                    int valor1 = Integer.parseInt(multiplicacao[0]);
                    int valor2 = Integer.parseInt(multiplicacao[1]);

                    int modulo = Integer.parseInt(expressaoDividida[1]);
                    int resultado = (valor1 % modulo * valor2 % modulo) % modulo;
                    resultado = Negativo(resultado, modulo);
                    System.out.println("x = " + resultado);
                    System.out.print("Deseja continuar? (true/false)");
                    loop = scanner.nextBoolean();
                }
                break;
        }
    }

    private static int Negativo(int numero, int modulo) {
        if (numero < 0) {
            return numero + modulo;
        }
        return numero;
    }
}
