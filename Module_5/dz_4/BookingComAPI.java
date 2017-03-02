package Module_5.dz_4;

import Module_5.dz_1_2.Room;
import Module_5.dz_3.API;
import java.util.Date;
/**
 * Created by Z570 on 02.03.2017.
 */
public class BookingComAPI implements API {

    private Room[] bookingRooms;

    public BookingComAPI() {
        bookingRooms = new Room[5];
        bookingRooms[0] = new Room(1, 200, 1, new Date(), "Hotel Name 1", "City Name 1");
        bookingRooms[1] = new Room(2, 300, 2, new Date(), "Hotel Name 2", "City Name 2");
        bookingRooms[2] = new Room(3, 200, 1, new Date(), "Hotel Name 3", "City Name 3");
        bookingRooms[3] = new Room(4, 400, 3, new Date(), "Hotel Name 4", "City Name 4");
        bookingRooms[4] = new Room(5, 600, 4, new Date(), "Hotel Name 5", "City Name 5");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }


}
