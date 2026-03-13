package io.github.Goliath7700.foobar.Listeners;

import org.bukkit.entity.LightningStrike;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class HitListener implements Listener {
    @EventHandler
    public void onHit(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player && event.getEntity() instanceof Player) {
            Player target = (Player) event.getEntity();

            target.getWorld().spawn(target.getLocation(), LightningStrike.class);
        }
    }
}
