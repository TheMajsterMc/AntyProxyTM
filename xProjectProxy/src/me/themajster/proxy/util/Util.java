package me.themajster.proxy.util;

import org.bukkit.ChatColor;

public class Util {
	public static String fixColor(String s){
		return ChatColor.translateAlternateColorCodes('&', s);
	}

}
