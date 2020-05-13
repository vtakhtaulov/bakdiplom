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
@Table(schema = "network", name = "NetworkJournal")
public class NetworkJournalDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_network_journal;


    @ManyToOne(optional=false)
    @JoinColumn(name = "id_network")
    private NetworkDomain id_network;


    private String DNS_zone;

    @NotNull
    private Date date_reg;

    private Date date_old;

    @NotNull
    private String ip_address;


    @ManyToOne
    @JoinColumn(name = "id_user_reg",referencedColumnName = "user_id")
    private UsersDomain id_user_reg;

    @ManyToOne
    @JoinColumn(name = "id_user_old",referencedColumnName = "user_id")
    private UsersDomain id_user_old;


    @ManyToOne
    @JoinColumn(name = "id_devices", referencedColumnName = "id_devices")
    private DevicesDomain id_devices;

    @Column(name = "actual")
    @NotNull
    private Integer actual;


    public NetworkJournalDomain() {
    }

    public Integer getId_network_journal() {
        return id_network_journal;
    }

    public void setId_network_journal(Integer id_network_journal) {
        this.id_network_journal = id_network_journal;
    }

    public NetworkDomain getId_network() {
        return id_network;
    }

    public void setId_network(NetworkDomain id_network) {
        this.id_network = id_network;
    }

    public String getDNS_zone() {
        return DNS_zone;
    }

    public void setDNS_zone(String DNS_zone) {
        this.DNS_zone = DNS_zone;
    }

    public Date getDate_reg() {
        return date_reg;
    }

    public void setDate_reg(Date date_reg) {
        this.date_reg = date_reg;
    }

    public Date getDate_old() {
        return date_old;
    }

    public void setDate_old(Date date_old) {
        this.date_old = date_old;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public UsersDomain getId_user_reg() {
        return id_user_reg;
    }

    public void setId_user_reg(UsersDomain id_user_reg) {
        this.id_user_reg = id_user_reg;
    }

    public UsersDomain getId_user_old() {
        return id_user_old;
    }

    public void setId_user_old(UsersDomain id_user_old) {
        this.id_user_old = id_user_old;
    }

    public DevicesDomain getId_devices() {
        return id_devices;
    }

    public void setId_devices(DevicesDomain id_devices) {
        this.id_devices = id_devices;
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        this.actual = actual;
    }
}
