package progect.domain.devices;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(schema = "network", name = "PropsPortDomain")
public class PropsPortDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_props_port;

    @Column(name = "id_devices")
    @NotNull
    @OneToOne
    @JoinColumn(name = "id_devices")
    private DevicesDomain id_devices;

    @Column(name = "EthernetPort")
    private String EthernetPort;
    @Column(name = "OVPort")
    private String OVPort;
}
