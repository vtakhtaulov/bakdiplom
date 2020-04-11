package progect.repository.network;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.network.NetworkDomain;

public interface NetworkRepository extends JpaRepository<NetworkDomain, Integer> {
}
