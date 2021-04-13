package volcanicminepreresetnotifier;

import java.awt.Color;
import net.runelite.api.Client;
import net.runelite.client.ui.overlay.infobox.InfoBox;
import net.runelite.client.util.ImageUtil;

public class volcanicMinePreResetNotifierInfoBox extends InfoBox {
    private volcanicMinePreResetNotifierPlugin plugin;
    private Client client;

    public volcanicMinePreResetNotifierInfoBox(Client client, volcanicMinePreResetNotifierPlugin plugin) {
        super(ImageUtil.getResourceStreamFromClass(volcanicMinePreResetNotifierPlugin.class, "/rock.png"), plugin);
        this.plugin = plugin;
        this.client = client;
    }

    public String getText() {
        return String.valueOf(volcanicMinePreResetNotifierPlugin.capCount);
    }

    public Color getTextColor() {
        return Color.WHITE;
    }

    public String getTooltip() {
        return "You have capped  " + volcanicMinePreResetNotifierPlugin.capCount + " times.";
    }
}