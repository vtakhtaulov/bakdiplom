package progect.service.interfase.pac.journal;

import progect.DTO.journal.ConfigurationDTO;
import progect.domain.network.CrossesDomain;

import java.util.List;

public interface IConfigurationService {
    List<ConfigurationDTO> findAll();
    ConfigurationDTO read(ConfigurationDTO obj);
    boolean delete(ConfigurationDTO obj);
    List<ConfigurationDTO> update(ConfigurationDTO obj, ConfigurationDTO new_obj);
    List<ConfigurationDTO> create(ConfigurationDTO obj);
}
