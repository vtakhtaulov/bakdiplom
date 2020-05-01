package progect.service.interfase.pac.journal;

import progect.DTO.journal.CrossDevicesDTO;
import progect.DTO.journal.NetworkJournalDTO;

import java.util.List;

public interface  INetworkJournalService {
    List<NetworkJournalDTO> findAll();
    NetworkJournalDTO read(NetworkJournalDTO obj);
    boolean delete(NetworkJournalDTO obj);
    List<NetworkJournalDTO> update(NetworkJournalDTO obj, NetworkJournalDTO new_obj);
    List<NetworkJournalDTO> create(NetworkJournalDTO obj);

}
