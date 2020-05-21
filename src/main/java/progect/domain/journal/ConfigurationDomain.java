package progect.domain.journal;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ValueGenerationType;
import progect.domain.RefStatusDomain;
import progect.domain.devices.DevicesDomain;
import progect.domain.devices.PropsPortDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Table(schema = "network", name = "Configuration")
public class ConfigurationDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_config;

    @OneToOne
    @JoinColumn(name = "id_device")
    private DevicesDomain id_divice;

    private String config_first;

    private String config_last;

    private String deference;

    @ManyToOne
    @JoinColumn(name = "id_user_reg",referencedColumnName = "user_id")
    private UsersDomain id_user_reg;

    @ManyToOne
    @JoinColumn(name = "id_user_old",referencedColumnName = "user_id")
    private UsersDomain id_user_old;

    @NotNull
    private Date date_reg;

    private Date date_old;

    @ManyToOne
    @JoinColumn(name = "is_status",referencedColumnName ="id_status" )
    private RefStatusDomain is_status;

    public ConfigurationDomain() {
    }

    public RefStatusDomain getIs_status() {
        return is_status;
    }

    public void setIs_status(RefStatusDomain is_status) {
        this.is_status = is_status;
    }

    public Integer getId_config() {
        return id_config;
    }

    public void setId_config(Integer id_config) {
        this.id_config = id_config;
    }

    public DevicesDomain getId_divice() {
        return id_divice;
    }

    public void setId_divice(DevicesDomain id_divice) {
        this.id_divice = id_divice;
    }

    public String getConfig_first() {
        return config_first;
    }

    public void setConfig_first(String config_first) {
        this.config_first = config_first;
    }

    public String getConfig_last() {
        return config_last;
    }

    public void setConfig_last(String config_last) {
        this.config_last = config_last;
    }

    public String getDeference() {
        return deference;
    }

    public void setDeference(String deference) {
        this.deference = deference;
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



}
