package com.beepboop.pluginproject;

import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ChatListener implements Listener{
    
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();
        String playerMessage = event.getMessage().toLowerCase();

        if(playerMessage.equals("jun")) {
            Bukkit.broadcastMessage("This bruh");
        }
    }
}
