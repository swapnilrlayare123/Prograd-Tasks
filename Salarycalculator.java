import java.util.Scanner;
public class Salarycalculator {
    public static void main(String[] args) {
        double bas_sal,TA,DA,HRA,PF;
        System.out.println("Enter Employee's Basic Salary");
        Scanner sc = new Scanner(System.in);
        bas_sal = sc.nextDouble();
        TA=bas_sal*0.1;
        DA=bas_sal*0.15;
        HRA=bas_sal*0.2;
        PF=bas_sal*0.12;
        if(bas_sal>=20000)
        {
            bas_sal=bas_sal+bas_sal*0.1;
        }
        else
        {
            bas_sal=bas_sal+bas_sal*0.2;
        }
        System.out.println("The Gross salary is "+(bas_sal+DA+TA+HRA-PF));
    }

}
