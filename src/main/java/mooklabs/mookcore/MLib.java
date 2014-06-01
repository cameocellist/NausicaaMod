package mooklabs.mookcore;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.util.FakePlayerFactory;


public class MLib {

	public MLib() {
		//nuffin ;(
	}
	public static FakePlayer getFakePlayer(World w){
		return FakePlayerFactory.getMinecraft((WorldServer)w);
	}

	public static void printToPlayer(String str) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(str));
	}

	public static void printToPlayer(EntityPlayer player, String str) {
		player.addChatMessage(new ChatComponentText(str));
	}

}
