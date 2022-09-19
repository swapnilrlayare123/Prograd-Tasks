import java.util.Scanner;
public class Insurance {
    public static void main(String[] args) {
        boolean marrital_status,gender;
        Scanner sc=new Scanner(System.in);
        byte age;

            System.out.println("Is Driver married? put true for yes false for no");
            marrital_status=sc.nextBoolean();
            if(marrital_status==true)
            {
                System.out.println("Driver is Insured.");
            }
            else {
                System.out.println("Enter Driver's gender? put true for female false for male");
                gender = sc.nextBoolean();
                System.out.println("Enter Driver's age");
                age = sc.nextByte();

                if (marrital_status == false && gender == false && age > 30)
                {
                    System.out.println("Driver is Insured.");
                } else if (marrital_status == false && gender == true && age > 25) {
                    System.out.println("Driver is Insured.");
                } else
                {
                    System.out.println("Driver is not Insured.");
                }
            }
    }
}
