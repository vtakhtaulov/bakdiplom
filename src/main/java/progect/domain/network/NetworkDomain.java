package progect.domain.network;

import lombok.Data;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Table(schema = "network", name = "NetworkDomain")
public class NetworkDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_network;

    @Column(name = "id_pool_address")
    @ManyToOne
    @JoinColumn(name = "id_pool_address")
    private Pool_address_Domain id_pool_address;

    @Column(name = "id_user_reg")
    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersDomain id_user_reg;

    @Column(name = "Id_user_old")
    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersDomain Id_user_old;

    @Column(name = "id_vlan")
    @NotNull
    @OneToOne
    @JoinColumn(name = "id_vlan")
    private VlanDomain id_vlan;

    @Column(name = "id_DHСP_pool")
    @NotNull
    @OneToOne
    @JoinColumn(name = "id_DHСP_pool")
    private DHСP_poolDomain id_DHСP_pool;

    @Column(name = "ip_address_network")
    @NotNull
    private String ip_address_network;

    @Column(name = "NetworkMask")
    @NotNull
    private String NetworkMask;

    @Column(name = "number_mstp")
    private Integer number_mstp;

    @Column(name = "DefaultGeteway")
    @NotNull
    private Integer DefaultGeteway;

    @Column(name = "date_reg")
    @NotNull
    private Date date_reg;

    @Column(name = "date_old")
    @NotNull
    private Date date_old;

    @Column(name = "actual")
    @NotNull
    private Integer actual;

    public NetworkDomain(){}
}
