package alisw.alismod;

import alisw.alismod.blocks.AlisBlocks;
import alisw.alismod.items.AlisItems;
import alisw.alismod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(useMetadata=true,modid = AlisMod.MODID, version = AlisMod.VERSION)
public class AlisMod {
	
    public static final String MODID = "teamod";
    public static final String VERSION = "1.0";
    
    @SidedProxy(serverSide = "alisw.alismod.proxy.CommonProxy", clientSide = "alisw.alismod.proxy.ClientProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {	
    	AlisItems.init();
    	AlisBlocks.init();
    	Recipes.init();
    }
    
    
}
