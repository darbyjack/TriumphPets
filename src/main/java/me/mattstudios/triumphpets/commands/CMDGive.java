package me.mattstudios.triumphpets.commands;

import me.mattstudios.mf.annotations.Command;
import me.mattstudios.mf.annotations.Permission;
import me.mattstudios.mf.annotations.SubCommand;
import me.mattstudios.mf.base.CommandBase;
import me.mattstudios.triumphpets.TriumphPets;
import org.bukkit.entity.Player;

@Command("pet")
public class CMDGive extends CommandBase {

    private TriumphPets plugin;

    public CMDGive(TriumphPets plugin) {
        this.plugin = plugin;
    }

    @SubCommand("give")
    @Permission("triumphpets.spawn")
    public void give(Player player) {

        /*player.sendMessage(player.getUniqueId().toString());
        player.sendMessage(playerName);
        player.sendMessage(petType.name());
        player.sendMessage(String.valueOf(tier));

        player.getInventory().getItemInMainHand();*/
    }

}
