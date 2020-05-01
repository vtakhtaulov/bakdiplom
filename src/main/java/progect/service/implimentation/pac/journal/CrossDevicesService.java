package progect.service.implimentation.pac.journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.journal.CrossDevicesDTO;
import progect.domain.journal.CrossDevicesDomain;
import progect.repository.journal.CrossDevicesRepository;
import progect.service.interfase.pac.journal.ICrossDevicesService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CrossDevicesService implements ICrossDevicesService {
    @Autowired
    private CrossDevicesRepository crossDevicesRepository;

    @Override
    public List<CrossDevicesDTO> findAll() {
        return mapperEntityToDTO();
    }

    @Override
    public CrossDevicesDTO read(CrossDevicesDTO obj) {
        return null;
    }

    @Override
    public boolean delete(CrossDevicesDTO obj) {
        return false;
    }

    @Override
    public List<CrossDevicesDTO> update(CrossDevicesDTO obj, CrossDevicesDTO new_obj) {
        return mapperEntityToDTO();
    }

    @Override
    public List<CrossDevicesDTO> create(CrossDevicesDTO obj) {
        return mapperEntityToDTO();
    }

    private List<CrossDevicesDTO> mapperEntityToDTO()
    {
        List<CrossDevicesDTO> listDTO = new ArrayList<>();
        List<CrossDevicesDomain> listDom = crossDevicesRepository.findAll();
        for(int i = 0; i<listDom.size(); i++) {
            CrossDevicesDomain obj_dom = listDom.get(i);
            listDTO.add(new CrossDevicesDTO(obj_dom));
        }
        return listDTO;
    }
}
