package com.phantomoediv215.phantomtools;

import com.phantomoediv215.phantomtools.commands.Command_phantomtools;
import net.pravian.bukkitlib.BukkitLib;
import net.pravian.bukkitlib.command.BukkitCommandHandler;
import net.pravian.bukkitlib.config.YamlConfig;
import net.pravian.bukkitlib.implementation.BukkitPlugin;
import net.pravian.bukkitlib.util.LoggerUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class PhantomTools extends BukkitPlugin { 
    
    public PhantomTools plugin;
    public YamlConfig config;
    public BukkitCommandHandler handler;

    @Override
    public void onLoad() {
        this.plugin = this;
        this.handler = new BukkitCommandHandler(plugin);
    }
    
    @Override
    public void onEnable() {
        BukkitLib.init(plugin);
        config = new YamlConfig(plugin, "config.yml");
        config.load();
        handler.setCommandLocation(Command_phantomtools.class.getPackage());
        LoggerUtils.info(plugin, "PhantomTools for " + config.getString("server-name") + " (v" + plugin.getVersion() + ") has been enabled.");
    }
    @Override
    public void onDisable() {
        LoggerUtils.info(plugin, "PhantomTools for " + config.getString("server-name") + " (v" + plugin.getVersion() + ") has been disabled.");
    
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        return handler.handleCommand(sender, cmd, commandLabel, args);
    }
}
