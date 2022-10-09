package Exercício2;

import java.util.Scanner;

public class principal2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();
        
        System.out.print("Digite a largura: ");
        rect.setwidth(sc.nextDouble());
        System.out.print("Digite a altura: ");
        rect.setheight(sc.nextDouble());

        System.out.printf("Area = %.2f%n", rect.Area());
        System.out.printf("Perimeter = %.2f%n", rect.Perimeter());
        System.out.printf("Diagonal = %.2f%n", rect.Diagonal());
        sc.close();

    }

}