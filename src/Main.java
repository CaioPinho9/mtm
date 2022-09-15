public class Main {
    public static void main(String[] args) {
        //Último index
        int n = 9;
        //Index inicial
        int m = 3;
        //Resultado
        float a;

        // Escolha se vai utilizar Soma ou Produto
        // (m, n, 0) -> 0 significa que é a equação externa
        // Enquanto 1 é usado para quando tem um somatório ou produto dentro do outro
        // a = Sum(m, n, 0)
        a = Pro(m, n, 0) * 0.25f;
        // Mostrar Resultado
        System.out.println(a);
    }

    public static float Sum(int m, int n, int index) {
        //Resultado da soma
        float a = 0;

        //De m até n
        for (int i = m; i<=n; i++) {
            if (index == 0) {
                //Somatório externo
                //Troque o metódo pela equação que deseja utilizar
                a += fourJ(i);
            } else {
                //Somatório interno
                //Troque o metódo pela equação que deseja utilizar
                a += twoJ(i);
            }
        }
        //Retorna o resultado
        return a;
    }

    public static float Pro(int m, int n, int index) {
        //Resultado do produto
        float a = 1;

        //De m até n
        for (int i = m; i<=n; i++) {
            if (index == 0) {
                //Somatório externo
                //Troque o metódo pela equação que deseja utilizar
                a *= k3(i);
            } else {
                //Somatório interno
                //Troque o metódo pela equação que deseja utilizar
                a *= h2(i);
            }
        }
        return a;
    }

    //(i - 1)^2
    public static float iMinus1(int i) {
        return (float) Math.pow((i - 1), 2);
    }

    //i^2
    public static float ii(int i) {
        return i*i;
    }

    //i^3 - i^2 + 1
    public static float i3i2(int i){
        return (float) (Math.pow(i, 3) - Math.pow(i, 2) + 1);
    }

    //7i
    public static float sevenI(int i) {
        return i*7;
    }

    //(3 - i)^2
    public static float threeMinusI(int i) {
        return (float) Math.pow((3-i),2);
    }

    //(4j - 3) * j^2
    public static float fourJ(int j) {
        return (float) ((4*j - 3) * Math.pow(j, 2));
    }

    //2j
    public static float twoJ(int j) {
        return (float) 2 * j;
    }

    //k^3 - (2/3) * Produto interno(4, 2, 1)
    public static float k3(int k) {
        return (float) (Math.pow(k, 3) - (2/3) * Pro(4,2,1));
    }

    //h^2 - 1
    public static float h2(int h) {
        return (float) Math.pow(h, 2) - 1;
    }

    //(3 - i^2)^2
    public static float threeMinusI2(int i) {
        return (float) Math.pow((3 - Math.pow(i, 2)), 2);
    }
}
