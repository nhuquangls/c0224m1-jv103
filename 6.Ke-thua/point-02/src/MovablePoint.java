public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint move() {
        this.setX(this.getX() + this.getxSpeed());
        this.setY(this.getY() + this.getySpeed());
        return this;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f), speed = (%f,%f)", this.getX(), this.getY(), this.getxSpeed(), this.getySpeed());
    }
}
