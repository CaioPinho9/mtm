public class Main {
    public static void main(String[] args) {
        int n = 9;
        int m = 3;
        float a;

        a = Pro(m, n, 0) * 0.25f;
        System.out.println(a);
    }

    public static float Sum(int m, int n, int index) {
        float a = 0;
        for (int i = m; i<=n; i++) {
            if (index == 0) {
                a += fourJ(i);
            } else {
                a += twoJ(i);
            }
        }
        return a;
    }

    public static float Pro(int m, int n, int index) {
        float a = 1;
        for (int i = m; i<=n; i++) {
            if (index == 0) {
                a *= k3(i);
            } else {
                a *= h2(i);
            }
        }
        return a;
    }

    public static float iMinus1(int i) {
        return (float) Math.pow((i - 1), 2);
    }

    public static float ii(int i) {
        return i*i;
    }

    public static float i3i2(int i){
        return (float) (Math.pow(i, 3) - Math.pow(i, 2) + 1);
    }

    public static float sevenI(int i) {
        return i*7;
    }

    public static float threeMinusI(int i) {
        return (float) Math.pow((3-i),2);
    }

    public static float fourJ(int j) {
        return (float) ((4*j - 3) * Math.pow(j, 2));
    }

    public static float twoJ(int j) {
        return (float) 2 * j;
    }

    public static float k3(int k) {
        return (float) (Math.pow(k, 3) - (2/3) * Pro(4,2,1));
    }

    public static float h2(int h) {
        return (float) Math.pow(h, 2) - 1;
    }

    public static float threeMinusI2(int i) {
        return (float) Math.pow((3 - Math.pow(i, 2)), 2);
    }
}
