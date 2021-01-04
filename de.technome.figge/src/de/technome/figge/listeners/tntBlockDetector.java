package de.technome.figge.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class tntBlockDetector implements Listener {

	
	@EventHandler
	public void handlePlayerPlaceBlock(BlockPlaceEvent e) {
		
		Player p = e.getPlayer();
		Block b = e.getBlockPlaced();
		Location loc = b.getLocation();
		
		int xInt = (int)loc.getX();
		int yInt = (int)loc.getY();
		int zInt = (int)loc.getZ();
		
		
		if(b.getType().equals(Material.TNT)) {
			for (Player player : Bukkit.getOnlinePlayers()) {
			    player.sendMessage("TNT Block placed at:  X: " + xInt + " Y: " + yInt + " Z: " + zInt + " by: " + p.getName());
			}
		}
		if(b.getType().equals(Material.FIRE)) {
			for (Player player : Bukkit.getOnlinePlayers()) {
			    player.sendMessage("Fire placed at:  X: " + xInt + " Y: " + yInt + " Z: " + zInt + " by: " + p.getName());
			}
		}
	}
}
