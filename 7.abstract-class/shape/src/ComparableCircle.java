public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }
    @Override
    public int compareTo(ComparableCircle object) {
        if (this.getRadius() > object.getRadius()) {
            return 1;
        } else if (this.getRadius() < object.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
