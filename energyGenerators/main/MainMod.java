package energyGenerators.main;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import energyGenerators.common.CommonProxy;
import energyGenerators.fileModConfig.FileModConfig;
import energyGenerators.properties.BlocksProperties;
import energyGenerators.tabs.EnergyGeneratorsTab;
import energyGenerators.tileEntitys.TileEntityAdvancedGenerator;
import energyGenerators.tileEntitys.TileEntityBasicGenerator;
import energyGenerators.tileEntitys.TileEntityNuclearFusor;
import energyGenerators.tileEntitys.TileEntitySpatialPanel;

import ic2.api.item.Items;

@Mod(modid = MainMod.modid, name = MainMod.name, version = MainMod.version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MainMod {

	@Instance("Energy-Generators")
	public static MainMod instance;
	
	@SidedProxy(clientSide = "energyGenerators.common.ClientProxy", serverSide = "energyGenerators.common.CommonProxy")
	public static CommonProxy Proxy;
	
	public final static String modid = "Energy-Generators";
	public final static String name = "Energy Generators";
	public final static String version = "v2.1 by:Teddy_Zed";

	public final static FileModConfig saveFileConfig = new FileModConfig();

	public static CreativeTabs EnergyGeneratorsTab = new EnergyGeneratorsTab("EnergyGeneratorsTab");

	@Mod.PreInit
	public void PreInit(FMLPreInitializationEvent event) {
		saveFileConfig.saveFileConfig();
	}
	
	@Mod.Init
	public void Init(FMLInitializationEvent event) {
		BlocksProperties.init();
		BlocksProperties.Linguagem();
		GameRegistry.registerTileEntity(TileEntityBasicGenerator.class, "BasicGeneratorTileEntity");
		GameRegistry.registerTileEntity(TileEntityAdvancedGenerator.class, "AdvancedGeneratorTileEntity");
		GameRegistry.registerTileEntity(TileEntityNuclearFusor.class, "NuclearFusorTileEntity");
		GameRegistry.registerTileEntity(TileEntitySpatialPanel.class, "SpatialPanelTileEntity");
	}
	
	@Mod.PostInit
	public void PostInit(FMLPostInitializationEvent event) {
		
	}
}
