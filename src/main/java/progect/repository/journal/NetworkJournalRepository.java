package progect.repository.journal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import progect.domain.journal.NetworkJournalDomain;

public interface NetworkJournalRepository extends JpaRepository<NetworkJournalDomain, Integer> {
    @Query(
            value = "select *  from network.network_journal n where n.id_network = ?1",
            nativeQuery = true
    )
    NetworkJournalDomain CascadeDelNet(Integer id_network);
}
