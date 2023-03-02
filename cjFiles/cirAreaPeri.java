import java.util.Scanner;

public class cirAreaPeri
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double cirArea = Math.PI * Math.pow(radius, 2);
        double cirPeri = 2 * Math.PI * radius;

        System.out.println("Perimeter of the circle is: " + String.format("%.4f", cirPeri));
        System.out.println("Area of the circle is: " + String.format("%.4f", cirArea));
    }
}
