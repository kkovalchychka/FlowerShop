package decorator;

import flowerStore.Item;

public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item item){
        super(item);
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 13;
    }
}