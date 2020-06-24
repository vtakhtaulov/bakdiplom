package progect.repository.journal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import progect.domain.journal.CrossDevicesDomain;

import java.util.List;

public interface CrossDevicesRepository extends JpaRepository<CrossDevicesDomain,Integer> {
    @Query(
            value = "select * from network.cross_devices cd where cd.id_device = ?1",
            nativeQuery = true
    )
    List<CrossDevicesDomain> findBy_deviceFirst(Integer id);

    @Query(
            value = "select * from network.cross_devices cd where cd.id_devices_end = ?1",
            nativeQuery = true
    )
    CrossDevicesDomain findBy_deviceEnd(Integer id);
}
