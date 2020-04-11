package progect.domain.devices;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "type_device")
public class TypeDeviceDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_type_dev;


    @NotNull
    private String name_type_dev;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_type_devices")
    private List<DevicesDomain> id_device;


    public TypeDeviceDomain(){}
}
