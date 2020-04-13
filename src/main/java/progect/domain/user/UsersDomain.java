package progect.domain.user;

import lombok.Data;
import progect.domain.devices.DevicesDomain;
import progect.domain.journal.NetworkJournalDomain;
import progect.domain.network.NetworkDomain;
import progect.domain.network.Pool_address_Domain;
import progect.domain.room.RoomDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(schema = "auth", name = "users")
@Data
public class UsersDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @NotNull
    private String last_name;

    @NotNull
    private String first_name;

    @NotNull
    private String middle_name;

    @NotNull
    private String email;

    @NotNull
    private String phone;

    @NotNull
    private String user_login;

    @NotNull
    private String user_password;

    @NotNull
    private String user_role;


    public UsersDomain() {
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }
}
