package Module_7;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Z570 on 04.04.2017.
 */
public class Main {

    private static class OrderComparatorPrice implements Comparator<Order> {
        @Override
        public int compare(Order o1, Order o2) {
            int res = o1.getPrice().compareTo(o2.getPrice());
            if (res != 0) {
                return -res;
            }
            return o1.getPrice().compareTo(o2.getPrice());
        }
    }

    private static class OrderComparatorPriceCity implements Comparator<Order> {
        @Override
        public int compare(Order o1, Order o2) {
            int res = o1.getPrice().compareTo(o2.getPrice());
            if (res != 0) {
                return res;
            }
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }
    }


    public static void main(String[] args) {

    User user1 = new User(1, "FirstName1", "LastName1", "City1", 1200);
    User user2 = new User(2, "FirstName2", "LastName2", "City2", 1400);
    User user3 = new User(3, "FirstName3", "LastName3", "City3", 1500);
    User user4 = new User(4, "FirstName4", "LastName1", "City4", 2300);
    User user5 = new User(5, "FirstName5", "LastName4", "City5", 3200);
    User user6 = new User(6, "FirstName6", "LastName2", "City3", 1050);
    User user7 = new User(7, "FirstName7", "LastName1", "City2", 800);
    User user8 = new User(8, "FirstName8", "LastName5", "City6", 5600);
    User user9 = new User(9, "FirstName9", "LastName6", "City7", 2300);
    User user10 = new User(10, "FirstName10", "LastName5", "City8", 3200);

    Order order1 = new Order(1, BigDecimal.valueOf(32), Currency.USD, "itemName1", "shopIdentificator1", user1);
    Order order2 = new Order(2, BigDecimal.valueOf(250), Currency.USD, "itemName2", "shopIdentificator2", user2);
    Order order3 = new Order(3, BigDecimal.valueOf(362), Currency.USD, "itemName3", "shopIdentificator3", user3);
    Order order4 = new Order(4, BigDecimal.valueOf(232), Currency.EUR, "itemName4", "shopIdentificator4", user4);
    Order order5 = new Order(5, BigDecimal.valueOf(132), Currency.USD, "itemName5", "shopIdentificator5", user5);
    Order order6 = new Order(6, BigDecimal.valueOf(352), Currency.USD, "itemName6", "shopIdentificator6", user6);
    Order order7 = new Order(7, BigDecimal.valueOf(312), Currency.EUR, "itemName7", "shopIdentificator7", user7);
    Order order8 = new Order(8, BigDecimal.valueOf(232), Currency.USD, "itemName8", "shopIdentificator8", user8);
    Order order9 = new Order(9, BigDecimal.valueOf(332), Currency.EUR, "itemName9", "shopIdentificator9", user9);
    Order order10 = new Order(10, BigDecimal.valueOf(352), Currency.USD, "itemName10", "shopIdentificator10", user10);



        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        orders.add(order7);
        orders.add(order8);
        orders.add(order9);
        orders.add(order10);

        Collections.sort(orders, new OrderComparatorPrice());
        System.out.println("Sort Orders By Price (From MAX To MIN):");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println("ID "+orders.get(i).getId() + " | Price " + orders.get(i).getPrice()+" " + orders.get(i).getCurrency()+" | ItemName: "+orders.get(i).getItemName());
        }

        Collections.sort(orders, new OrderComparatorPriceCity());
        System.out.println("\nSort Orders By Price (From MIN To MAX) and User City:");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println("ID "+orders.get(i).getId() + " | Price " + orders.get(i).getPrice()+" " + orders.get(i).getCurrency()+" | User City: "+orders.get(i).getUser().getCity()+" | ItemName: "+orders.get(i).getItemName());
        }

    }


}
