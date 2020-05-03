package progect.DTO.devices;


import progect.domain.devices.DevicesDomain;

public class DevicesDTO {

    private Integer id_devices;

    private Integer id_type_devices;
    private String type_device;

    private Integer id_user_otv;
    private String user_otv;

    private String hostname;
    private String mac_address;

    private Integer id_room;
    private String  room;

    private Integer id_props_port;
    private String countOptPort;
    private String countEthernetPort;

    public DevicesDTO(DevicesDomain dev) {
        this.id_devices = dev.getId_devices();
        this.id_type_devices = dev.getId_type_devices().getId_type_dev();
        this.type_device = dev.getId_type_devices().getName_type_dev();
        this.id_user_otv = dev.getUser_otv().getUser_id();
        this.user_otv = dev.getUser_otv().getFioUser();
        this.hostname = dev.getHostname();
        this.id_room = dev.getId_room().getId_room();
        this.room = dev.getId_room().getName_room();
        this.id_props_port = dev.getId_props_port().getId_props_port();
        this.countOptPort = dev.getId_props_port().getOVPort();
        this.countEthernetPort = dev.getId_props_port().getOVPort();
        this.mac_address = dev.getMac_address();
    }

    public Integer getId_devices() {
        return id_devices;
    }

    public void setId_devices(Integer id_devices) {
        this.id_devices = id_devices;
    }

    public Integer getId_type_devices() {
        return id_type_devices;
    }

    public void setId_type_devices(Integer id_type_devices) {
        this.id_type_devices = id_type_devices;
    }

    public String getType_device() {
        return type_device;
    }

    public void setType_device(String type_device) {
        this.type_device = type_device;
    }

    public Integer getId_user_otv() {
        return id_user_otv;
    }

    public void setId_user_otv(Integer id_user_otv) {
        this.id_user_otv = id_user_otv;
    }

    public String getUser_otv() {
        return user_otv;
    }

    public void setUser_otv(String user_otv) {
        this.user_otv = user_otv;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getMac_address() {
        return mac_address;
    }

    public void setMac_address(String mac_address) {
        this.mac_address = mac_address;
    }

    public Integer getId_room() {
        return id_room;
    }

    public void setId_room(Integer id_room) {
        this.id_room = id_room;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Integer getId_props_port() {
        return id_props_port;
    }

    public void setId_props_port(Integer id_props_port) {
        this.id_props_port = id_props_port;
    }

    public String getCountOptPort() {
        return countOptPort;
    }

    public void setCountOptPort(String countOptPort) {
        this.countOptPort = countOptPort;
    }

    public String getCountEthernetPort() {
        return countEthernetPort;
    }

    public void setCountEthernetPort(String countEthernetPort) {
        this.countEthernetPort = countEthernetPort;
    }

    @Override
    public String toString() {
        return "DevicesDTO{" +
                "id_devices=" + id_devices +
                ", id_type_devices=" + id_type_devices +
                ", type_device='" + type_device + '\'' +
                ", id_user_otv=" + id_user_otv +
                ", user_otv='" + user_otv + '\'' +
                ", hostname='" + hostname + '\'' +
                ", mac_address='" + mac_address + '\'' +
                ", id_room=" + id_room +
                ", room='" + room + '\'' +
                ", id_props_port=" + id_props_port +
                ", countOptPort='" + countOptPort + '\'' +
                ", countEthernetPort='" + countEthernetPort + '\'' +
                '}';
    }
}

