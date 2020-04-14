package progect.domain.devices;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(schema = "network", name = "type_device")
public class TypeDeviceDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_type_dev;

    @NotNull
    private String name_type_dev;


    public TypeDeviceDomain(){}

    public Integer getId_type_dev() {
        return id_type_dev;
    }

    public void setId_type_dev(Integer id_type_dev) {
        this.id_type_dev = id_type_dev;
    }

    public String getName_type_dev() {
        return name_type_dev;
    }

    public void setName_type_dev(String name_type_dev) {
        this.name_type_dev = name_type_dev;
    }
}
