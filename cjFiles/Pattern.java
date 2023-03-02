import java.util.Scanner;

public class Pattern
{
    public static void main(String args[])
    {
        //for(int i = 1; i <=j ; i++)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the length of the pattern: ");
        int j = scanner.nextInt();

        for(; j >= 1 ; j --)
        {
        for(int i = 1; i <=j ; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
