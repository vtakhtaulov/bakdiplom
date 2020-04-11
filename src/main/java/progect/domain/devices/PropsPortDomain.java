package progect.domain.devices;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(schema = "network", name = "PropsPortDomain")
public class PropsPortDomain {

    @Id
    @GeneratedValue
    private Integer id_props_port;
    @Column(name = "EthernetPort")
    private String EthernetPort;
    @Column(name = "OVPort")
    private String OVPort;


    @OneToOne(mappedBy = "id_props_port", cascade = CascadeType.ALL)
    private DevicesDomain id_devices;
    public PropsPortDomain() {
    }
}
