package com.Kurdi99;
import org.bukkit.plugin.java.javaplugin;


public class Main extends JavaPlugin {

public void onEnable() {
Bukkit.getServer().getPluginManager().registerEvents(this, this);
}
public void onDisable() {
//Later On
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
}
