package fr.Florent59.Weather;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static int freqTemps;
	public static int compteur;
	public static boolean changementTempsAutorise;
	
	@Override
	public void onEnable(){
		super.onEnable();
		
		changementTempsAutorise = getConfig().getBoolean("ChangementTempsAutorise");
		
		if(changementTempsAutorise){
		
		freqTemps = getConfig().getInt("FreqTemps");
		compteur = 0;
		
		}
		
		if (!this.getDataFolder().exists()) { 
	        this.saveDefaultConfig();
	        this.getConfig().options().copyDefaults(true);
	    } // S'il n'y a pas de dossier et de fichier de configuration, on crée ceux par défaut. 
			
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new StopWeather(), this);
		
	}
	
}
