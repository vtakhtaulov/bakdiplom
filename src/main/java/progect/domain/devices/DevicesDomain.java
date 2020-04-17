package progect.domain.devices;


import lombok.Data;
import progect.domain.journal.NetworkJournalDomain;
import progect.domain.room.RoomDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "Devices")
public class DevicesDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_devices;

    @ManyToOne
    @JoinColumn(name = "id_type_devices")
    private TypeDeviceDomain id_type_devices;

    @ManyToOne
    @JoinColumn(name = "user_otv",referencedColumnName = "user_id")
    private UsersDomain user_otv;

    @NotNull
    private String hostname;

    @ManyToOne
    @JoinColumn(name = "id_room")
    private RoomDomain id_room;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_props_port")
    private PropsPortDomain id_props_port;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_network_journal")
    private List<NetworkJournalDomain> id_network_journal;


    public DevicesDomain(){}

    public Integer getId_devices() {
        return id_devices;
    }

    public void setId_devices(Integer id_devices) {
        this.id_devices = id_devices;
    }

    public TypeDeviceDomain getId_type_devices() {
        return id_type_devices;
    }

    public void setId_type_devices(TypeDeviceDomain id_type_devices) {
        this.id_type_devices = id_type_devices;
    }

    public UsersDomain getUser_otv() {
        return user_otv;
    }

    public void setUser_otv(UsersDomain user_otv) {
        this.user_otv = user_otv;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public RoomDomain getId_room() {
        return id_room;
    }

    public void setId_room(RoomDomain id_room) {
        this.id_room = id_room;
    }

    public PropsPortDomain getId_props_port() {
        return id_props_port;
    }

    public void setId_props_port(PropsPortDomain id_props_port) {
        this.id_props_port = id_props_port;
    }

    public List<NetworkJournalDomain> getId_network_journal() {
        return id_network_journal;
    }

    public void setId_network_journal(List<NetworkJournalDomain> id_network_journal) {
        this.id_network_journal = id_network_journal;
    }
}
