package harley.mod;

import harley.mod.init.RecipesInit;
import harley.mod.proxy.CommonProxy;
import harley.mod.util.Reference;
import harley.mod.world.ModWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RecipesInit.init();
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
