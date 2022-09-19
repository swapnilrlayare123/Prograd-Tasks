import java.util.Scanner;
public class Choice {
    public static void main(String[] args) {
        int choice;
        int num,num2;
        System.out.println("Menu");
        System.out.println("1.given number is even or odd \n2. given number is positive or negative \n3. find maximum between given two numbers \n4. convert days into months and remaining days");
        System.out.println("\nEnter your choice");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter a number ");
                num=sc.nextInt();
                if(num%2==0)
                    System.out.println("The given number is even");
                else
                    System.out.println("The given number is odd");
                break;
            case 2:
                System.out.println("Enter a number ");
                num=sc.nextInt();
                if(num>0)
                    System.out.println("The given number is Positive");
                else
                    System.out.println("The given number is Negative");
                break;
            case 3:
                System.out.println("Enter the first number ");
                num=sc.nextInt();
                System.out.println("Enter the second number ");
                num2=sc.nextInt();
                if(num>num2)
                    System.out.println("The greater number is "+num);
                else
                    System.out.println("The greater number is "+num2);
                break;
            case 4:
                System.out.println("Enter number of days");
                num=sc.nextInt();
                System.out.println(""+(num/30)+" Months "+(num%30)+" Days");
                break;
            default:
                System.out.println("Invalid input given.");
        }
    }
}
