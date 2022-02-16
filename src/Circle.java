import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, area, circumference, centralAngle;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the rad:");
        r = input.nextInt();

        System.out.print("Please enter the centralAngle:");
        centralAngle= input.nextDouble();

        circumference=2*pi*r;
        area= (pi*(r*r)*centralAngle)/360;

        System.out.println("Area of the circle is:" +area);
        System.out.println("Circumference is:" +circumference);








    }
}