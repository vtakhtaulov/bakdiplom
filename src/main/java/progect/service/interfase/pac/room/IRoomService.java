package progect.service.interfase.pac.room;

import progect.DTO.room.RoomDTO;

import java.util.List;

public interface IRoomService {
    List<RoomDTO> findAll();
    RoomDTO read(RoomDTO obj);
    List<RoomDTO> delete(Integer id_room);
    List<RoomDTO> update(Integer id_room, RoomDTO new_obj);
    List<RoomDTO> create(RoomDTO obj);
}
