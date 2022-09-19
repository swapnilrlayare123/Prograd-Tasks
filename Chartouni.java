import java.util.Scanner;
public class Chartouni {
    public static void main(String[] args) {
        char in;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Charter");
        in=sc.next().charAt(0);
        System.out.println("The Unicode of "+(int)in);
    }
}
