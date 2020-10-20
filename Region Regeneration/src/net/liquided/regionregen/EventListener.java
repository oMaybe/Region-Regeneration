package net.liquided.regionregen;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_16_R2.entity.CraftPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener {
		
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		int ping = ((CraftPlayer) e.getPlayer()).getHandle().ping;
		Bukkit.getConsoleSender().sendMessage("§c§lLOG: §ePlayerJoinEvent §2(" + e.getPlayer() + ")§e ping §2(" + ping + "§)");
	}
	
}
