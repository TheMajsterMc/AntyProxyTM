package me.themajster.proxy.file;

import me.themajster.proxy.Main;

public class Config
{
    public static String MessageKick;

    
    public Config() {
        load();
    }
    
    private static void load() {
        
        Config.MessageKick = Main.getPlugin().getConfig().getString("Config.kick");
    }
}
