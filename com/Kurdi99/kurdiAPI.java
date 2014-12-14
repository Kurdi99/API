package com.Kurdi99;
import org.bukkit.plugin.java.javaplugin;


public class Main extends JavaPlugin {

public void onEnable() {
Bukkit.getServer().getPluginManager().registerEvents(this, this);
}
public void onDisable() {
sendToConsole("Plugin uses sendToConsole Method!", true);
}
public static void getPluginNumber(int plugin, Player sender){
  plugin = Bukkit.getServer().getPluginManager().getPlugins().length;
  sender.sendMessage(ChatColor.GOLD + "Number Of Plugins: " + plugin);
}
public static void sendToConsole(String msg, boolean b){
  
  if(!b == true){
    return; 
  }else{
  System.out.printLn(msg);
}
}
public static void killAll(String str){
  for(Player all : Bukkit.getServer().getOnlinePlayers){
    all.setHealth(0);
    all.sendMessage(str);
    
  }
}
}
