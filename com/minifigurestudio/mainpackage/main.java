package com.minifigurestudio.mainpackage;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	//When the plugin starts
	public void onEnable()
	{
		
	}
	
	//When the plugin ends
	public void onDisable()
	{
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	Player player = (Player) sender;
	if(commandLabel.equalsIgnoreCase("sendme")){
		player.sendMessage(ChatColor.DARK_PURPLE + "Sent");
	}
	return true;
	}  
}
