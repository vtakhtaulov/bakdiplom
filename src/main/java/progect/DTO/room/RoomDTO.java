package progect.DTO.room;

import lombok.Data;
import progect.domain.devices.DevicesDomain;
import progect.domain.network.NodesDomain;
import progect.domain.room.RoomDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

public class RoomDTO {

    private Integer id_room;

    private String name_room;

    private Integer id_user_otv;

    private String user_otv;

    private String type_room;

    private Integer id_nodes;
    private String nodes_name;

    public RoomDTO(RoomDomain obj) {
        this.id_room = obj.getId_room();
        this.name_room = obj.getName_room();
        this.id_user_otv = obj.getUser_otv().getUser_id();
        this.user_otv = obj.getUser_otv().getFioUser();
        this.type_room = obj.getType_room();
        this.id_nodes = obj.getId_nodes().getId_nodes();
        this.nodes_name = obj.getId_nodes().getName_nodes();
    }

    @Override
    public String toString() {
        return "RoomDTO{" +
                "id_room=" + id_room +
                ", name_room='" + name_room + '\'' +
                ", id_user_otv=" + id_user_otv +
                ", user_otv='" + user_otv + '\'' +
                ", type_room='" + type_room + '\'' +
                ", id_nodes=" + id_nodes +
                ", nodes_name='" + nodes_name + '\'' +
                '}';
    }
}
