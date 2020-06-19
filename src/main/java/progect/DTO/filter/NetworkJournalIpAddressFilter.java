package progect.DTO.filter;

public class NetworkJournalIpAddressFilter {
    private Integer id;
    private String ip_address;

    public NetworkJournalIpAddressFilter(Integer id, String ip_address) {
        this.id = id;
        this.ip_address = ip_address;
    }

    public NetworkJournalIpAddressFilter() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }
}
