package progect.service.implimentation.pac.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.room.RoomDTO;
import progect.domain.RefStatusDomain;
import progect.domain.devices.DevicesDomain;
import progect.domain.network.NodesDomain;
import progect.domain.room.RoomDomain;
import progect.domain.user.UsersDomain;
import progect.repository.RefStatusRepository;
import progect.repository.devices.DevicesRepository;
import progect.repository.network.NodesRepository;
import progect.repository.room.RoomRepository;
import progect.repository.user.UserRepository;
import progect.service.interfase.pac.device.IDeviceService;
import progect.service.interfase.pac.room.IRoomService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class RoomService implements IRoomService {

    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private NodesRepository nodesRepository;
    @Autowired
    private DevicesRepository devicesRepository;
    @Autowired
    private RefStatusRepository refStatusRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<RoomDTO> findAll() {
        return mapperEntityToDTO();
    }

    @Override
    public RoomDTO read(RoomDTO obj) {
        return null;
    }

    @Override
    public List<RoomDTO> delete(Integer id_room) {
            try {
                 devicesRepository.findById_room(id_room).map(
                         element->{
                             element.setId_room(roomRepository.findById(0).get());
                             return devicesRepository.save(element);
                         }
                 );
                 roomRepository.delete(id_room);


                return mapperEntityToDTO();
            }catch (Exception e){
                System.out.println(e.getMessage());
                return mapperEntityToDTO();
            }
    }

    @Override
    public List<RoomDTO> update(Integer id_room, RoomDTO new_obj) {

        Optional<UsersDomain> usersDomain = userRepository.findById(new_obj.getId_user_otv());
        Optional<NodesDomain> nodesDomain = nodesRepository.findById(new_obj.getId_nodes());

        roomRepository.findById(id_room).map(element->{
            element.setId_nodes(nodesDomain.get());
            element.setName_room(new_obj.getName_room());
            element.setType_room(new_obj.getType_room());
            element.setUser_otv(usersDomain.get());
            return roomRepository.save(element);
        });

        return mapperEntityToDTO();
    }

    @Override
    public List<RoomDTO> create(RoomDTO obj) {
        Optional<UsersDomain> usersDomain = userRepository.findById(obj.getId_user_otv());
        Optional<NodesDomain> nodesDomain = nodesRepository.findById(obj.getId_nodes());

        roomRepository.save(new RoomDomain(obj.getName_room(), usersDomain.get(), obj.getType_room(), nodesDomain.get()));
        return mapperEntityToDTO();
    }

    private List<RoomDTO> mapperEntityToDTO()
    {
        List<RoomDTO> listDTO = new ArrayList<>();
        List<RoomDomain> listDom = roomRepository.findAll();
        for(int i = 0; i < listDom.size(); i++) {
            RoomDomain obj_dom = listDom.get(i);
            listDTO.add(new RoomDTO(obj_dom));
        }
        return listDTO;
    }
}
