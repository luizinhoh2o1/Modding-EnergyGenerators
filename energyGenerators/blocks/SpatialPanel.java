package energyGenerators.blocks;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energyGenerators.main.MainMod;
import energyGenerators.tileEntitys.TileEntitySpatialPanel;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class SpatialPanel extends BlockContainer{
	
	private Icon SpatitalPanel;
	private Icon SpatitalPanelTop;
	private Icon SpatitalPanelDown;
		
	public SpatialPanel(int id, Material material) {
		super(id, material);
		
		setCreativeTab(MainMod.EnergyGeneratorsTab);
		setStepSound(soundAnvilFootstep);
		setHardness(3.0f);
	}

	public Icon getIcon(int i, int j) {
		if (i == 0) {
			return SpatitalPanelDown;
		}
		
		if (i == 1) {
			return SpatitalPanelTop;
		}
		
		if (i == 2) {
			return SpatitalPanel;
		}
		
		return SpatitalPanel;
	}
	
	public Icon getBlockTexture(int i, int j) {
		if (i == 0) {
			return SpatitalPanelDown;
		}
		
		if (i == 1) {
			return SpatitalPanelTop;
		}
		
		if (i == 2) {
			return SpatitalPanel;
		}
		
		return SpatitalPanel;
	}
	
	public void registerIcons(IconRegister i) {
		SpatitalPanelTop = i.registerIcon("spatital_panel_top");
		SpatitalPanelDown = i.registerIcon("spatital_panel_down");
		SpatitalPanel = i.registerIcon("spatital_panel");
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntitySpatialPanel();
		
	}

}
