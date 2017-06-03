package fingersome.enchantedmod.proxy;

import fingersome.enchantedmod.network.PacketHandler;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{

	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Proxy PreInit");

		PacketHandler.registerMessages();
	}

	public void init(FMLInitializationEvent event) {
		
	}

	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
