package api_;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress host2 = InetAddress.getByName("DESKTOP-22D9HVE");
        System.out.println(host2);

        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress);

        String hostName = host2.getHostName();
        System.out.println(hostName);
    }
}
