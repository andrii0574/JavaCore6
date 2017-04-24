package Module_8;

import java.util.List;
import java.util.Set;

/**
 * Created by Z570 on 25.04.2017.
 */
public interface IManageSystem <T> {
    T save(T obj, double price);
    T save(T obj);
    void delete(T obj) ;
    void deleteById(int id);
    T get(int id);
    Double getPrice(T obj);
    Set<T> getProducts();
    List<Double> getPrices();
}
