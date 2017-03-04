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
        }

        return requstedRooms;
    }

    public Room[] check(API api1, API api2){
        ArrayList<Room> checkRoomsL = new ArrayList<>();
        ArrayList<Integer> checkRoomsCountL = new ArrayList<>();
        int countSameRooms = 1;
        for(int i = 0; i < api1.getAllRooms().length; i ++){
            for(int j = 0; j < api2.getAllRooms().length; j ++){
                if (api1.getAllRooms()[i].equals(api2.getAllRooms()[j])){
                    countSameRooms += 1;
                }
            }
            for(int k = i+1 ; k < api1.getAllRooms().length; k ++){
                if (api1.getAllRooms()[i].equals(api1.getAllRooms()[k])){
                    countSameRooms += 1;
                }
            }
             if(countSameRooms > 1) {
                 checkRoomsL.add(api1.getAllRooms()[i]);
                 checkRoomsCountL.add(countSameRooms);
             }
            countSameRooms = 1;
        }

        Room[] checkRooms = new Room[checkRoomsL.size()];
        for (int i = 0; i < checkRoomsL.size(); i++) {
            System.out.println("\nIn " + api1.getClass().getName() + " and " + api2.getClass().getName());
            System.out.println("Same Rooms with: price - " + checkRoomsL.get(i).getPrice() + "; persons - " + checkRoomsL.get(i).getPersons() + "; citi name: " + checkRoomsL.get(i).getCityName());
            System.out.println(checkRoomsCountL.get(i).intValue());
            checkRooms[i] = checkRoomsL.get(i);
        }

        return checkRooms;
    }
 /*   */
}
