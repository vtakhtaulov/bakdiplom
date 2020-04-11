package progect.repository.devices;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.devices.DevicesDomain;

public interface DevicesRepository extends JpaRepository<DevicesDomain, Integer> {
}
