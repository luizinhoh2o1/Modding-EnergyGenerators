package energyGenerators.properties;

import cpw.mods.fml.common.registry.GameRegistry;
import ic2.api.item.Items;
import ic2.api.recipe.Recipes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesProperties {
  public static void initRecipies() {
    ItemStack advancedCircuit = Items.getItem("advancedCircuit");
    ItemStack carbonPlate = Items.getItem("carbonPlate");
    ItemStack reBattery = Items.getItem("reBattery");
    
    GameRegistry.addRecipe(new ItemStack(ItemsProperties.CircuitEGWithCrystal, 1), new Object[] { " y ", " x ", "   ", Character.valueOf('x'), ItemsProperties.CircuitEGWithoutCrystal, Character.valueOf('y'), ItemsProperties.FluoriteCrystal });
    GameRegistry.addRecipe(new ItemStack(ItemsProperties.EletronicFood, 1, 40), new Object[] {
    	"axa",
    	"aya",
    	"aza",
    	Character.valueOf('a'), Items.getItem("advancedAlloy"),
    	Character.valueOf('x'), Items.getItem("electrolyzedWaterCell"),
    	Character.valueOf('y'), ItemsProperties.ConcentratedFoodEssence,
    	Character.valueOf('z'), ItemsProperties.CircuitEGAssembled });
    
    GameRegistry.addShapelessRecipe(new ItemStack(ItemsProperties.MixedFoods, 1), new Object[] {
    	Item.appleRed,
    	Item.bread,
    	Item.porkRaw,
    	Item.fishRaw,
    	Item.melon,
    	Item.beefRaw,
    	Item.chickenRaw,
    	Item.carrot,
    	Item.potato});
    GameRegistry.addShapelessRecipe(new ItemStack(ItemsProperties.CircuitEGWithCrystal), new Object[] { ItemsProperties.CircuitEGWithoutCrystal, ItemsProperties.FluoriteCrystal });
    
    Recipes.macerator.addRecipe(new ItemStack(BlocksProperties.FluoriteOre), new ItemStack(ItemsProperties.FluoriteDust));
    
    Recipes.extractor.addRecipe(new ItemStack(ItemsProperties.MixedFoods), new ItemStack(ItemsProperties.ConcentratedFoodEssence));
    
    Recipes.compressor.addRecipe(new ItemStack(ItemsProperties.FluoriteDust), new ItemStack(ItemsProperties.FluoriteCrystal));
    Recipes.compressor.addRecipe(advancedCircuit, new ItemStack(ItemsProperties.CircuitEGWithoutCrystal));
    Recipes.compressor.addRecipe(new ItemStack(ItemsProperties.CircuitEGWithCrystal), new ItemStack(ItemsProperties.CircuitEGAssembled));
  }
}
