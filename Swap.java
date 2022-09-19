import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int num1,num2,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        num1=sc.nextInt();
        System.out.println("Enter second number");
        num2=sc.nextInt();
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping first number is "+num1+" And Second number is "+num2);
    }
}
