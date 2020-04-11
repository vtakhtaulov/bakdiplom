package progect.repository.network;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.network.CrossesDomain;

public interface CrossesRepository extends JpaRepository<CrossesDomain,Integer> {
}
