/*
 * Copyright (c) 2020 VideoGameSmash12
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package videogamesm12.phantomtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * @author Video
 */
public class Command_colors implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        // First, the Chat Colors using letters //
        sender.sendMessage(ChatColor.GOLD + "Color List:");
        sender.sendMessage(ChatColor.GREEN + "Light Green - &a");
        sender.sendMessage(ChatColor.AQUA + "Light Aqua - &b");
        sender.sendMessage(ChatColor.RED + "Light Red - &c");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "Pink - &d");
        sender.sendMessage(ChatColor.YELLOW + "Yellow - &e");
        sender.sendMessage(ChatColor.WHITE + "White - &f");

        sender.sendMessage(ChatColor.GOLD + "--");
        
        // Then, the Chat Colors using numbers //
        sender.sendMessage(ChatColor.BLACK + "Black - &0");
        sender.sendMessage(ChatColor.DARK_BLUE + "Dark Blue - &1");
        sender.sendMessage(ChatColor.DARK_GREEN + "Dark Green - &2");
        sender.sendMessage(ChatColor.DARK_AQUA + "Dark Aqua - &3");
        sender.sendMessage(ChatColor.DARK_RED + "Dark Red - &4");
        sender.sendMessage(ChatColor.DARK_PURPLE + "Purple - &5");
        sender.sendMessage(ChatColor.GOLD + "Gold - &6");
        sender.sendMessage(ChatColor.GRAY + "Light Gray - &7");
        sender.sendMessage(ChatColor.DARK_GRAY + "Dark Gray - &8");
        sender.sendMessage(ChatColor.BLUE + "Light Blue - &9");
        
        return true;
    }
    
}
