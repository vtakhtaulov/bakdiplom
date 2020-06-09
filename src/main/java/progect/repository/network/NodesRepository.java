package progect.repository.network;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import progect.domain.network.NodesDomain;

import java.util.List;

public interface NodesRepository extends JpaRepository<NodesDomain, Integer> {

    @Query(value = "delete from network.nodes where id_nodes = ?1",
    nativeQuery = true)
    void deleteNodes(Integer id);
}
