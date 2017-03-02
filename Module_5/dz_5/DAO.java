package Module_5.dz_5;

import Module_5.dz_1_2.Room;
/**
 * Created by Z570 on 02.03.2017.
 */
public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);

}
