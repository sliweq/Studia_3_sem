package Items;
public class Rect extends Shape{
    private int width;
    private int height; 
    public Rect(Point point, int width, int height, boolean filled){
        super(point, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point[] getBoundingBox(){
        Point[] boundingBox = {
        new Point(point.getX(), point.getY()),
        new Point(point.getX() + width, point.getY()),
        new Point(point.getX(), point.getY() + height),
        new Point(point.getX() + width, point.getY() + height)};
        return boundingBox;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }


}
