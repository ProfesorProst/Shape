package Shapes;

import java.awt.*;

public class Trapeze extends Shape{

    private double a, b, h;

    public Trapeze(double a, double b, double h){
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getAvgLine(){
        return (a + b) / 2;
    }

    @Override
    double area() {
        return ((a + b) / 2) * h;
    }

    @Override
    Canvas getCanvas() {
        return null;
    }

    @Override
    public String toString() {
        return "Фигура: трапеция. Площа: " + area() + ". Средняя линия: " + getAvgLine() + ". Цвет: " + getColor().toString() + ".";
    }
}
