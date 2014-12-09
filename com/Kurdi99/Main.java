package com.Kurdi99;
import org.bukkit.plugin.java.javaplugin;


public class Main extends JavaPlugin {

public void onEnable() {
Bukkit.getServer().getPluginManager().registerEvents(this, this);
}
public void onDisable() {
//Later On
}
public boolean isFlying(Player p, String name) {
  if(!p.getFly(true)){
    return;
  }else{
    isFlying = false;
    String str = "You cannot fly!";
    p.sendMessage(ChatColor.RED + str);
return isFlying;
  }
}
@EventHandler(priority = Priority.HIGH)
public void onPlayerChat(AsyncPlayerChatEvent e){
  if(e.getMessage.equalsIgnoreCase("fly")){
    e.setCancelled(true);
    e.getPlayer().setFlying(true);
    e.getPlayer().sendMessage(ChatColor.GOLD + "You can fly!");
    
}
}
