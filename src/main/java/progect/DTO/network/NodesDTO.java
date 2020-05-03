package progect.DTO.network;

import progect.domain.network.NodesDomain;

public class NodesDTO {

    private Integer id_nodes;

    private String usert_otv;

    private Integer id_user_otv;

    private String name_nodes;

    public NodesDTO(NodesDomain nodes) {
        this.id_nodes = nodes.getId_nodes();
        this.usert_otv = nodes.getUsert_otv().getFioUser();
        this.name_nodes = nodes.getName_nodes();
        this.id_user_otv = nodes.getUsert_otv().getUser_id();
    }

    public Integer getId_nodes() {
        return id_nodes;
    }

    public void setId_nodes(Integer id_nodes) {
        this.id_nodes = id_nodes;
    }

    public String getUsert_otv() {
        return usert_otv;
    }

    public void setUsert_otv(String usert_otv) {
        this.usert_otv = usert_otv;
    }

    public Integer getId_user_otv() {
        return id_user_otv;
    }

    public void setId_user_otv(Integer id_user_otv) {
        this.id_user_otv = id_user_otv;
    }

    public String getName_nodes() {
        return name_nodes;
    }

    public void setName_nodes(String name_nodes) {
        this.name_nodes = name_nodes;
    }

    @Override
    public String toString() {
        return "NodesDTO{" +
                "id_nodes=" + id_nodes +
                ", usert_otv='" + usert_otv + '\'' +
                ", id_user_otv=" + id_user_otv +
                ", name_nodes='" + name_nodes + '\'' +
                '}';
    }
}
