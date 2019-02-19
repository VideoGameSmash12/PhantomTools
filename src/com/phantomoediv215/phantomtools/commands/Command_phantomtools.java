package com.phantomoediv215.phantomtools.commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Command_phantomtools extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        {
            sender.sendMessage(ChatColor.YELLOW + "- = [ " + ChatColor.GOLD + "PhantomTools" + ChatColor.YELLOW + " ] = -");
            sender.sendMessage(ChatColor.GOLD + "Running on " + ChatColor.YELLOW + plugin.getConfig().getString("server-name") + "."); 
            sender.sendMessage(ChatColor.GOLD + "Version: " + ChatColor.YELLOW + plugin.getConfig().getString("plugin-information.version")); 
        }
        return true;
    }
}