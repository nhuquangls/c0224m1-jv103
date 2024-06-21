public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("Circle").draw();
        shapeFactory.getShape("Square").draw();
        shapeFactory.getShape("Rectangle").draw();
        shapeFactory.getShape("blabla").draw();

    }
}
