package lab3;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        lab3.FactoryShare factoryShare = new lab3.FactoryShare();
        ArrayList<lab3.Shape> shapes = new ArrayList<>();
        shapes.add(factoryShare.getShape("квадрат"));
        shapes.add(factoryShare.getShape("точка"));
        shapes.add(factoryShare.getShape("коло"));

        for(lab3.Shape shape : shapes){
            int x = new Random().nextInt(101);
            int y = new Random().nextInt(101);
            shape.draw(x, y);
        }

    }
}
