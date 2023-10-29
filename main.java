import java.util.Scanner;

public class main {
    public static void decimalToBinary(int n) {
        int power = 0;
        int decimal = 0;
        while (n > 0) {
            int ld = n % 2;
            decimal = decimal + (ld * (int)Math.pow(10, power));
            power++;
            n = n / 2;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        decimalToBinary(n);
    }
}
