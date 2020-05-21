package progect.repository.devices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import progect.domain.devices.TypeDeviceDomain;

public interface TypeDeviceRepository extends JpaRepository<TypeDeviceDomain, Integer> {
}
