package progect.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class UserDTO {
    @JsonProperty(value = "user_id")
    private Integer user_id;
    @JsonProperty(value = "last_name")
    private String last_name;
    @JsonProperty(value = "first_name")
    private String first_name;
    @JsonProperty(value = "middle_name")
    private String middle_name;
    @JsonProperty(value = "email")
    private String email;
    @JsonProperty(value = "phone")
    private String phone;
    @JsonProperty(value = "user_login")
    private String user_login;

    @Override
    public String toString() {
        return "UserDTO{" +
                "user_id=" + user_id +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", user_login='" + user_login + '\'' +
                '}';
    }
}
