package Module_5.dz_7;

import Module_5.dz_1_2.Room;
import Module_5.dz_3.API;
import Module_5.dz_4.BookingComAPI;
import Module_5.dz_4.GoogleAPI;
import Module_5.dz_4.TripAdvisorAPI;
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
    private static API api1 = new BookingComAPI();
    private static API api2 = new TripAdvisorAPI();
    private static API api3 = new GoogleAPI();


    public static void main(String[] args) {
        Controller requstHotelRooms = new Controller();

        Room[] sameHotelRooms = requstHotelRooms.requstRooms(PRICE_R, PERSONS_R, CITY_NAME_R, HOTEL_NAME_R);
        System.out.println("Rooms with: price - " + PRICE_R + ", persons - " + PERSONS_R + ", City: " + CITY_NAME_R + " Hotel: " + HOTEL_NAME_R);
        for (int i = 0; i < sameHotelRooms.length; i++) {
            System.out.println("Room with id: " + sameHotelRooms[i].getId());
        }

        requstHotelRooms.check(api1, api2);
        requstHotelRooms.check(api1, api3);
        requstHotelRooms.check(api2, api3);


    }

}
//