import java.util.Scanner;
public class Primeno {
    public static void main(String[] args) {
        int num,i;
        boolean prime=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        for(i=2;i<(num/2);i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }
        }
        if(prime)
        {
            System.out.println("Given Number is prime");
        }
        else{
            System.out.println("given number is not prime");
        }
    }
}