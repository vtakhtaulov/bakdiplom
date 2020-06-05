package progect.repository.devices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import progect.DTO.devices.InfoCrossDeviceEndDTO;
import progect.domain.devices.DevicesDomain;

import java.util.List;
import java.util.Optional;

public interface InfoCrossDeviceRepository extends JpaRepository<InfoCrossDeviceEndDTO, Integer> {

    @Query(value = "select * from network.infocrossedevice" ,  nativeQuery = true)
    List<InfoCrossDeviceEndDTO> allInfo();

    @Query(value = "select * from network.infocrossedevice inf where inf.id_devices = ?1" ,  nativeQuery = true)
    Optional<InfoCrossDeviceEndDTO> findById(Integer id);

}

