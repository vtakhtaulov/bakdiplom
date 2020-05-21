package progect.controllers.room;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.DTO.journal.NetworkJournalDTO;
import progect.DTO.room.RoomDTO;
import progect.service.interfase.pac.journal.INetworkJournalService;
import progect.service.interfase.pac.room.IRoomService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/Room/")
public class RoomController  {
    @Autowired
    private IRoomService roomService;

    @RequestMapping(value = "/RoomlAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<RoomDTO> findAll() {
        return roomService.findAll();
    }

    @RequestMapping(value = "/SearchRoom/{id_room}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RoomDTO read(@PathVariable("id_room") RoomDTO obj) {
        return roomService.read(obj);
    }

    @RequestMapping(value = "/DeleteRoom/{id_room}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean delete(@PathVariable("id_room") RoomDTO obj) {
        return roomService.delete(obj);
    }

    @RequestMapping(value = "/UpdateRoom/{id_room}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<RoomDTO> update(@PathVariable("id_room") RoomDTO obj, @RequestBody RoomDTO new_obj) {
        return roomService.update(obj, new_obj);
    }
    @RequestMapping(value = "/CreateRoom", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<RoomDTO> create(@RequestBody RoomDTO obj){
        return roomService.create(obj);
    }

}