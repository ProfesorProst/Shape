package Shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shapes {

    private static final int listBound = 100;
    private static final int randomSidesBound = 100;

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<Shape>();

        Random random = new Random();
        int items = random.nextInt(listBound);
        float r, g, b;
        Color color;

        for (int i = 0; i < items; i++) {
            try {
                Shape shape;
                r = random.nextFloat();
                g = random.nextFloat();
                b = random.nextFloat();
                color = new Color(r, g, b);

                switch (random.nextInt(4)){
                    case 0:
                        shape = new Circle(random.nextInt(randomSidesBound));
                        break;
                    case 1:
                        shape = new Square(random.nextInt(randomSidesBound));
                        break;
                    case 2:
                        shape = new Trapeze(random.nextInt(randomSidesBound), random.nextInt(randomSidesBound),
                                random.nextInt(randomSidesBound));
                        break;
                    case 3:
                        shape = new Triangle(random.nextInt(randomSidesBound), random.nextInt(randomSidesBound),
                                random.nextInt(randomSidesBound));
                        break;
                    default:
                        shape = new Circle(random.nextInt(randomSidesBound));
                        break;
                }

                shape.setColor(color);
                System.out.println(shape.toString());
                shapes.add(shape);
            }
            catch (Exception e){
                System.out.println(e.toString());
            }
        }
    }
}
