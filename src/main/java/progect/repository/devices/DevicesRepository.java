package progect.repository.devices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import progect.DTO.devices.DevicesDTO;
import progect.DTO.user.UserDTO;
import progect.domain.devices.DevicesDomain;

import java.util.List;

public interface DevicesRepository extends JpaRepository<DevicesDomain, Integer> {

    @Query(value = "UPDATE network.devices SET is_status = 2 WHERE id_devices=?1\n; " +
            "Update  network.configuration SET is_status = 2 WHERE id_device = ?1\n;" +
            "Update  network.cross_devices SET is_status = 2 WHERE (id_devices_end = ?1 or id_devices_first = ?1)\n;", nativeQuery = true)
    boolean delete(Integer obj);

    @Query(value = "UPDATE network.devices set id_room = 0 where cast(id_room as integer)= cast(?1 as integer)", nativeQuery = true)
    List<DevicesDomain> deleteRoom(Integer id);
}

