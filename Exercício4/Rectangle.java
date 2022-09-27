package Exercício4;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Color color, int i, int j) {
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }
    
    @Override
    public double Area() {
        double calcArea = this.getWidth() * this.getHeight();
        return calcArea;
  }
}