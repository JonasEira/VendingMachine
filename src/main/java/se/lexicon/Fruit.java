package se.lexicon;

public class Fruit extends Product {
    public Fruit(String name, String desc, int price){
        super(name, desc, price);
    }
    @Override
    public String examine(){
        return "Looks juicy!";
    }

    @Override
    public String use(){
        return "Mmm. Fruits are healthy and taste good.";
    }
}
