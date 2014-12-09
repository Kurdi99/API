package com.Kurdi99;
import org.bukkit.plugin.java.javaplugin;


public class Main extends JavaPlugin {

public void onEnable() {
//Later On
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

}
