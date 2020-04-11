package progect.repository.devices;

import org.springframework.data.jpa.repository.JpaRepository;
import progect.domain.devices.PropsPortDomain;

public interface PropsPortRepository extends JpaRepository<PropsPortDomain,Integer> {
}
