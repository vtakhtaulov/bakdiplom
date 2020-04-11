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
}
