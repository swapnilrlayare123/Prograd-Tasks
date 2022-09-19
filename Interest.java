import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float prinpl_amt;
        int duratn;
        System.out.println("Enter Principal amount");
        prinpl_amt=sc.nextFloat();
        System.out.println("Enter duration in years");
        duratn=sc.nextInt();
        System.out.println("The Simple Interest is "+(7.5*prinpl_amt*duratn)/100);
        System.out.println("The Simple Interest is "+(prinpl_amt+(7.5*prinpl_amt*duratn)/100));
    }
}
