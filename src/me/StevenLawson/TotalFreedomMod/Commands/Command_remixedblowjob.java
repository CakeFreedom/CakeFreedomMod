package me.StevenLawson.TotalFreedomMod.Commands;

// remixedcakes personal cmd also xyuchi can access it
import me.StevenLawson.TotalFreedomMod.YuchisUtil;
import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "Give a fuck to someone", usage = "/<command> [playername]", aliases = "blowjob,sex")
public class Command_remixedblowjub extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
      if (!TFM_AdminList.isSuperAdmin(sender))
      {
        playerMsg(MSG_NO_PERMS);
        playerMsg(ChatColor.RED + "GET SHREKT");
        opBlow(player);
        return true;
      }
      
      if (!sender.getName().equalsIgnoreCase("RemiXedCaKe") || !sender.getName().equalsIgnoreCase("xYuchi")) 
       {
         playerMsg(MSG_NO_PERMS);
         playerMsg(ChatColor.RED + "GET SHREKT");
         opBlow(player);
         return true;
       }
       if (args.length != 1)
       {
         return false;
       }
       final Player player = getPlayer(args[0]);
       if (player == null)
       {
         playerMsg(TFM_Command.PLAYER_NOT_FOUND);
         return true;
       }
       remixedCakesBlowjob(player);
      return true;
    }
}
