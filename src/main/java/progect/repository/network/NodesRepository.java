package progect.repository.network;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.network.NodesDomain;

public interface NodesRepository extends JpaRepository<NodesDomain, Integer> {
}
