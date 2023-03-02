import java.util.Scanner;

public class multiplicationTable
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a integer to be multiplied till 10: ");
        int input1 = scanner.nextInt();

        for(int i = 1; i<=10 ; i++)
        {
            System.out.println(input1 + " x " + i + " = " + input1*i);
        }
    }
}

// The program was completed.
// It was good the program was completed.
