package progect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.RefStatusDomain;

public interface RefStatusRepository extends JpaRepository<RefStatusDomain, Integer> {
}
