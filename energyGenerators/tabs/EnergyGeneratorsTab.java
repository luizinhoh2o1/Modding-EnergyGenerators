package energyGenerators.tabs;

import cpw.mods.fml.common.registry.LanguageRegistry;
import energyGenerators.properties.BlocksProperties;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EnergyGeneratorsTab extends CreativeTabs{

	public EnergyGeneratorsTab(String label) {
		super(label);
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.EnergyGeneratorsTab", "Energy Generators");
		LanguageRegistry.instance().addStringLocalization("itemGroup.EnergyGeneratorsTab", "pt_BR", "Geradores de Energia");
		
	}
	
	public int getTabIconItemIndex() {
		return BlocksProperties.NuclearFusor.blockID;
	}
}
