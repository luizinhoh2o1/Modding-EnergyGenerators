package energyGenerators.electricItems;

import energyGenerators.main.MainMod;
import ic2.api.item.ElectricItem;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ElectronicFood extends ElectricItemBase {
	
  public ElectronicFood(int id) {
    super(id);
    this.maxCharge = 40000;
    this.transferLimit = 200;
    this.tier = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
	  if (player.getFoodStats().getFoodLevel() < 20) {
		  
		  if (ElectricItem.manager.use(itemStack, 2000, player)) {
    		player.getFoodStats().addStats(6, 7.2F);
    	}
		  
    }
	  
	return itemStack;
  }
}
