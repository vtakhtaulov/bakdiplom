package progect.repository.journal;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.journal.ConfigurationDomain;

public interface ConfigurationRepository extends JpaRepository<ConfigurationDomain,Integer> {
}
