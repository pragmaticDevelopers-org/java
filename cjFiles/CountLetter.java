import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        String str;
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                letter++;
            } else if (Character.isDigit(str.charAt(i))) {
                num++;
            } else if (Character.isSpaceChar(str.charAt(i))) {
                space++;
            } else {
                other++;
            }
        }

        System.out.println("The string is: " + str);
        System.out.println("Letter count: " + letter);
        System.out.println("Space count: " + space);
        System.out.println("Number count: " + num);
        System.out.println("Other count: " + other);
    }
}
