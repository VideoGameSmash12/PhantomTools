package com.phantomoediv215.phantomtools.commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Command_phantomtools extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        {
            sender.sendMessage(ChatColor.DARK_GREEN + "PhantomTools:");
            sender.sendMessage(ChatColor.GREEN + "Contributors: " + ChatColor.AQUA + "cowgomooo12, TheSuspense76");
            sender.sendMessage(ChatColor.GREEN + "Version: " + ChatColor.AQUA + "0.2"); 
        }
        return false;
    }
}