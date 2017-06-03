package fingersome.enchantedmod;

import fingersome.enchantedmod.block.BlockList;
import fingersome.enchantedmod.config.ConfigManager;
import fingersome.enchantedmod.event.EventManager;
import fingersome.enchantedmod.item.ItemList;
import fingersome.enchantedmod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = ModInfo.MODID, version = ModInfo.VERSION)
public class EnchantedMod
{
    @SidedProxy(clientSide = "fingersome.enchantedmod.proxy.ClientProxy",
    			serverSide = "fingersome.enchantedmod.proxy.ServerProxy")

	public static CommonProxy proxy;
	public static ItemList items;
	public static BlockList	blocks;

	@Instance(ModInfo.MODID)
	public static EnchantedMod instance;

	public static CreativeTabs tab = new CreativeTabs("enchantedmod") {
    	@Override
    	public String getTabLabel() {
    		return "enchantedmod";
    	}
    	
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemList.itemTome,1);
		}
	};
	
	 @EventHandler
	 public void preinit(FMLPreInitializationEvent event) 
	 {    
	     // DEBUG
	     System.out.println("preInit()" + event.getModMetadata().name);
			MinecraftForge.EVENT_BUS.register(new ConfigManager());
			MinecraftForge.EVENT_BUS.register(new EventManager());
		
	    ConfigManager.init(event.getSuggestedConfigurationFile());
	   
	 	items.init();
	 	blocks.init();
		proxy.preInit(event);
	     
	 }
	 

	@EventHandler
	 public void init(FMLInitializationEvent event) 
	 {
	     // DEBUG
	     System.out.println("init()");
	
	 	proxy.init(event);
	  
	 }
	
	 @EventHandler
	 public void postinit(FMLPostInitializationEvent event)
	 {
	     // DEBUG
	     System.out.println("postInit()");
	       
	
	 	proxy.postInit(event);
	 }
 
	 @EventHandler
	 public void serverLoad(FMLServerStartingEvent event)
	 {
		 
	 }
		
}
