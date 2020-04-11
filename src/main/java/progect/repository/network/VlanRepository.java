package progect.repository.network;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.network.VlanDomain;

public interface VlanRepository extends JpaRepository<VlanDomain,Integer> {
}
