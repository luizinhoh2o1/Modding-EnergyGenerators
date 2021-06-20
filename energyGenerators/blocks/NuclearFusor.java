package energyGenerators.blocks;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energyGenerators.main.MainMod;
import energyGenerators.tileEntitys.TileEntityNuclearFusor;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class NuclearFusor extends BlockContainer{
	
	private Icon NuclearFusor;
	private Icon NuclearFusorTop;
	private Icon NuclearFusorDown;
		
	public NuclearFusor(int id, Material material) {
		super(id, material);
		
		setCreativeTab(MainMod.EnergyGeneratorsTab);
		setStepSound(soundAnvilFootstep);
		setLightValue(1.0f);
		setHardness(3.0f);
	}
	
	public Icon getIcon(int i, int j) {
		if (i == 0) {
			return NuclearFusorDown;
		}
		
		if (i == 1) {
			return NuclearFusorTop;
		}
		
		if (i == 2) {
			return NuclearFusor;
		}
		
		return NuclearFusor;
	}
	
	public Icon getBlockTexture(int i, int j) {
		if (i == 0) {
			return NuclearFusorDown;
		}
		
		if (i == 1) {
			return NuclearFusorTop;
		}
		
		if (i == 2) {
			return NuclearFusor;
		}
		
		return NuclearFusor;
	}
	
	public void registerIcons(IconRegister i) {
		NuclearFusorTop = i.registerIcon("nuclear_fusor_top");
		NuclearFusorDown = i.registerIcon("nuclear_fusor_down");
		NuclearFusor = i.registerIcon("nuclear_fusor");
	}
	
	@Override
	public TileEntity createNewTileEntity(World world) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntityNuclearFusor();
		
	}
}
