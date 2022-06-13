package energyGenerators.main;

import cpw.mods.fml.common.IWorldGenerator;
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
import energyGenerators.common.CommonProxy;
import energyGenerators.properties.BlocksProperties;
import energyGenerators.properties.ItemsProperties;
import energyGenerators.properties.RecipesProperties;
import energyGenerators.tabs.EnergyGeneratorsTab;
import energyGenerators.tileEntitys.TileEntityAdvancedGenerator;
import energyGenerators.tileEntitys.TileEntityBasicGenerator;
import energyGenerators.tileEntitys.TileEntityGamaGenerator;
import energyGenerators.tileEntitys.TileEntityGenerator;
import energyGenerators.tileEntitys.TileEntityNuclearFusor;
import energyGenerators.worldGen.WorldGenerator;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = "Energy-Generators", name = "Energy Generators", version = "v3.3 by:Teddy_Zed")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MainMod {
  @Instance("Energy-Generators")
  public static MainMod instance;
  
  @SidedProxy(clientSide = "energyGenerators.common.ClientProxy", serverSide = "energyGenerators.common.CommonProxy")
  public static CommonProxy Proxy;
  
  public static final String modid = "Energy-Generators";
  
  public static final String name = "Energy Generators";
  
  public static final String version = "v3.3 by:Teddy_Zed";
  
  public static CreativeTabs EnergyGeneratorsTab = (CreativeTabs)new EnergyGeneratorsTab("EnergyGeneratorsTab");
  
  @PreInit
  public void PreInit(FMLPreInitializationEvent event) {}
  
  @Init
  public void Init(FMLInitializationEvent event) {
    BlocksProperties.initBlocks();
    BlocksProperties.LanguageBlocks();
    
    ItemsProperties.initItems();
    ItemsProperties.LanguageItems();
    
    RecipesProperties.initRecipies();
    
    GameRegistry.registerWorldGenerator((IWorldGenerator)new WorldGenerator());
    GameRegistry.registerTileEntity(TileEntityGenerator.class, "GeneratorTileEntity");
    GameRegistry.registerTileEntity(TileEntityBasicGenerator.class, "BasicGeneratorTileEntity");
    GameRegistry.registerTileEntity(TileEntityAdvancedGenerator.class, "AdvancedGeneratorTileEntity");
    GameRegistry.registerTileEntity(TileEntityNuclearFusor.class, "NuclearFusorTileEntity");
    GameRegistry.registerTileEntity(TileEntityGamaGenerator.class, "SpatialPanelTileEntity");
  }
  
  @PostInit
  public void PostInit(FMLPostInitializationEvent event) {}
}
