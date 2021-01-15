package Shapes;

import java.awt.*;

public class Circle extends Shape {

    private double r;

    public Circle(double radius) throws Exception {
        if(radius < 0)
            throw new Exception("Such Circle can`t exist");

        r = radius;
    }

    public double getR(){
        return r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }

    @Override
    Canvas getCanvas() {
        return null;
    }

    @Override
    public String toString() {
        return "Фигура: круг. Площа: " + area() + ".  Радіус: " + getR() + ". Цвет: " + getColor().toString() + ".";
    }
}
