package energyGenerators.blocks.generators;

import energyGenerators.tileEntitys.TileEntityBasicGenerator;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BasicGenerator extends BlockContainer {
  private Icon BasicGenerator;
  
  private Icon BasicGeneratorTop;
  
  private Icon BasicGeneratorDown;
  
  public BasicGenerator(int id, Material material) {
    super(id, material);
    setStepSound(soundAnvilFootstep);
  }
  
  public Icon getIcon(int i, int j) {
    if (i == 0)
      return this.BasicGeneratorDown; 
    if (i == 1)
      return this.BasicGeneratorTop; 
    if (i == 2)
      return this.BasicGenerator; 
    return this.BasicGenerator;
  }
  
  public Icon getBlockTexture(int i, int j) {
    if (i == 0)
      return this.BasicGeneratorDown; 
    if (i == 1)
      return this.BasicGeneratorTop; 
    if (i == 2)
      return this.BasicGenerator; 
    return this.BasicGenerator;
  }
  
  public void registerIcons(IconRegister i) {
    this.BasicGeneratorTop = i.registerIcon("basic_generator_top");
    this.BasicGeneratorDown = i.registerIcon("basic_generator_down");
    this.BasicGenerator = i.registerIcon("basic_generator");
  }
  
  public TileEntity createNewTileEntity(World world) {
    return null;
  }
  
  public TileEntity createTileEntity(World world, int meta) {
    return (TileEntity)new TileEntityBasicGenerator();
  }
}
