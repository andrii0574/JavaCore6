package Module_5.dz_7;

import Module_5.dz_1_2.Room;
import Module_5.dz_4.BookingComAPI;
import Module_5.dz_6.Controller;

import java.util.Arrays;

/**
 * Created by Z570 on 03.03.2017.
 */
public class Main {

    private static final int PRICE_R = 200;
    private static final int PERSONS_R = 1;
    private static final String CITY_NAME_R = "City Name 3";
    private static final String HOTEL_NAME_R = "Hotel Name 3";

    public static void main(String[] args) {
        Controller requstHotelRooms = new Controller();
        //System.out.println(Arrays.toString(requstHotelRooms.requstRooms(PRICE_R, 1, "City Name 3", "Hotel Name 3")));
        Room[] sameRooms = requstHotelRooms.requstRooms(PRICE_R, PERSONS_R, CITY_NAME_R, HOTEL_NAME_R);
        System.out.println("Rooms with: price - " + PRICE_R + ", persons - " + PERSONS_R + ", City: " + CITY_NAME_R + " Hotel: " + HOTEL_NAME_R);
        for (int i = 0; i < sameRooms.length; i++) {
            System.out.println("Room with id: " + sameRooms[i].getId());
        }

    }

}
//