package de.playerinfo.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class playerinfoCommand implements CommandExecutor {
	
	String prefix = "§aPlayerInfo §8> §7";
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof ConsoleCommandSender) {
			System.out.println("Du musst ein Spieler sein!");
		}
		
		Player p = (Player) sender;
		
		if(args.length == 1) {
			Player t = Bukkit.getPlayerExact(args[0]);
			
			if(t != null) {
				p.sendMessage(prefix + "Name: §a" + t.getName());
				p.sendMessage(prefix + "Leben: §a" + t.getHealth());
				p.sendMessage(prefix + "Hunger: §a" + t.getFoodLevel());
				p.sendMessage(prefix + "Welt: §a" + t.getLocation().getWorld().getName());
				p.sendMessage(prefix + "Position: §a" + t.getLocation().getBlockX() + ", " + t.getLocation().getBlockY() + ", " + t.getLocation().getBlockZ());
				p.sendMessage(prefix + "Gamemode: §a" + t.getGameMode());
				p.sendMessage(prefix + "Whitelisted: §a" + t.isWhitelisted());
			}else {
				p.sendMessage(prefix + "§cDieser Spieler ist nicht Online!");
			}
		}else {
			p.sendMessage(prefix + "§e/playerinfo <Spieler>");
		}
		return true;
	}

}
