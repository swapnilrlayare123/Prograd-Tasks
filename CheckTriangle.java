import java.util.Scanner;
public class CheckTriangle {
    public static void main(String[] args) {
        int s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First angle");
        s1=sc.nextInt();
        System.out.println("Enter the Second angle");
        s2=sc.nextInt();
        System.out.println("Enter the Third angle");
        s3=sc.nextInt();
        if(s1==0||s2==0||s3==0)
        {
            System.out.println("It is not  a valid Triangle");
        }
        else {
            if (s1 + s2 + s3 == 180) {
                System.out.println("It is a valid Triangle");
            }
            else {
                System.out.println("It is not  a valid Triangle");
            }
        }
    }
}
