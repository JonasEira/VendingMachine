package se.lexicon;

public class Main {
    public static void main(String... args){
        StandardVendingMachine svm = new StandardVendingMachine("My VendingMachine");
        svm.addCurrency(Currency.SEK500.getValue());
        int balance = svm.getBalance();
        System.out.println("Balansen på kontot är: "  + balance);

        svm.addProduct(new Fruit("Apple","Sweet",Currency.SEK20.getValue()));
        System.out.println("Products: " + svm.getProducts());
    }
}