package progect.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(schema = "network", name = "ref_status")
public class RefStatusDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_status;

    @NotNull
    private String name_status;

    public RefStatusDomain() {
    }

    public Integer getId_status() {
        return id_status;
    }

    public void setId_status(Integer id_status) {
        this.id_status = id_status;
    }

    public String getName_status() {
        return name_status;
    }

    public void setName_status(String name_status) {
        this.name_status = name_status;
    }
}
