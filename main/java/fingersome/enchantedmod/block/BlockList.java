package fingersome.enchantedmod.block;

import fingersome.enchantedmod.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockList 
{
	
	//DECLARE ITEMS

	public static Block blockDisenchanter;
	

	    public static void init() {

	        blockDisenchanter		= new BlockDisenchanter			(Material.ROCK, BlockInfo.BLOCK_DISENCHANTER_UNLOCALIZED, true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.0f);
	        
	        //registerBlocks();
	    }

	    public static void registerBlocks() {

	        GameRegistry.register(blockDisenchanter, 	new ResourceLocation(ModInfo.MODID, BlockInfo.BLOCK_DISENCHANTER_UNLOCALIZED));
	    }
	    

	  
		
}
	    
	   

