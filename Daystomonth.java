import java.util.Scanner;
public class Daystomonth {
    public static void main(String[] args) {
        int days;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days");
        days=sc.nextInt();
        System.out.println(days/30+" Months "+days%30+" days");
    }
}
