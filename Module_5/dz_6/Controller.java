package Module_5.dz_6;

import Module_5.dz_3.API;
import Module_5.dz_1_2.Room;
import Module_5.dz_4.BookingComAPI;
import Module_5.dz_4.TripAdvisorAPI;
import Module_5.dz_4.GoogleAPI;

import java.util.ArrayList;

/**
 * Created by Z570 on 03.03.2017.
 */
public class Controller {

    public API apis[] = {new BookingComAPI(), new TripAdvisorAPI(), new GoogleAPI()};

    public Room[] requstRooms(int price, int persons, String city, String hotel){
        ArrayList<Room> requstRoomsL = new ArrayList<>();
        for (int i = 0; i < this.apis.length; i++) {

            for (int j = 0; j < apis[i].findRooms(price, persons, city, hotel).length; j++) {
                requstRoomsL.add(apis[i].findRooms(price, persons, city, hotel)[j]);
            }
        }

        Room[] requstedRooms = new Room[requstRoomsL.size()];
        for (int i = 0; i < requstRoomsL.size(); i++) {
            requstedRooms[i] = requstRoomsL.get(i);
            //System.out.println(findedRooms[i]);
        }

        return requstedRooms;
    }
/*
    Room[] check(API api1, API api2){

    }
    */
}
