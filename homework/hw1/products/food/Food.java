package homework.hw1.products.food;

import homework.hw1.products.Product;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Food extends Product {
    public Food(String name, double price, int amount, String unit, Date bestBeforeDate) {
        super(name, price, amount, unit);
        this.bestBeforeDate =;
    }

    private Date bestBeforeDate;

    public Date getBestBeforeDate() {
        return bestBeforeDate;
    }


    public void setBestBeforeDate(Date exDate) {
        this.bestBeforeDate = exDate;
    }


    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return "Food" +
                super.toString().replace("}", ", Best before date = " + formatter.format(bestBeforeDate) + "}");
    }

}

}
