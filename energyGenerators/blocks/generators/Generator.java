package energyGenerators.blocks.generators;

import energyGenerators.tileEntitys.TileEntityGenerator;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class Generator extends BlockContainer {
  private Icon Generator;
  
  private Icon GeneratorTop;
  
  private Icon GeneratorDown;
  
  public Generator(int id, Material material) {
    super(id, material);
    setStepSound(soundAnvilFootstep);
  }
  
  public Icon getIcon(int i, int j) {
    if (i == 0)
      return this.GeneratorDown; 
    if (i == 1)
      return this.GeneratorTop; 
    if (i == 2)
      return this.Generator; 
    return this.Generator;
  }
  
  public Icon getBlockTexture(int i, int j) {
    if (i == 0)
      return this.GeneratorDown; 
    if (i == 1)
      return this.GeneratorTop; 
    if (i == 2)
      return this.Generator; 
    return this.Generator;
  }
  
  public void registerIcons(IconRegister i) {
    this.GeneratorTop = i.registerIcon("generator_top");
    this.GeneratorDown = i.registerIcon("generator_down");
    this.Generator = i.registerIcon("generator");
  }
  
  public TileEntity createNewTileEntity(World world) {
    return null;
  }
  
  public TileEntity createTileEntity(World world, int meta) {
    return (TileEntity)new TileEntityGenerator();
  }
}
