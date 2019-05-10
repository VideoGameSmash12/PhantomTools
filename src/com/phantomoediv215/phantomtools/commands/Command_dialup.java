package com.phantomoediv215.phantomtools.commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Command_dialup extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.BLUE + "Welcome!");
        sender.sendMessage(ChatColor.DARK_BLUE + "You've got mail!");
        return true;
    }
}
