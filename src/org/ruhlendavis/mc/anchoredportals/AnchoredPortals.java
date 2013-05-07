package org.ruhlendavis.mc.anchoredportals;

import java.io.IOException;
import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;
import org.mcstats.Metrics;
import org.ruhlendavis.mc.utility.Log;

/**
 *
 * @author Iain E. Davis <iain@ruhlendavis.org>
 */
public final class AnchoredPortals extends JavaPlugin
{
	public static Log log;
	private static Metrics metrics;

	/**
	 * Called by Minecraft when enabling the plugin.
	 */
	@Override
	public void onEnable()
	{
		log = new Log(this.getLogger(), Level.CONFIG);
		try
		{
			metrics = new Metrics(this);
			metrics.start();
			log.fine("Plugin Metrics activated.");
		}
		catch (IOException e)
		{
			log.warning("Plugin Metrics submission failed.");
		}
	}

	/**
	 * Called by Minecraft when disabling the plugin.
	 */
	@Override
	public void onDisable()
	{

	}
}
