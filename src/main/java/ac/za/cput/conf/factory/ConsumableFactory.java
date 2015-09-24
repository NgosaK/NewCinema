package ac.za.cput.conf.factory;

import ac.za.cput.domain.Beverage;
import ac.za.cput.domain.Food;

import java.util.Map;

/**
 * Created by User on 2015/08/10.
 */
public class ConsumableFactory {

    public static Beverage createBeverage(
            Map<String,String> values, long code, double
            price, double volume) {
        Beverage beverage = new Beverage
                .Builder(code)
                .name(values.get("name"))
                .category(values.get("category"))
                .price(price)
                .volume(volume)
                .build();

        return beverage;

    }

    public static Food createFood(
            Map<String,String> values, long code, double
            price, double weight)
    {
        Food food=new Food
                .Builder(code)
                .price(price)
                .name(values.get("name"))
                .weight(weight)
                .category(values.get("category"))
                .build();

        return food;

    }
}
