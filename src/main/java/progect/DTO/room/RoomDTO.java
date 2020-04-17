package progect.DTO.room;

import lombok.Data;
import progect.domain.devices.DevicesDomain;
import progect.domain.network.NodesDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "Room")
public class RoomDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_room;

    @NotNull
    private String name_room;

    @ManyToOne
    @JoinColumn(name = "usert_otv",referencedColumnName = "user_id")
    private UsersDomain user_otv;

    @NotNull
    private String type_room;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nodes")
    private NodesDomain id_nodes;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_room")
    private List<DevicesDomain> id_devices;


    public RoomDTO(){}

    public Integer getId_room() {
        return id_room;
    }

    public void setId_room(Integer id_room) {
        this.id_room = id_room;
    }

    public String getName_room() {
        return name_room;
    }

    public void setName_room(String name_room) {
        this.name_room = name_room;
    }

    public UsersDomain getUser_otv() {
        return user_otv;
    }

    public void setUser_otv(UsersDomain user_otv) {
        this.user_otv = user_otv;
    }

    public String getType_room() {
        return type_room;
    }

    public void setType_room(String type_room) {
        this.type_room = type_room;
    }

    public NodesDomain getId_nodes() {
        return id_nodes;
    }

    public void setId_nodes(NodesDomain id_nodes) {
        this.id_nodes = id_nodes;
    }

    public List<DevicesDomain> getId_devices() {
        return id_devices;
    }

    public void setId_devices(List<DevicesDomain> id_devices) {
        this.id_devices = id_devices;
    }
}
