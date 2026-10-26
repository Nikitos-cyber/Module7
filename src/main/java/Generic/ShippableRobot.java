package Generic;

public class ShippableRobot implements Shippable{
    private Object contents;
    @Override
    public void ship(Object object){
        this.contents = object;
    }

    public Object getContents(){
        return contents;
    }
}
