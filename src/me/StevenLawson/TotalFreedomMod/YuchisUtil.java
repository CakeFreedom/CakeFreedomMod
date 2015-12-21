package me.StevenLawson.TotalFreedomMod;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.GameMode;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import static org.bukkit.Bukkit.getPlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class YuchisUtil
{
    public static void opBlow(final Player player)
    {
      TFM_Util.bcastMsg(player.getName() + " has been a naughty, naughty person", ChatColor.RED);
      TFM_Util.bcastMsg(player.getName() + " is gonna be blown up!", ChatColor.RED);
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
    public static void remixedCakesBlowjob(final CommandSender sender, final Player sender_p, final String[] args)
    {
      final Player player = getPlayer(args[0]);
      TFM_Util.bcastMsg("ALERT: " + sender.getName() + " is gonna blowjob' " + player.getName() + "!", ChatColor.RED);
      TFM_Util.bcastMsg("<" + ChatColor.RED + "Bob" + ChatColor.WHITE + "> Lawyer, DO SOMETHING! TO STOP THEM!");
      TFM_Util.bcastMsg("<" + ChatColor.RED + "Lawyer" + ChatColor.WHITE + "> Sorry, Bob.");
      TFM_Util.bcastMsg("<" + ChatColor.RED + "Lawyer" + ChatColor.WHITE + "> I'm no longer your lawyer because I'm not going near that");
      player.chat("FUCK ME HARDER");
      sender_p.chat("OKAY");
      player.chat("HARDERRRRRR");
      sender_p.chat("THERE WE GO >:D");
      player.chat("Man that feels good");
      player.chat("TO HARD!");
      player.chat("TOOOOO HARDD!");
      player.chat("*dies*");
      opBlow(player);
      sender_p.chat("TROLOLOLOLOLOL");
    }
    public static void darkIsSwag(final Player player)
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
