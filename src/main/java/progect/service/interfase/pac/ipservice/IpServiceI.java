package progect.service.interfase.pac.ipservice;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public interface IpServiceI {
    String netAddress (String addr);
    List<String> getAllIpAddress(String addressStart, String addressEnd);
}
