package org.essentials.antiexploit;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AntilagCommand
  implements CommandExecutor
{
  private Main plugin;
  
  public AntilagCommand(Main plugin)
  {
    this.plugin = plugin;
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    return false;
  }
}
