package Module_5.dz_5;

import Module_5.dz_1_2.Room;

import java.util.Date;

/**
 * Created by Z570 on 02.03.2017.
 */
public class DAOImpl implements DAO {

    public Room save(Room room) {
        System.out.println("Save room: " + room.getId());
        return room;
    }

    public boolean delete(Room room) {
        System.out.println("Delete room: " + room.getId());
        return true;
    }

    public Room update(Room room) {
        System.out.println("Save room: " + room.getId());
        return room;
    }

    public Room findById(long id) {
        Room room = new Room(14, 400, 3, new Date(), "Hotel Name 4", "City Name 4");
        System.out.println("Find by id room: " + id);
        return room;
    }
}
