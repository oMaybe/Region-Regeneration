package net.liquided.regionregen;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new EventListener(), this);
		
		getServer().getLogger().info("§b=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		getServer().getLogger().info("§b=-=- §2Region §cRegeneration §b is now §aenanled!");
		getServer().getLogger().info("§b=-=- §2Author §c Liquid#3099");
		getServer().getLogger().info("§b=-=- §2Version &c 1.0");
		getServer().getLogger().info("§b=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");	
	}
	
	@Override
	public void onDisable() {
		getServer().getLogger().info("§b=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		getServer().getLogger().info("§b=-=- §2Region §cRegeneration §b is now §cdisabled!");
		getServer().getLogger().info("§b=-=- §2Author §c Liquid#3099");
		getServer().getLogger().info("§b=-=- §2Version &c 1.0");
		getServer().getLogger().info("§b=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");	
	}
	
}
