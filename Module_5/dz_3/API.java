package Module_5.dz_3;

import Module_5.dz_1_2.Room;

/**
 * Created by Z570 on 02.03.2017.
 */
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

}
