package progect.domain.network;

import lombok.Data;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Table(schema = "network", name = "Network")
public class NetworkDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_network;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pool_address")
    private Pool_address_Domain id_pool_address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user_reg")
    private UsersDomain id_user_reg;

    private Integer id_user_old;

    @OneToOne(optional=false)
    @JoinColumn(name = "id_vlan")
    private VlanDomain id_vlan;


    @OneToOne(optional=false)
    @JoinColumn(name = "id_DHСP_pool")
    private DHСP_poolDomain id_DHСP_pool;

    @Column(name = "ip_address_network")
    @NotNull
    private String ip_address_network;

    @Column(name = "NetworkMask")
    @NotNull
    private String NetworkMask;

    private Integer number_mstp;

    @NotNull
    private Integer DefaultGeteway;

    @NotNull
    private Date date_reg;

    @NotNull
    private Date date_old;

    @NotNull
    private Integer actual;

    public NetworkDomain(){}
}
