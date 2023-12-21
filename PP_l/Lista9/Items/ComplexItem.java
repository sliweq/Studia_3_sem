package Items;
import java.util.ArrayList;

public class ComplexItem extends Item {
    private ArrayList<Item> items = new ArrayList<Item>();

    public ComplexItem(Point point){
        super(point);
    }
    public void addItem(Item item){
        items.add(item);
    }
    public ArrayList<Item> getItems(){
        return items;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a complex item at (" + point.getX() + ", " + point.getY() + ")");
        for(Item item : items){
            item.draw();
        }
    }
}
