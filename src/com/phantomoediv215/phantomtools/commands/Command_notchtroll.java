package com.phantomoediv215.phantomtools.commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;


public class Command_notchtroll extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        server.broadcastMessage(ChatColor.YELLOW + "Notch joined the game.");
        server.broadcastMessage("<Notch> Oops, wrong server.");
        server.broadcastMessage(ChatColor.YELLOW + "Notch left the game.");
       
        return true;
    
    }
}
