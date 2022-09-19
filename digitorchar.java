import java.util.Scanner;
public class digitorchar {
    public static void main(String[] args) {
        char in;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input");
        in=sc.next().charAt(0);
        if((in>= 48 && in <= 57))
        {
            System.out.println("Input is a digit");
        }
        else {
            System.out.println("Input is a Character");
        }
    }
}
