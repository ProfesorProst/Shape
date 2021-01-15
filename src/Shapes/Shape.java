package Shapes;

import java.awt.*;

public abstract class Shape {

    private Color color;

    abstract double area();
    abstract Canvas getCanvas();

    public Color getColor(){
        return color;
    };

    public void setColor(Color color){
        this.color = color;
    };

    @Override
    public abstract String toString();
}
