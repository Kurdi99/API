package com.Kurdi99;
import org.bukkit.plugin.java.javaplugin;


public class Main extends JavaPlugin {

private String name;


public void onEnable() {
Bukkit.getServer().getPluginManager().registerEvents(this, this);
}
public void onDisable() {
sendToConsole("Plugin uses sendToConsole Method!", true);
}
public static int getPluginNumber(){
  plugin = Bukkit.getServer().getPluginManager().getPlugins().length;
return plugin;
}
public static void sendToConsole(String msg, boolean b){
  
  if(!b == true){
    return; 
  }else{
  System.out.println(msg);
}
}
public static void killAllPlayers(){
  for(Player all : Bukkit.getServer().getOnlinePlayers){
    all.setHealth(0);
  }
}
public static String getName();
return name;
}
}
