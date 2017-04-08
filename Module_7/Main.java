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
    User user7 = new User(7, "FirstName7", "Petrov", "City2", 800);
    User user8 = new User(8, "FirstName8", "LastName5", "City6", 5600);
    User user9 = new User(9, "FirstName9", "Petrov", "City7", 2300);
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

        ///////////////////////////////// TreeSet /////////////////////////////////////////////////////////////

        Set<Order> treeSetOrders = new TreeSet<>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int res = o1.getPrice().compareTo(o2.getPrice());
                if (res != 0) {
                    return -res;
                }
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });

        treeSetOrders.add(order1);
        treeSetOrders.add(order2);
        treeSetOrders.add(order3);
        treeSetOrders.add(order4);
        treeSetOrders.add(order5);
        treeSetOrders.add(order6);
        treeSetOrders.add(order7);
        treeSetOrders.add(order8);
        treeSetOrders.add(order9);
        treeSetOrders.add(order10);


        Iterator<Order> iterator = treeSetOrders.iterator();
        System.out.println("\nIf User LastName Petrov");
        for (int i = 0; i < treeSetOrders.size(); i++) {
            Order treeSet = iterator.next();
            if (treeSet.getUser().getLastName().equals("Petrov")) {
                System.out.println("ID "+treeSet.getId()+" | ItemName: "+ treeSet.getItemName()+" | Price: "+ treeSet.getPrice()+" "+ treeSet.getCurrency()+" | User LastName: "+ treeSet.getUser().getLastName());
            }
        }

        Iterator<Order> iterator2 = treeSetOrders.iterator();
        System.out.println("\nOrder with MAX price:");
        BigDecimal maxPrice = null;
        for (int i = 0; i < treeSetOrders.size(); i++) {
            Order treeSet = iterator2.next();
            if (maxPrice == null){
                maxPrice = treeSet.getPrice();
            }
            if (treeSet.getPrice().compareTo(maxPrice) == 1 || treeSet.getPrice().compareTo(maxPrice) == 0){
                System.out.println("ID "+treeSet.getId()+" | ItemName: "+ treeSet.getItemName()+" | Price: "+ treeSet.getPrice()+" "+ treeSet.getCurrency()+" | User LastName: "+ treeSet.getUser().getLastName());
            }

        }

        Iterator<Order> iterator3 = treeSetOrders.iterator();
        System.out.println("\nOrders Only With EUR Currency:");
        while (iterator3.hasNext()) {
            Order treeSet = iterator3.next();
            if (treeSet.getCurrency().equals(Currency.USD)) {
                iterator3.remove();
            }

            if (treeSet.getCurrency().equals(Currency.EUR)) {
                System.out.println("ID "+treeSet.getId()+" | ItemName: "+ treeSet.getItemName()+" | Price: "+ treeSet.getPrice()+" "+ treeSet.getCurrency()+" | User LastName: "+ treeSet.getUser().getLastName());

            }

        }


        long startIntArListTime = System.nanoTime();
        List<Integer> integersList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            integersList.add(i);
        }
        long finishIntArListTime = System.nanoTime();
        long IntArListTime = finishIntArListTime - startIntArListTime;
        System.out.println("\nTime of building Integer ArrayList with 1000 Items: " + String.format("%,12d", IntArListTime) + " ns");
        /////////////////////////////////////////
        startIntArListTime = System.nanoTime();
        List<Integer> integersList2 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            integersList2.add(i);
        }
        finishIntArListTime = System.nanoTime();
        IntArListTime = finishIntArListTime - startIntArListTime;
        System.out.println("\nTime of building Integer ArrayList with 10000 Items: " + String.format("%,12d", IntArListTime) + " ns");

        //-------------------------------------------------------------------------------------------------------------------------------

        long startStrArListTime = System.nanoTime();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            stringList.add("String i");
        }
        long finishStrArListTime = System.nanoTime();
        long strArListTime = finishStrArListTime - startStrArListTime;
        System.out.println("\nTime of building String ArrayList with 1000 Items: " + String.format("%,12d", strArListTime) + " ns");
        /////////////////////////////////////////
        startStrArListTime = System.nanoTime();
        List<String> stringList2 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            stringList2.add("String i");
        }
        finishStrArListTime = System.nanoTime();
        strArListTime = finishStrArListTime - startStrArListTime;
        System.out.println("\nTime of building String ArrayList with 10000 Items: " + String.format("%,12d", strArListTime) + " ns");

        //-------------------------------------------------------------------------------------------------------------------------------

        long startIntArLListTime = System.nanoTime();
        List<Integer> integersLList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            integersLList.add(i);
        }
        long finishIntArLListTime = System.nanoTime();
        long IntArLListTime = finishIntArLListTime - startIntArLListTime;
        System.out.println("\nTime of building Integer LinkedList with 1000 Items: " + String.format("%,12d", IntArLListTime) + " ns");
        /////////////////////////////////////////
        startIntArLListTime = System.nanoTime();
        List<Integer> integersLList2 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            integersLList2.add(i);
        }
        finishIntArLListTime = System.nanoTime();
        IntArLListTime = finishIntArLListTime - startIntArLListTime;
        System.out.println("\nTime of building Integer LinkedList with 10000 Items: " + String.format("%,12d", IntArLListTime) + " ns");

        //-------------------------------------------------------------------------------------------------------------------------------

        long startStrArLListTime = System.nanoTime();
        List<String> stringLList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            stringLList.add("String i");
        }
        long finishStrArLListTime = System.nanoTime();
        long strArLListTime = finishStrArLListTime - startStrArLListTime;
        System.out.println("\nTime of building String LinkedList with 1000 Items: " + String.format("%,12d", strArLListTime) + " ns");
        /////////////////////////////////////////
        startStrArLListTime = System.nanoTime();
        List<String> stringLList2 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            stringLList2.add("String i");
        }
        finishStrArLListTime = System.nanoTime();
        strArLListTime = finishStrArLListTime - startStrArLListTime;
        System.out.println("\nTime of building String LinkedList with 10000 Items: " + String.format("%,12d", strArLListTime) + " ns");

        /*

        */









    }


}
