package me.themajster.proxy.check;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class CheckIp {
    public static int checkip(final String ip) {
        try {
            final URL url = new URL("http://iphub.info/api.php?ip="+ ip +"&showtype=2");
            final BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line = reader.readLine();
            String os = "";
            if (line != null) {
        		os = line.substring(line.length() - 1);
        		return Integer.valueOf(os);
            }
    		return Integer.valueOf(os);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
		return 1;
    }
}
