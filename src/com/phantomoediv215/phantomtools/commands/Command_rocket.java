package com.phantomoediv215.phantomtools.commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;


public class Command_rocket extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.RED + "Dude, what the actual hell are you trying to do?!");
        return true;
    
    }
}
