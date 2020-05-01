package progect.controllers.room;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.DTO.journal.NetworkJournalDTO;
import progect.service.interfase.pac.journal.INetworkJournalService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/Room/")
public class RoomController  {
    @Autowired
    private INetworkJournalService networkJournalService;

    @RequestMapping(value = "/RoomlAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NetworkJournalDTO> findAll() {
        return networkJournalService.findAll();
    }

    @RequestMapping(value = "/SearchRoom/{id_network_journal}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public NetworkJournalDTO read(@PathVariable("id_network_journal") NetworkJournalDTO obj) {
        return networkJournalService.read(obj);
    }

    @RequestMapping(value = "/DeleteRoom/{id_network_journal}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean delete(@PathVariable("id_network_journal") NetworkJournalDTO obj) {
        return networkJournalService.delete(obj);
    }

    @RequestMapping(value = "/UpdateRoom/{id_network_journal}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NetworkJournalDTO> update(@PathVariable("id_network_journal") NetworkJournalDTO obj, @RequestBody NetworkJournalDTO new_obj) {
        return networkJournalService.update(obj, new_obj);
    }
    @RequestMapping(value = "/CreateRoom", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NetworkJournalDTO> create(@RequestBody NetworkJournalDTO obj){
        return networkJournalService.create(obj);
    }

}