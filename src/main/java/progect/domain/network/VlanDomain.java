package progect.domain.network;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(schema = "network", name = "VlanDomain")
public class VlanDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_vlan;

    @Column(name = "vlan_name")
    @NotNull
    private String vlan_name;

    @Column(name = "vlan_number")
    @NotNull
    private String vlan_number;

    public VlanDomain(){}
}
