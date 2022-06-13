package energyGenerators.blocks.generators;

import energyGenerators.tileEntitys.TileEntityAdvancedGenerator;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class AdvancedGenerator extends BlockContainer {
  private Icon AdvancedGenerator;
  
  private Icon AdvancedGeneratorTop;
  
  private Icon AdvancedGeneratorDown;
  
  public AdvancedGenerator(int id, Material material) {
    super(id, material);
    setStepSound(soundAnvilFootstep);
  }
  
  public Icon getIcon(int i, int j) {
    if (i == 0)
      return this.AdvancedGeneratorDown; 
    if (i == 1)
      return this.AdvancedGeneratorTop; 
    if (i == 2)
      return this.AdvancedGenerator; 
    return this.AdvancedGenerator;
  }
  
  public Icon getBlockTexture(int i, int j) {
    if (i == 0)
      return this.AdvancedGeneratorDown; 
    if (i == 1)
      return this.AdvancedGeneratorTop; 
    if (i == 2)
      return this.AdvancedGenerator; 
    return this.AdvancedGenerator;
  }
  
  public void registerIcons(IconRegister i) {
    this.AdvancedGeneratorTop = i.registerIcon("advanced_generator_top");
    this.AdvancedGeneratorDown = i.registerIcon("advanced_generator_down");
    this.AdvancedGenerator = i.registerIcon("advanced_generator");
  }
  
  public TileEntity createNewTileEntity(World world) {
    return null;
  }
  
  public TileEntity createTileEntity(World world, int meta) {
    return (TileEntity)new TileEntityAdvancedGenerator();
  }
}
