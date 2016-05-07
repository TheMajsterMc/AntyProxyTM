package me.themajster.proxy.listeners;

import me.themajster.proxy.check.CheckIp;
import me.themajster.proxy.file.Config;
import me.themajster.proxy.util.Util;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

public class PreLoginListener implements Listener {

	   @EventHandler(priority = EventPriority.MONITOR)
	    public void onJoin(final AsyncPlayerPreLoginEvent e) {
		   String ip = e.getAddress().getHostAddress();
		   if(CheckIp.checkip(ip) == 1){
	            e.disallow(AsyncPlayerPreLoginEvent.Result.KICK_OTHER, Util.fixColor(Config.MessageKick));  
		   }
	   }
}
