package progect.domain.devices;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "TypeDeviceDomain")
public class TypeDeviceDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_type_dev;

    @Column(name = "name_type_dev")
    @NotNull
    private String name_type_dev;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_type_devices")
    private List<DevicesDomain> id_device;


    public TypeDeviceDomain(){}
}
