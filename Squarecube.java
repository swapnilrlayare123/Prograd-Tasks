import java.util.Scanner;
public class Squarecube{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        num=sc.nextInt();
        System.out.println("Square of "+num+" is "+num*num);
        System.out.println("Cube of "+num+" is "+num*num*num);
    }
}

