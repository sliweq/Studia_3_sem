package Items;
public class Circle extends Shape{ 
    private int radius;
    public Circle(Point point, int radius, boolean filled){
        super(point, filled);
        this.radius = radius;
    }

    @Override
    public Point[] getBoundingBox(){
        Point[] boundingBox = {
        new Point(point.getX(), point.getY()),
        new Point(point.getX() + radius, point.getY()),
        new Point(point.getX(), point.getY() + radius),
        new Point(point.getX() + radius, point.getY() + radius)};
        return boundingBox;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
