package com.wifidirect.filetransfer.util;

import android.net.wifi.p2p.WifiP2pDevice;

/**
 * @Author: leavesC
 * @Date: 2021/8/25 10:42
 * @Desc:
 * @Github：https://github.com/leavesC
 */
public class WifiP2pUtils {

    public static String getDeviceStatus(int deviceStatus) {
        switch (deviceStatus) {
            case WifiP2pDevice.AVAILABLE:
                return "usable";
            case WifiP2pDevice.INVITED:
                return "inviting";
            case WifiP2pDevice.CONNECTED:
                return "connected";
            case WifiP2pDevice.FAILED:
                return "failure";
            case WifiP2pDevice.UNAVAILABLE:
                return "unavailable";
            default:
                return "unknown";
        }
    }

}
