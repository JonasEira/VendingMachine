package se.lexicon;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StandardVendingMachine implements VendingMachine {
    private final String name;
    private int depositPool;

    private Product[] stockedProducts;

    public StandardVendingMachine(String my_vendingMachine) {
        this.name = my_vendingMachine;
        this.depositPool = 0;
        this.stockedProducts = new Product[0];

    }

    @Override
    public void addCurrency(int i) {
        this.depositPool += i;
    }

    @Override
    public int endSession() {
        return 0;
    }

    public void addProduct(Product p) {
        int lenProd = this.stockedProducts.length;
        Product[] tmp = new Product[lenProd + 1];
        for (int n = 0; n < lenProd; n++) {
            tmp[n] = this.stockedProducts[n];
        }
        tmp[lenProd] = p;
        this.stockedProducts = tmp;
    }

    @Override
    public int getBalance() {
        return this.depositPool;
    }

    @Override
    public String getDescription(int i) {
        if (i >= 0 && i < stockedProducts.length) {
            return stockedProducts[i].getDesc();
        } else {
            throw new ArrayIndexOutOfBoundsException("Index not in product array limits");
        }
    }

    @Override
    public String[] getProducts() {
        String[] tmp = new String[stockedProducts.length];
        try {
            int n = 0;
            while (n < tmp.length) {
                String s = stockedProducts[n].getClass().getName();
                Class<?> clazz = Class.forName(s);
                Method m = clazz.getMethod("getName");
                tmp[n] = (String) m.invoke(stockedProducts[n]);
                n++;
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return tmp;
    }

    @Override
    public Product request(int productNumber) {
        int cost = this.stockedProducts[productNumber].getPrice();
        if (this.depositPool >= cost) {
            this.depositPool -= cost;
            return this.stockedProducts[productNumber];
        } else {
            return null;
        }
    }

}
