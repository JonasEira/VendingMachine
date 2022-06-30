package se.lexicon;

public class Main {
    public static void main(String... args) {
        StandardVendingMachine svm = new StandardVendingMachine("My VendingMachine");
        svm.addCurrency(Currency.SEK500.getValue());
        int balance = svm.getBalance();
        System.out.println("Balansen på kontot är: " + balance);
        Fruit apple = new Fruit("Apple", "Sweet", Currency.SEK20.getValue());
        Fruit pear = new Fruit("Pear", "Juicy", Currency.SEK20.getValue());
        svm.addProduct(apple);
        svm.addProduct(pear);
        String[] prods = svm.getProducts();
        for (int i = 0; i < prods.length; i++) {
            System.out.print( prods[i] + " ");
        }

        System.out.println(svm.getDescription(0));
        System.out.println(svm.getDescription(1));
        Product p = svm.request(1);
        System.out.println(p.getName() + " " + p.getDesc() + " " + p.getPrice());
        balance = svm.getBalance();
        System.out.println("Balansen på kontot är efter köpet: " + balance);
    }
}