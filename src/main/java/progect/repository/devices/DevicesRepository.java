package progect.repository.devices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import progect.DTO.devices.DevicesDTO;
import progect.DTO.user.UserDTO;
import progect.domain.devices.DevicesDomain;

public interface DevicesRepository extends JpaRepository<DevicesDomain, Integer> {

    @Query(value = "UPDATE network.devices SET is_status = 2 WHERE id_devices=?1\n; " +
            "Update  network.configuration SET is_status = 2 WHERE id_devices = ?1\n;" +
            "Update  network.cross_devices SET is_status = 2 WHERE (id_devices_end = ?1 or id_devices_first = ?1)\n;", nativeQuery = true)
    boolean delete(Integer obj);
}
