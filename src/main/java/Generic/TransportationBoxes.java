package Generic;

public class TransportationBoxes implements Shippable<Box>{
    private Box box;
    public TransportationBoxes(Box box){
        this.box = box;
    }

    @Override
    public void ship(Box box){
        this.box = box;
    }

    public Box getBox(){
        return box;
    }
}
