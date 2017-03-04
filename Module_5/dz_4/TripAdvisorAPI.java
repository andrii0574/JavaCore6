package Module_5.dz_4;

import Module_5.dz_1_2.Room;
import Module_5.dz_3.API;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Z570 on 02.03.2017.
 */
public class TripAdvisorAPI implements API {

    private Room[] tripAdvisorRooms;

    public TripAdvisorAPI() {
        tripAdvisorRooms = new Room[5];
        tripAdvisorRooms[0] = new Room(6, 200, 1, new Date(), "Hotel Name 1", "City Name 1");
        tripAdvisorRooms[1] = new Room(7, 300, 2, new Date(), "Hotel Name 2", "City Name 2");
        tripAdvisorRooms[2] = new Room(8, 200, 1, new Date(), "Hotel Name 6", "City Name 6");
        tripAdvisorRooms[3] = new Room(9, 400, 3, new Date(), "Hotel Name 4", "City Name 4");
        tripAdvisorRooms[4] = new Room(10, 200, 1, new Date(), "Hotel Name 3", "City Name 3");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> findedRoomsL = new ArrayList<>();
        for (int i = 0; i < tripAdvisorRooms.length; i++) {

            if(tripAdvisorRooms[i].getPrice() == price && tripAdvisorRooms[i].getPersons() == persons && tripAdvisorRooms[i].getCityName().equals(city) && tripAdvisorRooms[i].getHotelName().equals(hotel)){
                findedRoomsL.add(tripAdvisorRooms[i]);
            }
        }
        Room[] findedRooms = new Room[findedRoomsL.size()];
        for (int i = 0; i < findedRoomsL.size(); i++) {
            findedRooms[i] = findedRoomsL.get(i);
        }

        return findedRooms;
    }
}
