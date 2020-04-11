package progect.domain.journal;

import lombok.Data;
import progect.domain.user.UsersDomain;
import progect.domain.devices.DevicesDomain;
import progect.domain.network.NetworkDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "NetworkJournalDomain")
public class NetworkJournalDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_network_journal;


    @ManyToOne(optional=false)
    @JoinColumn(name = "id_network")
    private NetworkDomain id_network;

    @Column(name = "DNS_zone")
    @NotNull
    private String DNS_zone;

    @Column(name = "date_reg")
    @NotNull
    private Date date_reg;

    @Column(name = "date_old")
    @NotNull
    private Date date_old;

    @Column(name = "ip_address")
    @NotNull
    private String ip_address;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UsersDomain id_user_reg;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UsersDomain id_user_old;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_devices")
    private DevicesDomain id_devices;

    @Column(name = "actual")
    @NotNull
    private Integer actual;



}
