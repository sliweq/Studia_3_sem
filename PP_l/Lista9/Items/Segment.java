package Items;
public class Segment extends Primitive{
    private Point startPoint;
    private Point endPoint;

    public Segment(Point point,Point startPoint, Point endPoint){
        super(point);
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return this.startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
    
    public int getLength(){
        return (int) Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) + Math.pow(endPoint.getY() - startPoint.getY(), 2));
    }

}
