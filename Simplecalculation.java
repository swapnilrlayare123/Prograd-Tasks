import java.util.Scanner;
public class Simplecalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the First number");
        num1=sc.nextInt();
        System.out.println("Enter the Second number");
        num2=sc.nextInt();
        System.out.println("Addition of two numbers is "+(num1+num2));
        System.out.println("substraction of two numbers is "+(num1-num2));
        System.out.println("multplication of two numbers is "+(num1*num2));
        System.out.println("division of two numbers is "+(float)(num1/num2));
    }
}
