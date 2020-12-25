package de.godgames.ptg.bewerbung.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.godgames.ptg.bewerbung.utils.ItemBuilder;
/*
Halil H.
Created on 25.12.2020 inside the package - de.godgames.ptg.bewerbung.commands
*/
public class give_Command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		Player p = (Player)arg0;
		p.getInventory().addItem(ItemBuilder.createItem(Material.STICK, 1, 0, "§aStick"));
		return false;
	}

}
