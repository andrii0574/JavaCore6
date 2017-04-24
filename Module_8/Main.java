package Module_8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Z570 on 25.04.2017.
 */
public class Main implements IManageSystem {

    private static Map<Food, Double> database = new HashMap<>();

    @Override
    public Object save(Object obj, double price) {
        return null;
    }

    @Override
    public Object save(Object obj) {
        return null;
    }

    @Override
    public void delete(Object obj) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Object get(int id) {
        return null;
    }

    @Override
    public Double getPrice(Object obj) {
        return null;
    }

    @Override
    public Set getProducts() {
        return null;
    }

    @Override
    public List<Double> getPrices() {
        return null;
    }

    public static void main(String[] args) {
        Food food1 = new Food(IdGenerator.generateID(), "food1Name", Country.AUSTRALIA, 5);
        Food food2 = new Food(IdGenerator.generateID(), "food2Name", Country.CANADA, 3);
        Food food3 = new Food(IdGenerator.generateID(), "food3Name", Country.UKRAINE, 8);
        Food food4 = new Food(IdGenerator.generateID(), "food4Name", Country.USA, 15);
        Food food5 = new Food(IdGenerator.generateID(), "food5Name", Country.NEW_ZELAND, 32);

        database.put(food1, 123.23);
        database.put(food2, 234.34);
        database.put(food3, 345.45);
        database.put(food4, 456.56);
        database.put(food5, 678.78);

        System.out.println(database);
    }
}
