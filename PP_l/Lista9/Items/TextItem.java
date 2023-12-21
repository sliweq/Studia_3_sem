package Items;
public class TextItem extends Item {
    private String text;
    public TextItem(Point point, String text){
        super(point);
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
}
