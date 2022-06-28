import java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {

        double a, b, c, uValue;
        Scanner input = new Scanner(System.in);
        System.out.print("a değerini giriniz: ");
        a = input.nextInt();

        System.out.print("b değerini giriniz: ");
        b = input.nextInt();

        c = Math.sqrt(a*a + b*b);

        System.out.println("c değeri: " + c);

        System.out.println("Perimeter of the Triangle: " + (a + b + c));

        uValue = (a + b + c) / 2;
        double area =Math.sqrt((uValue*(uValue-a)*(uValue-b)*(uValue-c)));
        System.out.println("Area of the Triangle: " + area);
    }
}
