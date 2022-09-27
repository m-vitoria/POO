package Exercício6;

import java.util.Scanner;

public class principal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PessoaIndividual pi = new PessoaIndividual();
        PessoaLegal pl = new PessoaLegal();

        pi.setCpf(sc.nextLine());
        pl.setCnpj(sc.nextLine());
        System.out.println(pi.toString());
        System.out.println(pl.toString());
        sc.close();
    }
}