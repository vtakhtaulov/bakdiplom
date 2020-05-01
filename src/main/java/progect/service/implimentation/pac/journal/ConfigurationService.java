package progect.service.implimentation.pac.journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.journal.ConfigurationDTO;
import progect.domain.journal.ConfigurationDomain;
import progect.repository.journal.ConfigurationRepository;
import progect.service.interfase.pac.journal.IConfigurationService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConfigurationService implements IConfigurationService {
   @Autowired
   private ConfigurationRepository configurationRepository;

    @Override
    public List<ConfigurationDTO> findAll() {
        return mapperEntityToDTO();
    }

    @Override
    public ConfigurationDTO read(ConfigurationDTO obj) {
        return null;
    }

    @Override
    public boolean delete(ConfigurationDTO obj) {
        return false;
    }

    @Override
    public List<ConfigurationDTO> update(ConfigurationDTO obj, ConfigurationDTO new_obj) {
        return mapperEntityToDTO();
    }

    @Override
    public List<ConfigurationDTO> create(ConfigurationDTO obj) {
        return mapperEntityToDTO();
    }

    private List<ConfigurationDTO> mapperEntityToDTO()
    {
        List<ConfigurationDTO> listDTO = new ArrayList<>();
        List<ConfigurationDomain> listDom = configurationRepository.findAll();
        for(int i = 0; i<listDom.size(); i++) {
            ConfigurationDomain obj_dom = listDom.get(i);
            listDTO.add(new ConfigurationDTO(obj_dom));
        }
        return listDTO;
    }
}
