package progect.service.interfase.pac.journal;

import progect.DTO.filter.NetworkJournalIpAddressFilter;
import progect.DTO.journal.CrossDevicesDTO;
import progect.DTO.journal.NetworkJournalDTO;
import progect.domain.journal.NetworkJournalDomain;

import java.util.List;

public interface  INetworkJournalService {
    List<NetworkJournalDTO> findAll();
    NetworkJournalDTO read(NetworkJournalDTO obj);
    List<NetworkJournalDTO> delete(Integer id_network_journal, NetworkJournalDTO new_obj);
    List<NetworkJournalDTO> update(Integer id_network_journal, NetworkJournalDTO new_obj);
    List<NetworkJournalDTO> create(NetworkJournalDTO obj);
    List<NetworkJournalIpAddressFilter> findByIpAddress(Integer id_network);

}
