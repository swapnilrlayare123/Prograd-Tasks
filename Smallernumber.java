import java.util.Scanner;
public class Smallernumber {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        num1=sc.nextInt();
        System.out.println("Enter second number");
        num2=sc.nextInt();
        if(num1>num2) {
            System.out.println("The smaller number is " +num2);
        }
        else {
            System.out.println("The smaller number is " +num1);
        }
    }
}
