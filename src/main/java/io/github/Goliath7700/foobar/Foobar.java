package io.github.Goliath7700.foobar;

import io.github.Goliath7700.foobar.Listeners.HitListener;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LightningStrike;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import javax.swing.text.html.parser.Entity;

public final class Foobar extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getLogger().info("Bob joined");
        getServer().getPluginManager().registerEvents(new HitListener(), this);

                //first actually, the IntelliJ auto complete is really useful
                //so among these options, which would be appropriate for printing to console?

                //btw, you can open Auto-complete with
                //CTRL + SPACE
                //aight soo commands
                //we need /smite
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        getLogger().info("Bob left");
    }

    //I am steve
    //this will be our
    // /steve command

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("fart")) {

            if (args.length == 0) {
                sender.sendMessage("You provided no players to fart on.");
            } else {
                Player target = Bukkit.getPlayer(args[0]);

                if (target == null) {
                    sender.sendMessage("Enter an online player.");
                } else {
                    String message = ("You just got farted on by " + sender.getName());
                    target.sendMessage(message);
                    target.setHealth(1.0);
                }
            }

        }

        if (command.getName().equalsIgnoreCase("smite")) {
            if (args.length == 0) {
                sender.sendMessage("You provided no players to smite.");
            } else {
                Player target = Bukkit.getPlayer(args[0]);

                if (target == null) {
                    sender.sendMessage("Enter an online player.");
                } else {
                    target.getWorld().spawn(target.getLocation(), LightningStrike.class);
                }
            }
        }

        return true;
    }
}
