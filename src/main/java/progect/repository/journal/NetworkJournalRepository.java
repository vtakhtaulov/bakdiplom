package progect.repository.journal;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.journal.NetworkJournalDomain;

public interface NetworkJournalRepository extends JpaRepository<NetworkJournalDomain, Integer> {
}
