package progect.DTO.journal;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import progect.domain.devices.DevicesDomain;
import progect.domain.journal.ConfigurationDomain;
import progect.domain.user.UsersDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


public class ConfigurationDTO {

    private Integer id_config;

    private Integer id_divice;
    private String host_name;

    private String config_first;

    private String config_last;

    private String deference;

    private Integer id_user_reg;
    private String user_reg;

    private Integer id_user_old;
    private String user_old;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date date_reg;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date date_old;

    private Integer actual;

    public ConfigurationDTO(ConfigurationDomain obj) {
        this.id_config = obj.getId_config();
        this.id_divice = obj.getId_divice().getId_devices();
        this.host_name = obj.getId_divice().getHostname();
        this.config_first = obj.getConfig_first();
        this.config_last = obj.getConfig_last();
        this.deference = obj.getDeference();
        this.id_user_reg = obj.getId_user_reg().getUser_id();
        this.user_reg = obj.getId_user_reg().getFioUser();
        this.id_user_old = obj.getId_user_old().getUser_id();
        this.user_old = obj.getId_user_old().getFioUser();
        this.date_reg = obj.getDate_reg();
        this.date_old = obj.getDate_old();
        this.actual = obj.getActual();
    }

    public Integer getId_config() {
        return id_config;
    }

    public void setId_config(Integer id_config) {
        this.id_config = id_config;
    }

    public Integer getId_divice() {
        return id_divice;
    }

    public void setId_divice(Integer id_divice) {
        this.id_divice = id_divice;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
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

    public Integer getId_user_reg() {
        return id_user_reg;
    }

    public void setId_user_reg(Integer id_user_reg) {
        this.id_user_reg = id_user_reg;
    }

    public String getUser_reg() {
        return user_reg;
    }

    public void setUser_reg(String user_reg) {
        this.user_reg = user_reg;
    }

    public Integer getId_user_old() {
        return id_user_old;
    }

    public void setId_user_old(Integer id_user_old) {
        this.id_user_old = id_user_old;
    }

    public String getUser_old() {
        return user_old;
    }

    public void setUser_old(String user_old) {
        this.user_old = user_old;
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

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        this.actual = actual;
    }

    @Override
    public String toString() {
        return "ConfigurationDTO{" +
                "id_config=" + id_config +
                ", id_divice=" + id_divice +
                ", host_name='" + host_name + '\'' +
                ", config_first='" + config_first + '\'' +
                ", config_last='" + config_last + '\'' +
                ", deference='" + deference + '\'' +
                ", id_user_reg=" + id_user_reg +
                ", user_reg='" + user_reg + '\'' +
                ", id_user_old=" + id_user_old +
                ", user_old='" + user_old + '\'' +
                ", date_reg=" + date_reg +
                ", date_old=" + date_old +
                ", actual=" + actual +
                '}';
    }
}
