import java.util.Scanner;
public class Greaternumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3,result;
        System.out.println("Enter the first number");
        num1=sc.nextInt();
        System.out.println("Enter the Second number");
        num2=sc.nextInt();
        System.out.println("Enter the third number");
        num3=sc.nextInt();
        result=num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);
        System.out.println("The gretest number is "+result);
    }
}
