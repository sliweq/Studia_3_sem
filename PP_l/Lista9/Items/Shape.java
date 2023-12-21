package Items;
abstract class Shape extends Primitive{
    protected boolean filled;   

    public Shape(Point point, boolean filled){
        super(point);
        this.filled = filled;
    }

}
