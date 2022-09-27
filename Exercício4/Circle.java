package Exercício4;

public class Circle extends Shape {
    private double radius;


    public Circle(Color color, int i) {
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double Area() {
        double areaCircle = Math.PI * (radius*radius);
        return areaCircle;
    }
}
