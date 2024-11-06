package de.onvif.soap;

import de.onvif.soap.devices.MediaDevices;
import org.onvif.ver10.schema.Profile;

import java.util.ArrayList;
import java.util.List;

public class OnvifUtils {


    public static String getRTSP(String host, String username, String password) {
        try {
            OnvifDevice device = new OnvifDevice(host, username, password);
            MediaDevices media = device.getMedia();
            Profile profile = device.getDevices().getProfiles().get(0);
            String token = profile.getToken();
            String rtsp = media.getRTSPStreamUri(token);
            rtsp = rtsp.replace(host, username + ":" + password + "@" + host);
            return rtsp;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> getRTSPList(String host, String username, String password) {
        try {
            List<String> rtsp = new ArrayList<String>();
            OnvifDevice device = new OnvifDevice(host, username, password);
            MediaDevices media = device.getMedia();
            for (Profile profile : device.getDevices().getProfiles()) {
                String token = profile.getToken();
                String uri = media.getRTSPStreamUri(token);
                uri = uri.replace(host, username + ":" + password + "@" + host);
                rtsp.add(uri);
            }
            return rtsp;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> getMainRTSPList(String host, String username, String password) {
        try {
            List<String> rtsp = new ArrayList<String>();
            OnvifDevice device = new OnvifDevice(host, username, password);
            MediaDevices media = device.getMedia();
            List<Profile> profiles = device.getDevices().getProfiles();
            int size = profiles.size();
            for (int i = 0; i < size; i++) {
                Profile profile = profiles.get(i);
                String token = profile.getToken();
                if(i == 0 || token.contains("_1")) {
                    String uri = media.getRTSPStreamUri(token);
                    uri = uri.replace(host, username + ":" + password + "@" + host);
                    rtsp.add(uri);
                }
            }
            return rtsp;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
