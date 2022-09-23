package Exercício3;

public class Funcionario {
    String name;
    double grossSalary;
    double tax;
    double increaseSalary;

    public String getName(){
        return name;
    }
    public double getGrossSalary(){
        return grossSalary;
    }
    public double getTax(){
        return tax;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double setGrossSalary(double grossSalary){
        return this.grossSalary = grossSalary;
    }
    public double setTax(double tax){
        return this.tax = tax;
    }

    public double salary(){
        double salary = grossSalary - tax;
        return salary;
    }
    public double aumento(double percentage){
        double aumentoSalary = grossSalary + (grossSalary * (percentage / 100));
        return aumentoSalary;
    }

}