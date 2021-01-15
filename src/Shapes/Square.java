package Shapes;

import java.awt.*;

public class Square extends Shape{

    private double side;

    public Square(double side) throws Exception {
        if(side < 0)
            throw new Exception("Such Square can`t exist");

        this.side = side;
    }

    public double getSide(){
        return  side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    Canvas getCanvas() {
        return null;
    }

    @Override
    public String toString() {
        return "Фигура: квадрат. Площа: " + area() + ".  Сторона: " + getSide() + ". Цвет: " + getColor().toString() + ".";
    }
}
