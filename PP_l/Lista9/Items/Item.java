package Items;
abstract class Item {

    protected Point point;

    public Item(Point point){
        this.point = point;
    }

    public Point getPoint(){return point;}

    public void setPoint(Point point){this.point = point;}

    public void translate(Point point_translate) {
        point.setX(point.getX() + point_translate.getX());
        point.setY(point.getY() + point_translate.getY());
    }

    public Point[] getBoundingBox(){
        Point[] boundingBox = {
        new Point(0, 0),
        new Point(0, 0),
        new Point(0, 0),
        new Point(0, 0)};
        
        return boundingBox;
    }

    public void draw(){
        System.out.println("Drawing an item at (" + point.getX() + ", " + point.getY() + ")");
    }
}
