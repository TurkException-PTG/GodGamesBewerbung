package de.godgames.ptg.bewerbung;

import org.bukkit.plugin.java.JavaPlugin;

import de.godgames.ptg.bewerbung.commands.give_Command;
import de.godgames.ptg.bewerbung.event.stick_InteractEvent;
/*
Halil H.
Created on 25.12.2020 inside the package - de.godgames.ptg.bewerbung
*/
public class Bewerbung extends JavaPlugin{
	private static Bewerbung instance;
	private final String Prefix = "§7[§4BW§7]: ";
	
	@Override
	public void onEnable() {
		getCommand("give").setExecutor(new give_Command());
		getServer().getPluginManager().registerEvents(new stick_InteractEvent(), this);
	}
	public static Bewerbung getInstance() {
		return instance;
	}
	public String getPrefix() {
		return Prefix;
	}
}
