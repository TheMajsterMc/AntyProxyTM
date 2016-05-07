package me.themajster.proxy;

import me.themajster.proxy.file.Config;
import me.themajster.proxy.listeners.PreLoginListener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static Main plugin;
	
	public void onEnable(){
		saveDefaultConfig();
		Main.plugin = this;
		new Config();
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PreLoginListener(), this);
	}
	public static Main getPlugin(){
		return Main.plugin;
	}
}
