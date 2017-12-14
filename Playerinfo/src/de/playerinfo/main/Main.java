package de.playerinfo.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.playerinfo.commands.playerinfoCommand;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("[PlayerInfo] Plugin geladen.");
		
		getCommand("playerinfo").setExecutor(new playerinfoCommand());
	}
	
}
