import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte perc;
        System.out.println("Enter the percentage ");
        perc=sc.nextByte();
        if(perc>=40)
        {
            System.out.println("The Student Have passed");
        }
        else
        {
            System.out.println("The Student Have Failed");
        }
    }
}
