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

    private Integer id_devices;

    public PropsPortDomain() {
    }

    public Integer getId_props_port() {
        return id_props_port;
    }

    public void setId_props_port(Integer id_props_port) {
        this.id_props_port = id_props_port;
    }

    public String getEthernetPort() {
        return EthernetPort;
    }

    public void setEthernetPort(String ethernetPort) {
        EthernetPort = ethernetPort;
    }

    public String getOVPort() {
        return OVPort;
    }

    public void setOVPort(String OVPort) {
        this.OVPort = OVPort;
    }

    public Integer getId_devices() {
        return id_devices;
    }

    public void setId_devices(Integer id_devices) {
        this.id_devices = id_devices;
    }
}
