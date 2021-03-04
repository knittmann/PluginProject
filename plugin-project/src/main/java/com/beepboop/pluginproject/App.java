package com.beepboop.pluginproject;

import org.bukkit.plugin.java.JavaPlugin;
public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Hello, SpigotMC!");
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC!");
    }

}