package progect.domain.devices;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(schema = "network", name = "PropsPort")
public class PropsPortDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_props_port;

    private String EthernetPort;

    private String OVPort;


    @OneToOne(mappedBy = "id_props_port", cascade = CascadeType.ALL)
    private DevicesDomain id_devices;
    public PropsPortDomain() {
    }
}
