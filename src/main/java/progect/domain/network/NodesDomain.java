package progect.domain.network;

import lombok.Data;
import progect.domain.devices.DevicesDomain;
import progect.domain.room.RoomDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "Nodes")
public class NodesDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_nodes;

    @ManyToOne
    @JoinColumn(name = "usert_otv",referencedColumnName = "user_id")
    private UsersDomain usert_otv;

    @NotNull
    private String name_nodes;

    @OneToMany( mappedBy = "id_nodes")
    private List<RoomDomain> id_nodes_RoomDomain;

    public NodesDomain() {
    }

    public Integer getId_nodes() {
        return id_nodes;
    }

    public void setId_nodes(Integer id_nodes) {
        this.id_nodes = id_nodes;
    }

    public UsersDomain getUsert_otv() {
        return usert_otv;
    }

    public void setUsert_otv(UsersDomain usert_otv) {
        this.usert_otv = usert_otv;
    }

    public String getName_nodes() {
        return name_nodes;
    }

    public void setName_nodes(String name_nodes) {
        this.name_nodes = name_nodes;
    }

    public List<RoomDomain> getId_nodes_RoomDomain() {
        return id_nodes_RoomDomain;
    }

    public void setId_nodes_RoomDomain(List<RoomDomain> id_nodes_RoomDomain) {
        this.id_nodes_RoomDomain = id_nodes_RoomDomain;
    }
    public String getFIOotv() {
        try {
            return this.usert_otv.getFirst_name() + " "
                    + this.usert_otv.getLast_name() + " "
                    + this.usert_otv.getMiddle_name();
        }catch (Exception e){
            return "";
        }
    }
}
