package Module_5.dz_4;

import Module_5.dz_1_2.Room;
import Module_5.dz_3.API;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Z570 on 02.03.2017.
 */
public class GoogleAPI implements API {

    private Room[] googleRooms;

    public GoogleAPI() {
        googleRooms = new Room[5];
        googleRooms[0] = new Room(11, 200, 1, new Date(), "Hotel Name 1", "City Name 1");
        googleRooms[1] = new Room(12, 300, 2, new Date(), "Hotel Name 4", "City Name 4");
        googleRooms[2] = new Room(13, 200, 1, new Date(), "Hotel Name 3", "City Name 3");
        googleRooms[3] = new Room(14, 400, 3, new Date(), "Hotel Name 4", "City Name 4");
        googleRooms[4] = new Room(15, 600, 4, new Date(), "Hotel Name 3", "City Name 3");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> findedRoomsL = new ArrayList<>();
        for (int i = 0; i < googleRooms.length; i++) {

            if(googleRooms[i].getPrice() == price && googleRooms[i].getPersons() == persons && googleRooms[i].getCityName().equals(city) && googleRooms[i].getHotelName().equals(hotel)){
                findedRoomsL.add(googleRooms[i]);
            }
        }
        Room[] findedRooms = new Room[findedRoomsL.size()];
        for (int i = 0; i < findedRoomsL.size(); i++) {
            findedRooms[i] = findedRoomsL.get(i);
        }

        return findedRooms;
    }
}
