package se.lexicon;

public class Main {
    public static void main(String... args){
        StandardVendingMachine svm = new StandardVendingMachine("My VendingMachine");
        svm.addCurrency(Currency.SEK500.getValue());
        int balance = svm.getBalance();
        System.out.println("Balansen på kontot är: "  + balance);
        Fruit apple = new Fruit("Apple","Sweet",Currency.SEK20.getValue());
        svm.addProduct(apple);
        for(String s : svm.getProducts()){
            System.out.println("Products: " + s);
        }
    }
}