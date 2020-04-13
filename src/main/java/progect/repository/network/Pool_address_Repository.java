package progect.repository.network;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import progect.domain.network.Pool_address_Domain;

import java.util.List;

@Repository
public interface Pool_address_Repository extends JpaRepository<Pool_address_Domain,Integer> {

}
