package de.godgames.ptg.bewerbung.event;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
/*
Halil H.
Created on 25.12.2020 inside the package - de.godgames.ptg.event
*/
public class stick_InteractEvent implements Listener {
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		 if(p.getInventory().getItemInHand().getType() == Material.STICK) {
			 if(e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) {
				 p.playSound(p.getLocation(), Sound.BLAZE_HIT, 100, 100);
			 }
			 if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
				 p.getWorld().playEffect(p.getLocation(), Effect.EXPLOSION, 1000);
			 }
		 }
	}

}
