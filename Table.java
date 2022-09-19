import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        int num, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        num = sc.nextInt();
        System.out.println("Table of "+num+" number is ");
        temp = num;
        for (int i = 1; i<=10; i++) {
            System.out.println(temp + "X" + i + "=" + num * i);
        }
    }
}