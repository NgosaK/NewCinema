package ac.za.cput.services;

import ac.za.cput.domain.ScreeningRoom;

import java.util.List;

/**
 * Created by User on 2015/08/10.
 */
public interface ScreeningRoomService {

    List<ScreeningRoom> getScreeningRooms();

    ScreeningRoom getScreeningRoom(long id);
    ScreeningRoom addScreeningRoom(ScreeningRoom screeningRoom);
    void removeScreeningRoom(ScreeningRoom screeningRoom);
    ScreeningRoom updateScreeningRoom(ScreeningRoom screeningRoom);
}
