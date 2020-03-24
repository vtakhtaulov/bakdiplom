package progect.domain.user;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "auth", name = "users")
@Data
public class UsersDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_id;

    @Column(name = "last_name")
    @NotNull
    private String last_name;

    @Column(name = "first_name")
    @NotNull
    private String first_name;

    @Column(name = "middle_name")
    @NotNull
    private String middle_name;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "phone")
    @NotNull
    private String phone;

    @Column(name = "user_login")
    @NotNull
    private String user_login;

    @Column(name = "user_password")
    @NotNull
    private String user_password;

    @Column(name = "user_role")
    @NotNull
    private String user_role;


    public UsersDomain() {
    }

}
