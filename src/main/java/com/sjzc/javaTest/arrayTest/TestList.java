package com.sjzc.javaTest.arrayTest;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhaochong on 2020/8/4
 * @version 1.0
 */
public class TestList {
    public static void main(String[] args) throws InterruptedException {
        List<String> ls = new ArrayList<>();
        ls.add("12312");
        ls.add("212321");
        String collect = ls.stream().collect(Collectors.joining("','","'","'"));
        System.out.println(collect);
        System.out.println(TestList.getLocalIp());

        long start = System.currentTimeMillis();
        System.out.println(start);
        Thread.sleep(1932);
        long end = (System.currentTimeMillis());
        System.out.println(end);
    }


    public static String getLocalIp() {
        try {
            Enumeration networkInterface = NetworkInterface.getNetworkInterfaces();

            while(networkInterface.hasMoreElements()) {
                NetworkInterface ni = (NetworkInterface)networkInterface.nextElement();
                Enumeration inetAddress = ni.getInetAddresses();

                while(inetAddress.hasMoreElements()) {
                    InetAddress ia = (InetAddress)inetAddress.nextElement();
                    if (!(ia instanceof Inet6Address)) {
                        String thisIp = ia.getHostAddress();
                        if (thisIp != null && !ia.isLoopbackAddress() && !thisIp.contains(":") && !thisIp.startsWith("127.0.")) {
                            return thisIp;
                        }
                    }
                }
            }
        } catch (SocketException var5) {
        }

        return "127.0.0.1";
    }
}