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
    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }
    public void setTax(double tax){
        this.tax = tax;
    }

    public double salary(){
        double salary = grossSalary - tax;
        return salary;
    }
    public void aumento(double percentage){
        this.grossSalary = this.salary() + (this.grossSalary * 0.10);
    }

}