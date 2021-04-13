package volcanicminepreresetnotifier;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class volcanicMinePreResetNotifierPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(volcanicMinePreResetNotifierPlugin.class);
		RuneLite.main(args);
	}
}