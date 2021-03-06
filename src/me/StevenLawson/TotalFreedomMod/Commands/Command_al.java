package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "This shows all admins", aliases = "adminlist", usage = "/<command>")
public class Command_al extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        TFM_Util.playerMsg(sender_p, "======STAFF LIST======", ChatColor.GOLD);   
        TFM_Util.playerMsg(sender_p, "Founders", ChatColor.DARK_RED);
        TFM_Util.playerMsg(sender_p, "- §4§k!§cCakey_§4§k!", ChatColor.GRAY);
        TFM_Util.playerMsg(sender_p, "- §4§k!§cRemiXedFuzZion§4§k!", ChatColor.GRAY);
        TFM_Util.playerMsg(sender_p, "- Ascarix", ChatColor.GRAY);
        TFM_Util.playerMsg(sender_p, "Co-Founders", ChatColor.BLUE);
        TFM_Util.playerMsg(sender_p, "- NONE", ChatColor.GRAY);
        TFM_Util.playerMsg(sender_p, "Lead Developers", ChatColor.DARK_PURPLE);
        TFM_Util.playerMsg(sender_p, "- DUFC_Liam", ChatColor.DARK_RED);
        TFM_Util.playerMsg(sender_p, "Developers", ChatColor.DARK_PURPLE);
        TFM_Util.playerMsg(sender_p, "- NONE", ChatColor.GRAY);
        TFM_Util.playerMsg(sender_p, "Trial-Devs", ChatColor.DARK_PURPLE);
        TFM_Util.playerMsg(sender_p, "- Wild_", ChatColor.GRAY);
        TFM_Util.playerMsg(sender_p, "Admin Manager", ChatColor.RED);
        TFM_Util.playerMsg(sender_p, "- TotallyNotTash", ChatColor.GRAY);
        TFM_Util.playerMsg(sender_p, "Staff Manager", ChatColor.RED);
        TFM_Util.playerMsg(sender_p, "- NONE", ChatColor.GRAY);
        TFM_Util.playerMsg(sender_p, "System Admin", ChatColor.DARK_RED);
        TFM_Util.playerMsg(sender_p, "- NONE", ChatColor.GRAY);
        TFM_Util.playerMsg(sender_p, "Lead Specialists", ChatColor.GREEN);
        TFM_Util.playerMsg(sender_p, "- NONE", ChatColor.GRAY);
        TFM_Util.playerMsg(sender_p, "Specialists", ChatColor.GREEN);
        TFM_Util.playerMsg(sender_p, "- NONE", ChatColor.DARK_BLUE);
        TFM_Util.playerMsg(sender_p, "Lead Executives", ChatColor.GOLD);
        TFM_Util.playerMsg(sender_p, "- NONE", ChatColor.GRAY);
        TFM_Util.playerMsg(sender_p, "Executives", ChatColor.GOLD);
        TFM_Util.playerMsg(sender_p, "- NONE", ChatColor.DARK_BLUE);
        TFM_Util.playerMsg(sender_p, "Head Admin", ChatColor.YELLOW);
        TFM_Util.playerMsg(sender_p, "- Abbieeeeeee", ChatColor.GRAY);
        TFM_Util.playerMsg(sender_p, "Senior Admin", ChatColor.LIGHT_PURPLE);
        sender_p.sendMessage(ChatColor.GRAY + StringUtils.join(TFM_AdminList.getSeniorAdminNames(), ", "));
        TFM_Util.playerMsg(sender_p, "Telnet Admin", ChatColor.DARK_GREEN);
        sender_p.sendMessage(ChatColor.GRAY + StringUtils.join(TFM_AdminList.getTelnetAdminNames(), ", "));
        TFM_Util.playerMsg(sender_p, "Super Admin", ChatColor.AQUA);
        sender_p.sendMessage(ChatColor.GRAY + StringUtils.join(TFM_AdminList.getSuperAdminNames(), ", "));
        TFM_Util.playerMsg(sender_p, "======STAFF LIST======", ChatColor.GOLD); 
        TFM_Util.playerMsg(sender_p, "If you are not on here, please contact a developer!", ChatColor.RED);
        TFM_Util.playerMsg(sender_p, "Remember, developers should update this every week!", ChatColor.RED);
        
        return true;
    }
}
