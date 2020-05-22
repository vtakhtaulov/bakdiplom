package progect.domain.network;

import lombok.Data;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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


    public NodesDomain() {
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

    public Integer getId_nodes() {
        return id_nodes;
    }
}
