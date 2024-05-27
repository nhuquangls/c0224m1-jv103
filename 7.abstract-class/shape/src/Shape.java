public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "Green";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected boolean isFilled() {
        return filled;
    }

    protected void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if(filled) {
            return "A Shape with color off " + this.color +
                    " and filled";
        } else {
            return "A Shape with color off " + this.color +
                    " and not filled";
        }
    }
}
