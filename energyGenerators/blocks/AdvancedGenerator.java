package energyGenerators.blocks;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energyGenerators.main.MainMod;
import energyGenerators.tileEntitys.TileEntityAdvancedGenerator;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class AdvancedGenerator extends BlockContainer{
	
	private Icon AdvancedGenerator;
	private Icon AdvancedGeneratorTop;
	private Icon AdvancedGeneratorDown;
		
	public AdvancedGenerator(int id, Material material) {
		super(id, material);
		
		setCreativeTab(MainMod.EnergyGeneratorsTab);
		setStepSound(soundAnvilFootstep);
		setHardness(3.0f);
	}
	
	public Icon getIcon(int i, int j) {
		if (i == 0) {
			return AdvancedGeneratorDown;
		}
		
		if (i == 1) {
			return AdvancedGeneratorTop;
		}
		
		if (i == 2) {
			return AdvancedGenerator;
		}
		
		return AdvancedGenerator;
	}
	
	public Icon getBlockTexture(int i, int j) {
		if (i == 0) {
			return AdvancedGeneratorDown;
		}
		
		if (i == 1) {
			return AdvancedGeneratorTop;
		}
		
		if (i == 2) {
			return AdvancedGenerator;
		}
		
		return AdvancedGenerator;
	}
	
	public void registerIcons(IconRegister i) {
		AdvancedGeneratorTop = i.registerIcon("advanced_generator_top");
		AdvancedGeneratorDown = i.registerIcon("advanced_generator_down");
		AdvancedGenerator = i.registerIcon("advanced_generator");
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntityAdvancedGenerator();
		
	}
}
