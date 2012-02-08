package uk.co.ks07.ptest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PTest extends JavaPlugin {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	if (sender instanceof Player && args.length == 1) {
            Player player = (Player) sender;
            if (player.hasPermission("ptest.test")) {
                if (player.hasPermission(args[0])) {
                    player.sendMessage("PERMISSION: TRUE");
                } else {
                    player.sendMessage("PERMISSION: FALSE");
                }
            }
        }
        return true;
    }
}