package Exercício2;

public class Rectangle {
    private double width;
    private double height;

    public double getwidth() {
        return this.width;
    }
    public double getheight(){
        return this.height;
    }
    public void setwidth(double width) {
        this.width = width;
    }
    public void setheight(double height) {
        this.height = height;
    }

    public double Area() {
    
        double calcArea = this.getwidth() * this.getheight();
        return calcArea;
    }
    

    public double Perimeter() {
        
            double calcperimeter = (width * 2) + (height * 2);
            return calcperimeter;
    }
    

    public double Diagonal() {
    
            double calcdiagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
            return calcdiagonal;
       
    }
       
    }

