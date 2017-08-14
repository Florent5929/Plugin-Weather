package fr.Florent59.Weather;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class StopWeather implements Listener {
	
	@EventHandler (priority = EventPriority.LOW)
	public void QuandLeTempsChange(WeatherChangeEvent e){
	
		if(Main.changementTempsAutorise){
		
		if (Main.compteur < Main.freqTemps){
		e.setCancelled(true);
		Main.compteur++;
		} else 
			Main.compteur = 0;
		
		
				} else 
				e.setCancelled(true);
										
			
				}
	
			}