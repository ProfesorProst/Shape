package Shapes;

import java.awt.*;

public class Triangle extends Shape{

    double a, b, c, angleC;

    public Triangle(double a, double b, double angleC) throws Exception {

        this.a = a;
        this.b = b;
        this.angleC = angleC;
        this.c = getC();

        if( a + b <= c )
            throw new Exception("Such triangle can`t exist");
    }

    public double getC(){
        return Math.sqrt(a * a + b * b);
    }

    @Override
    double area() {
        return (a * b * Math.sin(angleC)) / 2;
    }

    @Override
    Canvas getCanvas() {
        return null;
    }

    @Override
    public String toString() {
        return "Фигура: треугольник. Площа: " + area() + ".  Гипотенуза: " + c + ". Цвет: " + getColor().toString() + ".";
    }
}
