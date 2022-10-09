package Exercício4;


import java.util.Scanner;
import java.util.ArrayList;

public class principal4 {
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        Color color = Color.valueOf("Red");

        if (option.equals("r")){
            System.out.println("Width and height: ");
            Rectangle rct = new Rectangle(color, 4,5);
            System.out.println(rct.Area());
            shapes.add(rct);
        }
        if(option.equals("c")){
            System.out.println("Radius: ");
            Circle crc = new Circle(color, 3);
            crc.Area();
            shapes.add(crc);
        }
        sc.close();
    }
}
