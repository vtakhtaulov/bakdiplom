package progect.domain.network;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import progect.domain.RefStatusDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Table(schema = "network", name = "Pool_address")
public class Pool_address_Domain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pool_address;

    @Column(name = "name_pool")
    @NotNull
    private String name_pool;

    @Column(name = "ip_addres_start")
    @NotNull
    private String ip_addres_start;

    @Column(name = "ip_addres_end")
    @NotNull
    private String ip_addres_end;

    @Column(name = "date_reg")
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date date_reg;

    @Column(name = "date_old")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date date_old;

    @ManyToOne
    @JoinColumn(name = "id_user_old",referencedColumnName = "user_id")
    private UsersDomain id_user_old;

    @ManyToOne
    @JoinColumn(name = "id_user_reg",referencedColumnName = "user_id")
    private UsersDomain id_user_reg;

    @ManyToOne
    @JoinColumn(name = "is_status",referencedColumnName ="id_status" )
    private RefStatusDomain is_status;

    public Pool_address_Domain(){

    }

    public Integer getId_pool_address() {
        return id_pool_address;
    }

    public void setId_pool_address(Integer id_pool_address) {
        this.id_pool_address = id_pool_address;
    }

    public String getName_pool() {
        return name_pool;
    }

    public void setName_pool(String name_pool) {
        this.name_pool = name_pool;
    }

    public String getIp_addres_start() {
        return ip_addres_start;
    }

    public void setIp_addres_start(String ip_addres_start) {
        this.ip_addres_start = ip_addres_start;
    }

    public String getIp_addres_end() {
        return ip_addres_end;
    }

    public void setIp_addres_end(String ip_addres_end) {
        this.ip_addres_end = ip_addres_end;
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

    public UsersDomain getId_user_old() {
        return id_user_old;
    }

    public void setId_user_old(UsersDomain id_user_old) {
        this.id_user_old = id_user_old;
    }

    public UsersDomain getId_user_reg() {
        return id_user_reg;
    }

    public void setId_user_reg(UsersDomain id_user_reg) {
        this.id_user_reg = id_user_reg;
    }

    public RefStatusDomain getIs_status() {
        return is_status;
    }

    public void setIs_status(RefStatusDomain is_status) {
        this.is_status = is_status;
    }

    public String getFIOReg(){
        return this.id_user_reg.getFirst_name() +" "
                +this.id_user_reg.getLast_name()+" "
                +this.id_user_reg.getMiddle_name();
    }
    public String getFIOOld(){
            try {
                return this.id_user_old.getFirst_name() + " "
                        + this.id_user_old.getLast_name() + " "
                        + this.id_user_old.getMiddle_name();
            }
        catch (Exception e){
            return " ";
        }
    }

}
