import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        char choice;
        float radius,length,breath,side,base,hieght;
        System.out.println("Calculate the Area of following");
        System.out.println("\nA)Circle\nB)Square\nC)Rectangle\nD)Triangle");
        System.out.println("\nEnter your choice");
        Scanner sc=new Scanner(System.in);
        choice=sc.next().charAt(0);
        switch (choice)
        {
            case 'A':
                System.out.println("Enter Radius of circle");
                radius=sc.nextFloat();
                System.out.println("Area of Circle is "+(3.14*radius*radius));
                break;
            case 'B':
                System.out.println("Enter side of Square");
                side=sc.nextFloat();
                System.out.println("Area of Square is "+side*side);
                break;
            case 'C':
                System.out.println("Enter lenght of Rectangle");
                length=sc.nextFloat();
                System.out.println("Enter breath of Rectangle");
                breath=sc.nextFloat();
                System.out.println("Area of Rectangle is "+length*breath);
                break;
            case 'D':
                System.out.println("Enter Base of Triangle");
                base=sc.nextFloat();
                System.out.println("Enter hieght of Triangle");
                hieght=sc.nextFloat();
                System.out.println("Area of Triangle is "+0.5*base*hieght);
                break;
            default:
                System.out.println("Invalid input given.");
        }
    }
}
