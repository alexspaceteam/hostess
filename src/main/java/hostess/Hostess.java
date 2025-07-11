package hostess;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Hostess extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Register event listener
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("Hostess plugin is now active!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String name = player.getName();
        String message = "Welcome " + name + " to the server!";
        Bukkit.broadcastMessage(message);
    }
}
