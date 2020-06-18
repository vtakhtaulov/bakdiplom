package progect.service.implimentation.pac.journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.journal.NetworkJournalDTO;
import progect.domain.journal.NetworkJournalDomain;
import progect.domain.network.NetworkDomain;
import progect.repository.RefStatusRepository;
import progect.repository.devices.DevicesRepository;
import progect.repository.journal.NetworkJournalRepository;
import progect.repository.network.NetworkRepository;
import progect.repository.user.UserRepository;
import progect.service.interfase.pac.journal.INetworkJournalService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class NetworkJournalService implements INetworkJournalService {
    @Autowired
    private NetworkJournalRepository networkJournalRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RefStatusRepository refStatusRepository;
    @Autowired
    private NetworkRepository networkRepository;
    @Autowired
    private DevicesRepository devicesRepository;

    @Override
    public List<NetworkJournalDTO> findAll() {
        return mapperEntityToDTO();
    }

    @Override
    public NetworkJournalDTO read(NetworkJournalDTO obj) {
        return null;
    }

    @Override
    public List<NetworkJournalDTO> delete(Integer id_network_journal, NetworkJournalDTO new_obj) {
        try {
            networkJournalRepository.findById(id_network_journal).map(networkJournalDomain -> {
                networkJournalDomain.setDate_old(new Date());
                networkJournalDomain.setId_user_old(userRepository.findById(new_obj.getId_user_reg()).get());
                networkJournalDomain.setIs_status(refStatusRepository.findById(2).get());
                return networkJournalRepository.save(networkJournalDomain);
            });
            return mapperEntityToDTO();
        }catch (Exception e){
            return mapperEntityToDTO();
        }
    }

    @Override
    public List<NetworkJournalDTO> update(Integer id_network_journal , NetworkJournalDTO obj) {
        try{
            networkJournalRepository.findById(id_network_journal).map(networkJournalDomain -> {
                networkJournalDomain.setDate_old(new Date());
                networkJournalDomain.setId_user_old(userRepository.findById(obj.getId_user_reg()).get());
                networkJournalDomain.setIs_status(refStatusRepository.findById(2).get());
                return networkJournalRepository.save(networkJournalDomain);
            });
            NetworkJournalDomain networkJournalDomain = new NetworkJournalDomain();
            networkJournalDomain.setNetworkJournalDomain(
                    networkRepository.findById(obj.getId_network()).get(),
                    obj,
                    userRepository.findById(obj.getId_user_reg()).get(),
                    userRepository.findById(0).get(),
                    devicesRepository.findById(obj.getId_devices()).get(),
                    refStatusRepository.findById(1).get());

            networkJournalRepository.save(networkJournalDomain);
            return mapperEntityToDTO();
        }catch (Exception e) {
            return mapperEntityToDTO();
        }
    }

    @Override
    public List<NetworkJournalDTO> create(NetworkJournalDTO obj) {
        try{
            NetworkJournalDomain networkJournalDomain = new NetworkJournalDomain();
            networkJournalDomain.setNetworkJournalDomain(
                    networkRepository.findById(obj.getId_network()).get(),
                    obj,
                    userRepository.findById(obj.getId_user_reg()).get(),
                    userRepository.findById(0).get(),
                    devicesRepository.findById(obj.getId_devices()).get(),
                    refStatusRepository.findById(1).get());

            networkJournalRepository.save(networkJournalDomain);
            return mapperEntityToDTO();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return mapperEntityToDTO();
        }
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
