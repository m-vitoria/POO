package Exercício1;

public class Exercicio1{
    private double precoDollar;
    private double quantDollar;
    private double valorReais;
   
    public double getPrecoDolar() {
        return this.precoDollar;
    }

    public double getQuantDollar() {
        return this.quantDollar;
    }

    public double getValorComprado() {
        return this.valorReais;
    }
    public double setQuantDollar(double quantDollar){
        return this.quantDollar = quantDollar;
    }
    public double setValorReais(double valorReais) {
        return this.valorReais = valorReais;
    }
}
