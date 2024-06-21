import Shape.Shape;
import Shape.*;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    Map<String, Shape> factory = new HashMap<>();

    public ShapeFactory() {
        factory.put("Circle", new Circle());
        factory.put("Square", new Square());
        factory.put("Rectangle", new Rectangle());
    }
    public Shape getShape(String type) {
        Shape shape = factory.get(type);
        if (shape == null) {
            throw new IllegalArgumentException("Unknow type: " + type);
        }
        return shape;
    }
}
