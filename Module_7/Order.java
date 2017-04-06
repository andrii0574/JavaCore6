package Module_7;

import java.math.BigDecimal;

/**
 * Created by Z570 on 04.04.2017.
 */
public class Order {

    private long id;
    private BigDecimal price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(long id, BigDecimal price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public User getUser() {
        return user;
    }
}
