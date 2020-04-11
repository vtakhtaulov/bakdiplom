package progect.repository.network;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.network.Pool_address_Domain;

public interface Pool_address_Repository extends JpaRepository<Pool_address_Domain,Integer> {
}
