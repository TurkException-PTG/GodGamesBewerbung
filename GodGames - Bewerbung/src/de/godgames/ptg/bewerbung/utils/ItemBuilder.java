package de.godgames.ptg.bewerbung.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
/*
Halil H.
Created on 2020 inside the package - *
*/
public class ItemBuilder {
	  public static ItemStack createItem(Material material, int anzahl, int subid, String displayname)
	  {
	    short newsubid = (short)subid;
	    ItemStack i = new ItemStack(material, anzahl, newsubid);
	    ItemMeta m = i.getItemMeta();
	    m.setDisplayName(displayname);
	    i.setItemMeta(m);
	    return i;
	  }

}
