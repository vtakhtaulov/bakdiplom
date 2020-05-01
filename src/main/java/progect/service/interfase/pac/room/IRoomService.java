package progect.service.interfase.pac.room;

import progect.DTO.room.RoomDTO;

import java.util.List;

public interface IRoomService {
    List<RoomDTO> findAll();
    RoomDTO read(RoomDTO obj);
    boolean delete(RoomDTO obj);
    List<RoomDTO> update(RoomDTO obj, RoomDTO new_obj);
    List<RoomDTO> create(RoomDTO obj);
}
