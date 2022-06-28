package se.lexicon;
/*
 * A generic interface for vending machines.
 */
public interface VendingMachine {

    public void addCurrency(int i);

    public int endSession();

    public int getBalance();

    public String getDescription(int i);

    public String[] getProducts();

    public Product request(int i);

}
