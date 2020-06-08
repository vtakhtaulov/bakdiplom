package progect.service.implimentation.pac.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.events.EventException;
import progect.DTO.MapperStringToEntity;
import progect.DTO.network.NetworkDTO;
import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.Dhcp_poolDomain;
import progect.domain.network.NetworkDomain;
import progect.domain.network.Pool_address_Domain;
import progect.repository.RefStatusRepository;
import progect.repository.network.DHСP_poolRepository;
import progect.repository.network.NetworkRepository;
import progect.repository.network.Pool_address_Repository;
import progect.repository.network.VlanRepository;
import progect.repository.user.UserRepository;
import progect.service.interfase.pac.network.INetworkService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class NetworkService implements INetworkService {
    @Autowired
    private NetworkRepository networkRepository;
    @Autowired
    private DHСP_poolRepository dhсp_poolRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Pool_address_Repository pool_address_repository;
    @Autowired
    private VlanRepository vlanRepository;
    @Autowired
    private RefStatusRepository refStatusRepository;

    @Override
    public List<NetworkDTO> findAll() {
        return mapperEntityToDTO();
    }

    @Override
    public NetworkDTO read(NetworkDTO obj) {
        return null;
    }

    @Override
    public List<NetworkDTO> delete(Integer id_network, NetworkDTO obj) {
        if(networkRepository.findById(id_network).get().getIs_status().getId_status() == 2)
        {
            return mapperEntityToDTO();
        }
        else {
            try {
                networkRepository.findById(id_network).map(networkDomain -> {
                    networkDomain.setDate_old(new Date());
                    networkDomain.setId_user_old(userRepository.findById(obj.getId_user_old()).get());
                    networkDomain.setIs_status(refStatusRepository.findById(2).get());
                    return networkRepository.save(networkDomain);
                });
                return mapperEntityToDTO();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return mapperEntityToDTO();
            }
        }
    }

    @Override
    public List<NetworkDTO> update(Integer id_network, NetworkDTO obj) {
        if(networkRepository.findById(id_network).get().getIs_status().getId_status() == 2) {
            return mapperEntityToDTO();
        }
        else {
            try {
                networkRepository.findById(id_network).map(networkDomain -> {
                    networkDomain.setDate_old(new Date());
                    networkDomain.setId_user_old(userRepository.findById(obj.getId_user_old()).get());
                    networkDomain.setIs_status(refStatusRepository.findById(2).get());
                    return networkRepository.save(networkDomain);
                });

                NetworkDomain network = new NetworkDomain();
                network.setNewNetworkDomain(
                        obj,
                        pool_address_repository.findById(obj.getId_pool_address()).get(),
                        userRepository.findById(obj.getId_user_reg()).get(),
                        userRepository.findById(obj.getId_user_old()).get(),
                        vlanRepository.findById(obj.getId_vlan()).get(),
                        dhсp_poolRepository.findById(obj.getId_dhcp_pool()).get(),
                        refStatusRepository.findById(1).get()
                );
                networkRepository.save(network);
                return mapperEntityToDTO();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return mapperEntityToDTO();
            }
        }
    }

    @Override
    public List<NetworkDTO> create(NetworkDTO obj) {
        try {
            NetworkDomain networkDomain = new NetworkDomain();
            networkDomain.setNewNetworkDomain(
                    obj,
                    pool_address_repository.findById(obj.getId_pool_address()).get(),
                    userRepository.findById(obj.getId_user_reg()).get(),
                    userRepository.findById(obj.getId_user_old()).get(),
                    vlanRepository.findById(obj.getId_vlan()).get(),
                    dhсp_poolRepository.findById(obj.getId_dhcp_pool()).get(),
                    refStatusRepository.findById(1).get()
            );
            networkRepository.save(networkDomain);
            return mapperEntityToDTO();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return mapperEntityToDTO();
        }
    }

    @Override
    public Integer createNetworkDhcp(MapperStringToEntity obj) {


        return null;
    }


    private List<NetworkDTO> mapperEntityToDTO()
    {
        List<NetworkDTO> listNetDTO = new ArrayList<>();
        List<NetworkDomain> listNetDom = networkRepository.findAll();
        for(int i = 0; i<listNetDom.size(); i++) {
            NetworkDomain net_dom = listNetDom.get(i);
            listNetDTO.add(new NetworkDTO(net_dom));
        }
        return listNetDTO;
    }
}
