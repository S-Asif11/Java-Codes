package com.asif.gettersetter;



import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        double height=Double.parseDouble(sc.nextLine());
        System.out.println("Enter width: ");
        double width=Double.parseDouble(sc.nextLine());

        if(width<0 || height<0){
            System.out.println("Width and height must be non-negative.");
            System.exit(0);
        }
        Rectangle r = new Rectangle(height,width);
        r.getArea();
        r.getPerimeter();




    }
}




 class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }

    public double getArea(){
        System.out.println("Area is: "+(height*width));
        return height*width;
    }

    public double getPerimeter(){
        System.out.println("Perimeter is "+(2*(height + width)));
        return (2*(height + width));

    }
}
