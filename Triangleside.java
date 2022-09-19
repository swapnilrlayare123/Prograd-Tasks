import java.util.Scanner;
public class Triangleside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1,angle2;
        System.out.println("Enter first angle ");
        angle1 = sc.nextInt();
        System.out.println("Enter Second angle");
        angle2= sc.nextInt();
        System.out.println("The Third angle is " +(180-angle1-angle2));
    }
}