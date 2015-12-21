package me.StevenLawson.TotalFreedomMod;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.GameMode;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class YuchisUtil
{
    public static void opBlow(final Player player)
    {
      TFM_Util.bcastMsg(player.getName() + " has been a naughty, naughty person", ChatColor.RED);
      TFM_Util.bcastMsg(player.getName() + " is gonna be blown up!"
      player.setOp(false);
      player.getInventory().clear();
      player.getWorld().createExplosion(player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ(), 4f, false, false);
      final Location targetPos = player.getLocation();
      final World world = player.getWorld();
      for (int x = -1; x <= 1; x++)
      {
        for (int z = -1; z <= 1; z++)
        {
            final Location strike_pos = new Location(world, targetPos.getBlockX() + x, targetPos.getBlockY(), targetPos.getBlockZ() + z);
            world.strikeLightning(strike_pos);
        }
      }
      player.setHealth(0);
    }
    
    // remixedcake's personal cmd also xyuchi can access this
    public static void remixedCakesBlowjob(CommandSender sender, Player player)
    {
      TFM_Util.bcastMsg("ALERT: " + sender.getName() + " is gonna blowjob' " + player.getName() + "!", ChatColor.RED);
      TFM_Util.bcastMsg("<" + ChatColor.RED + "Bob" + ChatColor.WHITE + "> Lawyer, DO SOMETHING! TO STOP THEM!");
      TFM_Util.bcastMsg("<" + ChatColor.RED + "Lawyer" + ChatColor.WHITE + "> Sorry, Bob.");
      TFM_Util.bcastMsg("<" + ChatColor.RED + "Lawyer" + ChatColor.WHITE + "> I'm no longer your lawyer because I'm not going near that");
      TFM_Util.bcastMsg("<" + ChatColor.RED + "Lawyer" + ChatColor.WHITE + "> huge blowjob near " + sender.getName() + " and " + player.getName() "'s BIGGEST BLOWJOB");
      player.chat("FUCK ME HARDER");
      sender.chat("OKAY");
      player.chat("HARDERRRRRR");
      sender.chat("THERE WE GO >:D");
      player.chat("Man that feels good");
      player.chat("TO HARD!");
      player.chat("TOOOOO HARDD!");
      player.chat("*dies*");
      opBlow(player);
      sender.chat("TROLOLOLOLOLOL");
    }
    public static void darkIsSwag(CommandSender sender, Player player)
    {
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
      TFM_Util.bcastMsg("DarkGamingDronze is swag", ChatColor.GRAY);
    }
}
