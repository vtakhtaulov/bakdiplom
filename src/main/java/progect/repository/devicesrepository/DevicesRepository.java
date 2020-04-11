package progect.repository.devicesrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.user.UsersDomain;

public interface DevicesRepository extends JpaRepository<DevicesRepository, Integer> {
}
