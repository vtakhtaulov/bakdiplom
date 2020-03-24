package progect.domain.network;

import lombok.Data;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(schema = "network", name = "NodesDomain")
public class NodesDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_nodes;

    @Column(name = "usert_otv")
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersDomain usert_otv;

    @Column(name = "name_nodes")
    @NotNull
    private String name_nodes;
}
