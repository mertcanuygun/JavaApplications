import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int radius;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");

        radius = input.nextInt();

        double area = pi * radius * radius;
        double perimeter = 2 * pi * radius;

        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);

        int angle;

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the angle: ");
        angle = input2.nextInt();

        double arcArea = (pi * radius * radius * angle) / 360;

        System.out.println("The arc area is: " + arcArea);
    }
}
