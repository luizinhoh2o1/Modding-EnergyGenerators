package energyGenerators.blocks;

import static net.minecraftforge.common.ForgeDirection.DOWN;

import java.util.concurrent.TimeUnit;

import cpw.mods.fml.common.registry.LanguageRegistry;
import energyGenerators.tileEntitys.TileEntityMatterFabricator;

import ic2.api.item.Items;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class MatterFabricator extends BlockContainer{
	
	private Icon MatterFabricator;
	private Icon MatterFabricatorTop;
	private Icon MatterFabricatorDown;
	
	public MatterFabricator(int id, Material material) {
		super(id, material);
		
		setStepSound(soundAnvilFootstep);
		setHardness(3.0f);
		LanguageRegistry.addName(this, "Matter Fabricator");
		//LanguageRegistry.instance().addNameForObject(this, "pt_BR", "Fabricador de UU-Materia");
	}
	
	public Icon getIcon(int i, int j) {
		if (i == 0) {
			return MatterFabricatorDown;
		}
		
		if (i == 1) {
			return MatterFabricatorTop;
		}
		
		if (i == 2) {
			return MatterFabricator;
		}
		
		return MatterFabricator;
	}
	
	public Icon getBlockTexture(int i, int j) {
		if (i == 0) {
			return MatterFabricatorDown;
		}
		
		if (i == 1) {
			return MatterFabricatorTop;
		}
		
		if (i == 2) {
			return MatterFabricator;
		}
		
		return MatterFabricator;
	}
	
	public void registerIcons(IconRegister i) {
		MatterFabricatorTop = i.registerIcon("matter_fabricator_top");
		MatterFabricatorDown = i.registerIcon("matter_fabricator_down");
		MatterFabricator = i.registerIcon("matter_fabricator");
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float part7, float par8, float par9) {
		
		TileEntityMatterFabricator te = (TileEntityMatterFabricator) world.getBlockTileEntity(x,y,z);
        if (world.isRemote) {
            return true;
        } else {
        	
        	if (te != null) {
        		if (player.isSneaking()) {
        			player.addChatMessage("Energia atual: " + te.getEnergy());
        			player.addChatMessage("Matter atual: " + te.getQtdMatter());
        		} else {
                	if (te.getQtdMatter() > 0) {
                		player.dropItem(Items.getItem("matter").itemID, te.getQtdMatter());
                		te.setQtdMatter(0);
                		try {
        					TimeUnit.SECONDS.sleep(1);
        				} catch (InterruptedException e) {
        					e.printStackTrace();
        				}
                	}
        		}
    		}

             return true;
        }
	}
	
	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntityMatterFabricator();
	}
}