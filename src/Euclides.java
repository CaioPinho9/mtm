import java.util.Scanner;

public class Euclides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int r = n;

        while (r != 0) {
            r = m % n;
            m = n;
            n = r;
        }
        System.out.println(m);
    }
}
