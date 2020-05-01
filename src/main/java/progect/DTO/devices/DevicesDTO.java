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

