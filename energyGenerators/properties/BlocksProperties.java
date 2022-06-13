package energyGenerators.properties;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import energyGenerators.blocks.FluoriteOre;
import energyGenerators.blocks.generators.AdvancedGenerator;
import energyGenerators.blocks.generators.BasicGenerator;
import energyGenerators.blocks.generators.GamaGenerator;
import energyGenerators.blocks.generators.Generator;
import energyGenerators.blocks.generators.NuclearFusor;
import energyGenerators.main.MainMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlocksProperties {
  public static Block FluoriteOre;
  
  public static Block Generator;
  
  public static Block BasicGenerator;
  
  public static Block AdvancedGenerator;
  
  public static Block NuclearFusor;
  
  public static Block GamaGenerator;
  
  public static void initBlocks() {
    FluoriteOre = (new FluoriteOre(2710, Material.rock))
      .setUnlocalizedName("Fluorite_Ore")
      .setCreativeTab(MainMod.EnergyGeneratorsTab)
      .setHardness(3.0F);
    GameRegistry.registerBlock(FluoriteOre, "FluoriteOre");
    
    Generator = (new Generator(2699, Material.rock))
      .setUnlocalizedName("Generator")
      .setCreativeTab(MainMod.EnergyGeneratorsTab)
      .setHardness(3.0F);
    GameRegistry.registerBlock(Generator, "Generator");
    
    BasicGenerator = (new BasicGenerator(2700, Material.rock))
      .setUnlocalizedName("Basic_Generator")
      .setCreativeTab(MainMod.EnergyGeneratorsTab)
      .setHardness(3.0F);
    GameRegistry.registerBlock(BasicGenerator, "BasicGenerator");
    
    AdvancedGenerator = (new AdvancedGenerator(2701, Material.rock))
      .setUnlocalizedName("Advanced_Generator")
      .setCreativeTab(MainMod.EnergyGeneratorsTab)
      .setHardness(3.0F);
    GameRegistry.registerBlock(AdvancedGenerator, "AdvancedGenerator");
    
    GamaGenerator = (new GamaGenerator(2702, Material.rock))
      .setUnlocalizedName("Gama_Generator")
      .setCreativeTab(MainMod.EnergyGeneratorsTab)
      .setHardness(3.0F);
    GameRegistry.registerBlock(GamaGenerator, "GamaGenerator");
    
    NuclearFusor = (new NuclearFusor(2703, Material.rock))
      .setUnlocalizedName("Nuclear_Fusor")
      .setCreativeTab(MainMod.EnergyGeneratorsTab)
      .setHardness(3.0F);
    GameRegistry.registerBlock(NuclearFusor, "NuclearFusor");
  }
  
  public static void LanguageBlocks() {
    LanguageRegistry.instance().addNameForObject(Generator, "en_US", "Noob Generator");
    LanguageRegistry.instance().addNameForObject(BasicGenerator, "en_US", "Basic Generator");
    LanguageRegistry.instance().addNameForObject(AdvancedGenerator, "en_US", "Advanced Generator");
    LanguageRegistry.instance().addNameForObject(NuclearFusor, "en_US", "Nuclear Fusor");
    LanguageRegistry.instance().addNameForObject(GamaGenerator, "en_US", "Gama Generator");
    LanguageRegistry.instance().addNameForObject(FluoriteOre, "en_US", "Fluorite Ore");
    
    LanguageRegistry.instance().addNameForObject(Generator, "pt_BR", "Gerador Noob");
    LanguageRegistry.instance().addNameForObject(BasicGenerator, "pt_BR", "Gerador Basico");
    LanguageRegistry.instance().addNameForObject(AdvancedGenerator, "pt_BR", "Gerador Avancado");
    LanguageRegistry.instance().addNameForObject(NuclearFusor, "pt_BR", "Fusor Nuclear");
    LanguageRegistry.instance().addNameForObject(GamaGenerator, "pt_BR", "Gerador Gama");
    LanguageRegistry.instance().addNameForObject(FluoriteOre, "pt_BR", "Minerio de Fluorita");
    
    LanguageRegistry.instance().addNameForObject(Generator, "pt_PT", "Gerador Noob");
    LanguageRegistry.instance().addNameForObject(BasicGenerator, "pt_PT", "Gerador Basico");
    LanguageRegistry.instance().addNameForObject(AdvancedGenerator, "pt_PT", "Gerador Avancado");
    LanguageRegistry.instance().addNameForObject(NuclearFusor, "pt_PT", "Fusor Nuclear");
    LanguageRegistry.instance().addNameForObject(GamaGenerator, "pt_PT", "Gerador Gama");
    LanguageRegistry.instance().addNameForObject(FluoriteOre, "pt_PT", "Minerio de Fluorita");
  }
}
