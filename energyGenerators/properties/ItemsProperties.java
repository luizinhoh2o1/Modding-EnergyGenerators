package energyGenerators.properties;

import cpw.mods.fml.common.registry.LanguageRegistry;
import energyGenerators.electricItems.ElectronicFood;
import energyGenerators.main.MainMod;
import net.minecraft.item.Item;

public class ItemsProperties {
	
  public static Item FluoriteDust;
  public static Item FluoriteCrystal;
  public static Item CircuitEGWithoutCrystal;
  public static Item CircuitEGWithCrystal;
  public static Item CircuitEGAssembled;
  public static Item MixedFoods;
  public static Item ConcentratedFoodEssence;
  public static Item EletronicFood;
  
  public static void initItems() {
	  
    FluoriteDust = (new Item(2750))
    	.setUnlocalizedName("florite_dust")
    	.setCreativeTab(MainMod.EnergyGeneratorsTab);
    
    FluoriteCrystal = (new Item(2751))
    	.setUnlocalizedName("fluorite_crystal")
    	.setCreativeTab(MainMod.EnergyGeneratorsTab);
    
    CircuitEGWithoutCrystal = (new Item(2753))
    	.setUnlocalizedName("circuit_eg_without_crystal")
    	.setCreativeTab(MainMod.EnergyGeneratorsTab);
    
    CircuitEGWithCrystal = (new Item(2754))
    	.setUnlocalizedName("circuit_eg_with_crystal")
    	.setCreativeTab(MainMod.EnergyGeneratorsTab);
    
    CircuitEGAssembled = (new Item(2755))
    	.setUnlocalizedName("circuit_eg_assembled")
    	.setCreativeTab(MainMod.EnergyGeneratorsTab);
    
    MixedFoods = (new Item(2756))
		.setUnlocalizedName("mixed_foods")
		.setCreativeTab(MainMod.EnergyGeneratorsTab);
    
    ConcentratedFoodEssence = (new Item(2757))
    		.setUnlocalizedName("concentrated_essence_food")
    		.setCreativeTab(MainMod.EnergyGeneratorsTab);
    
    EletronicFood = (new ElectronicFood(2758))
    	.setUnlocalizedName("electronic_food")
    	.setCreativeTab(MainMod.EnergyGeneratorsTab);
  }
  
  public static void LanguageItems() {
    LanguageRegistry.instance().addNameForObject(CircuitEGWithoutCrystal, "en_US", "Circuit EG (without crystal)");
    LanguageRegistry.instance().addNameForObject(CircuitEGWithCrystal, "en_US", "Circuit EG (with crystal)");
    LanguageRegistry.instance().addNameForObject(CircuitEGAssembled, "en_US", "Circuit EG Assembled");
    LanguageRegistry.instance().addNameForObject(FluoriteDust, "en_US", "Fluorite Dust");
    LanguageRegistry.instance().addNameForObject(FluoriteCrystal, "en_US", "Fluorite crystal");
    LanguageRegistry.instance().addNameForObject(MixedFoods, "en_US", "Mixed Foods");
    LanguageRegistry.instance().addNameForObject(ConcentratedFoodEssence, "en_US", "Concentrated Food Essence");
    LanguageRegistry.instance().addNameForObject(EletronicFood, "en_US", "Electronic Food");
    
    LanguageRegistry.instance().addNameForObject(CircuitEGWithoutCrystal, "pt_BR", "Circuito EG (sem cristal)");
    LanguageRegistry.instance().addNameForObject(CircuitEGWithCrystal, "pt_BR", "Circuito EG (com cristal)");
    LanguageRegistry.instance().addNameForObject(CircuitEGAssembled, "pt_BR", "Circuito EG Montado");
    LanguageRegistry.instance().addNameForObject(FluoriteDust, "pt_BR", "Po de fluorita");
    LanguageRegistry.instance().addNameForObject(FluoriteCrystal, "pt_BR", "Cristal de fluorita");
    LanguageRegistry.instance().addNameForObject(MixedFoods, "pt_BR", "Mix de Alimentos");
    LanguageRegistry.instance().addNameForObject(ConcentratedFoodEssence, "pt_BR", "Essencia de Comida Concentrada");
    LanguageRegistry.instance().addNameForObject(EletronicFood, "pt_BR", "Comida Eletronica");
    
    LanguageRegistry.instance().addNameForObject(CircuitEGWithoutCrystal, "pt_PT", "Circuito EG (sem cristal)");
    LanguageRegistry.instance().addNameForObject(CircuitEGWithCrystal, "pt_PT", "Circuito EG (com cristal)");
    LanguageRegistry.instance().addNameForObject(CircuitEGAssembled, "pt_PT", "Circuito EG Montado");
    LanguageRegistry.instance().addNameForObject(FluoriteDust, "pt_PT", "Po de fluorita");
    LanguageRegistry.instance().addNameForObject(FluoriteCrystal, "pt_PT", "Cristal de fluorita");
    LanguageRegistry.instance().addNameForObject(MixedFoods, "pt_PT", "Mix de Alimentos");
    LanguageRegistry.instance().addNameForObject(ConcentratedFoodEssence, "pt_PT", "Essencia de Comida Concentrada");
    LanguageRegistry.instance().addNameForObject(EletronicFood, "pt_PT", "Comida Eletronica");
  }
}
