import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập số lượng số nguyên ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count = 0, n = 2;
        while (count < num) {
            boolean prime = true;
            if (n == 2) {
                System.out.println(n);
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.println(n);
                }
            }
            n++;
            count++;

        }
    }
}