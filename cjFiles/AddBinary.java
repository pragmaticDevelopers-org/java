import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        long binary1 = scanner.nextLong();
        System.out.print("Enter second binary number: ");
        long binary2 = scanner.nextLong();

        int i = 0, remainder = 0;
        int[] sum = new int[20];

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 /= 10;
            binary2 /= 10;
        }

        if (remainder != 0) {
            sum[i++] = remainder;
        }

        --i;

        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.println();
    }
}
