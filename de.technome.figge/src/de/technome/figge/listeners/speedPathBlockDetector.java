package de.technome.figge.listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class speedPathBlockDetector implements Listener{
	
	
	
	@EventHandler
	public void onPLayerMove(PlayerMoveEvent e) {
		
		Player p = e.getPlayer();
		
		Location loc = p.getLocation();
		loc.setY(loc.getY() -0.5);
		String block = loc.getWorld().getBlockAt(loc).getType().name();
		
		if(block.equals("GRASS_PATH")) {
			p.setWalkSpeed(0.3f);
			
		}
		if(!block.equals("GRASS_PATH")) {
			p.setWalkSpeed(0.2f);
		}
		
	}
}