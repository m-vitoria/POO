package Exercício3;
import java.util.Locale;
import java.util.Scanner;

public class principal3 {
    public static void main(String[] args) {
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario fun = new Funcionario();

        System.out.print("Name: ");
        fun.setName(sc.nextLine());

        System.out.print("Gross salary: ");
        fun.setGrossSalary(sc.nextDouble());

        System.out.print("Tax: ");
        fun.setTax(sc.nextDouble());

        System.out.println();              
        System.out.println("Employee: " + fun);              
        System.out.println();              
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();              
        fun.setGrossSalary(percentage);   

        System.out.println();              
        System.out.println("Updated data: " + fun.aumento(percentage));              
        sc.close();
    }
}