package Module_8;

/**
 * Created by Z570 on 24.04.2017.
 */
public class Food {

    private String id = IdGenerator.generateID(); // (ID of product)
    private String name; //(name of product)
    private Country country; // (country, producer)
    private int expiration; // (shelf life of products, days)

    public Food(String id, String name, Country country, int expiration) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public int getExpiration() {
        return expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;

        Food food = (Food) o;

        return getId().equals(food.getId());

    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
