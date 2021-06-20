package energyGenerators.blocks;

import java.util.List;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energyGenerators.main.MainMod;
import energyGenerators.tileEntitys.TileEntityBasicGenerator;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BasicGenerator extends BlockContainer{
	
	private Icon BasicGenerator;
	private Icon BasicGeneratorTop;
	private Icon BasicGeneratorDown;
		
	public BasicGenerator(int id, Material material) {
		super(id, material);
		
		setCreativeTab(MainMod.EnergyGeneratorsTab);
		setStepSound(soundAnvilFootstep);
		setHardness(3.0f);
	}
	
	public Icon getIcon(int i, int j) {
		if (i == 0) {
			return BasicGeneratorDown;
		}
		
		if (i == 1) {
			return BasicGeneratorTop;
		}
		
		if (i == 2) {
			return BasicGenerator;
		}
		
		return BasicGenerator;
	}
	
	public Icon getBlockTexture(int i, int j) {
		if (i == 0) {
			return BasicGeneratorDown;
		}
		
		if (i == 1) {
			return BasicGeneratorTop;
		}
		
		if (i == 2) {
			return BasicGenerator;
		}
		
		return BasicGenerator;
	}
	
	public void registerIcons(IconRegister i) {
		BasicGeneratorTop = i.registerIcon("basic_generator_top");
		BasicGeneratorDown = i.registerIcon("basic_generator_down");
		BasicGenerator = i.registerIcon("basic_generator");
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntityBasicGenerator();
		
	}
}
