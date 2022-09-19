import java.util.Scanner;
public class metertokm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dist;
        System.out.println("Enter distance in meter ");
        dist = sc.nextInt();
        System.out.println("The distance in Kilometer is " + dist / 1000);
    }
}