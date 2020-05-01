package progect.service.implimentation.pac.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.journal.NetworkJournalDTO;
import progect.DTO.room.RoomDTO;
import progect.domain.journal.NetworkJournalDomain;
import progect.domain.room.RoomDomain;
import progect.repository.room.RoomRepository;
import progect.service.interfase.pac.room.IRoomService;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService implements IRoomService {

    @Autowired
    private RoomRepository roomRepository;
    @Override
    public List<RoomDTO> findAll() {
        return mapperEntityToDTO();
    }

    @Override
    public RoomDTO read(RoomDTO obj) {
        return null;
    }

    @Override
    public boolean delete(RoomDTO obj) {
        return false;
    }

    @Override
    public List<RoomDTO> update(RoomDTO obj, RoomDTO new_obj) {
        return mapperEntityToDTO();
    }

    @Override
    public List<RoomDTO> create(RoomDTO obj) {
        return mapperEntityToDTO();
    }

    private List<RoomDTO> mapperEntityToDTO()
    {
        List<RoomDTO> listDTO = new ArrayList<>();
        List<RoomDomain> listDom = roomRepository.findAll();
        for(int i = 0; i<listDom.size(); i++) {
            RoomDomain obj_dom = listDom.get(i);
            listDTO.add(new RoomDTO(obj_dom));
        }
        return listDTO;
    }
}
