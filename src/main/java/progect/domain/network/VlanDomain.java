package progect.domain.network;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(schema = "network", name = "Vlan")
public class VlanDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_vlan;

    @NotNull
    private String vlan_name;

    @NotNull
    private String vlan_number;

    @OneToOne(optional=false)
    @JoinColumn(name = "id_vlan")
    private NetworkDomain id_network;

    public VlanDomain(){}

    public Integer getId_vlan() {
        return id_vlan;
    }

    public void setId_vlan(Integer id_vlan) {
        this.id_vlan = id_vlan;
    }

    public String getVlan_name() {
        return vlan_name;
    }

    public void setVlan_name(String vlan_name) {
        this.vlan_name = vlan_name;
    }

    public String getVlan_number() {
        return vlan_number;
    }

    public void setVlan_number(String vlan_number) {
        this.vlan_number = vlan_number;
    }

    public NetworkDomain getId_network() {
        return id_network;
    }

    public void setId_network(NetworkDomain id_network) {
        this.id_network = id_network;
    }
}
