package progect.repository.journal;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.journal.CrossDevicesDomain;

public interface CrossDevicesRepository extends JpaRepository<CrossDevicesDomain,Integer> {
}
