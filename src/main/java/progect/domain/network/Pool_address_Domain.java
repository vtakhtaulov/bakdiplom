package progect.domain.network;

import lombok.Data;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "Pool_address_Domain")
public class Pool_address_Domain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pool_address;

    @Column(name = "name_pool")
    @NotNull
    private String name_pool;

    @Column(name = "ip_addres_start")
    @NotNull
    private String ip_addres_start;

    @Column(name = "ip_addres_end")
    @NotNull
    private String ip_addres_end;

    @Column(name = "date_reg")
    @NotNull
    private Date date_reg;

    @Column(name = "date_old")
    private Date date_old;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UsersDomain id_user_old;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UsersDomain id_user_reg;

    @Column(name = "actual")
    @NotNull
    private String actual;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_pool_address")
    @JoinColumn(name = "id_pool_address")
    private List<NetworkDomain> id_network;


    public Pool_address_Domain(){

    }
}
