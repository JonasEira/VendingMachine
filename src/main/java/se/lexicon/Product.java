package se.lexicon;

public class Product {

    private static int counter = 0;
    private String name;

    private String desc;

    private int price;

    public Product(String name, String desc, int price){
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public Product() {
        this("Default product name" + counter++, "Default product description.", Currency.SEK1.getValue());
    }
    public String examine() {
        return "Default - Not a product";
    }
    public String use() {
        return "Default behaviour - Cannot be eaten";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
