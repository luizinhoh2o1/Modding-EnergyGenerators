package energyGenerators.properties;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import energyGenerators.blocks.AdvancedGenerator;
import energyGenerators.blocks.BasicGenerator;
import energyGenerators.blocks.NuclearFusor;
import energyGenerators.blocks.SpatialPanel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlocksProperties {
	
	public static Block BasicGenerator;
	public static Block AdvancedGenerator;
	public static Block NuclearFusor;
	public static Block SpatialPanel;
	
	public static Block Testa;
	
	public static void init() {		
		//Basic Generator
		BasicGenerator = new BasicGenerator(2700, Material.rock).setUnlocalizedName("Basic_Generator");
		GameRegistry.registerBlock(BasicGenerator, "BasicGenerator");
		
		//Advanced Generator
		AdvancedGenerator = new AdvancedGenerator(2701, Material.rock).setUnlocalizedName("Advanced_Generator");
		GameRegistry.registerBlock(AdvancedGenerator, "AdvancedGenerator");
		
		//Spatial Panel
		SpatialPanel = new SpatialPanel(2702, Material.rock).setUnlocalizedName("Spatial_Panel");
		GameRegistry.registerBlock(SpatialPanel, "SpatialPanel");
		
		//Nuclear Fusor
		NuclearFusor = new NuclearFusor(2703, Material.rock).setUnlocalizedName("Nuclear_Fusor");
		GameRegistry.registerBlock(NuclearFusor, "NuclearFusor");
		
	}
	
	public static void Linguagem() {
		LanguageRegistry.instance().addNameForObject(BlocksProperties.BasicGenerator, "en_US", "Basic Generator");
		LanguageRegistry.instance().addNameForObject(BlocksProperties.AdvancedGenerator, "en_US", "Advanced Generator");
		LanguageRegistry.instance().addNameForObject(BlocksProperties.NuclearFusor, "en_US", "Nuclear Fusor");
		LanguageRegistry.instance().addNameForObject(BlocksProperties.SpatialPanel, "en_US", "Spatial Panel");
		
		LanguageRegistry.instance().addNameForObject(BlocksProperties.BasicGenerator, "pt_BR", "Gerador Basico");
		LanguageRegistry.instance().addNameForObject(BlocksProperties.AdvancedGenerator, "pt_BR", "Gerador Avancado");
		LanguageRegistry.instance().addNameForObject(BlocksProperties.NuclearFusor, "pt_BR", "Fusor Nuclear");
		LanguageRegistry.instance().addNameForObject(BlocksProperties.SpatialPanel, "pt_BR", "Painel Espacial");
		
		LanguageRegistry.instance().addNameForObject(BlocksProperties.Testa, "pt_BR", "Testa");
		
		LanguageRegistry.instance().addNameForObject(BlocksProperties.BasicGenerator, "pt_PT", "Gerador Basico");
		LanguageRegistry.instance().addNameForObject(BlocksProperties.AdvancedGenerator, "pt_PT", "Gerador Avancado");
		LanguageRegistry.instance().addNameForObject(BlocksProperties.NuclearFusor, "pt_PT", "Fusor Nuclear");
		LanguageRegistry.instance().addNameForObject(BlocksProperties.SpatialPanel, "pt_PT", "Painel Espacial");
	}
}
