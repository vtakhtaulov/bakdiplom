package progect.service.interfase.pac.journal;

import progect.DTO.journal.ConfigurationDTO;
import progect.domain.network.CrossesDomain;

import java.util.List;

public interface IConfigurationService {
    List<ConfigurationDTO> findAll();
    ConfigurationDTO read(ConfigurationDTO obj);
    List<ConfigurationDTO> delete(Integer id_config, Integer user_id);
    List<ConfigurationDTO> update(Integer id_config, ConfigurationDTO new_obj);
    List<ConfigurationDTO> create(ConfigurationDTO obj);
}
