package fingersome.enchantedmod.item;

import fingersome.enchantedmod.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemList 
{
	
	//DECLARE ITEMS

	public static Item itemTome;
	

	    public static void init() {

	        itemTome		= new ItemTome			(ItemInfo.ITEM_TOME_UNLOCALIZED);
	        
	        registerItems();
	    }

	    public static void registerItems() {

	        GameRegistry.register(itemTome, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_TOME_UNLOCALIZED));
	    }
	    
	    public static void registerRenders() {      

	    	ItemTome.registerRender			(itemTome);
	    	
	    }

	  
		
}
	    
	   

