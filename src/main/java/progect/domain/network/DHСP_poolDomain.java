package progect.domain.network;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(schema = "network", name = "DHСP_pool")
public class DHСP_poolDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_DHСP_pool;

    @NotNull
    private String address_start;

    @Column(name = "address_end")
    @NotNull
    private String address_end;

    @OneToOne(optional=false)
    @JoinColumn(name = "id_DHСP_pool")
    private NetworkDomain id_network;

    public DHСP_poolDomain(){}
}
