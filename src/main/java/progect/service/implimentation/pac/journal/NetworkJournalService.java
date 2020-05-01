package progect.service.implimentation.pac.journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.journal.NetworkJournalDTO;
import progect.domain.journal.NetworkJournalDomain;
import progect.repository.journal.NetworkJournalRepository;
import progect.service.interfase.pac.journal.INetworkJournalService;

import java.util.ArrayList;
import java.util.List;

@Service
public class NetworkJournalService implements INetworkJournalService {
    @Autowired
    private NetworkJournalRepository networkJournalRepository;

    @Override
    public List<NetworkJournalDTO> findAll() {
        return mapperEntityToDTO();
    }

    @Override
    public NetworkJournalDTO read(NetworkJournalDTO obj) {
        return null;
    }

    @Override
    public boolean delete(NetworkJournalDTO obj) {
        return false;
    }

    @Override
    public List<NetworkJournalDTO> update(NetworkJournalDTO obj, NetworkJournalDTO new_obj) {
        return mapperEntityToDTO();
    }

    @Override
    public List<NetworkJournalDTO> create(NetworkJournalDTO obj) {
        return mapperEntityToDTO();
    }

    private List<NetworkJournalDTO> mapperEntityToDTO()
    {
        List<NetworkJournalDTO> listDTO = new ArrayList<>();
        List<NetworkJournalDomain> listDom = networkJournalRepository.findAll();
        for(int i = 0; i<listDom.size(); i++) {
            NetworkJournalDomain obj_dom = listDom.get(i);
            listDTO.add(new NetworkJournalDTO(obj_dom));
        }
        return listDTO;
    }
}
