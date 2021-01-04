package de.technome.figge.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.technome.figge.listeners.speedPathBlockDetector;
import de.technome.figge.listeners.tntBlockDetector;

public class main extends JavaPlugin {
	
	private static main plugin;
	
	@Override
	public void onEnable() {
		PluginManager pluginManager = Bukkit.getPluginManager();
		pluginManager.registerEvents(new speedPathBlockDetector(), this);
		pluginManager.registerEvents(new tntBlockDetector(), this);
		plugin = this;
	}


	public static main getPlugin() {
		return plugin;
	}
}
