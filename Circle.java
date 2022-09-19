import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        float radius;
        final double pi=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius Of Circle");
        radius=sc.nextFloat();
        System.out.println("The Perimeter and Area of circle are "+2*pi*radius+" "+pi*radius*radius);
    }
}
