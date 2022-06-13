package energyGenerators.blocks.generators;

import energyGenerators.tileEntitys.TileEntityGamaGenerator;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class GamaGenerator extends BlockContainer {
  private Icon GamaGenerator;
  
  private Icon GamaGeneratorTop;
  
  private Icon GamaGeneratorDown;
  
  public GamaGenerator(int id, Material material) {
    super(id, material);
    setStepSound(soundAnvilFootstep);
  }
  
  public Icon getIcon(int i, int j) {
    if (i == 0)
      return this.GamaGeneratorDown; 
    if (i == 1)
      return this.GamaGeneratorTop; 
    if (i == 2)
      return this.GamaGenerator; 
    return this.GamaGenerator;
  }
  
  public Icon getBlockTexture(int i, int j) {
    if (i == 0)
      return this.GamaGeneratorDown; 
    if (i == 1)
      return this.GamaGeneratorTop; 
    if (i == 2)
      return this.GamaGenerator; 
    return this.GamaGenerator;
  }
  
  public void registerIcons(IconRegister i) {
    this.GamaGeneratorTop = i.registerIcon("gama_generator_top");
    this.GamaGeneratorDown = i.registerIcon("gama_generator_down");
    this.GamaGenerator = i.registerIcon("gama_generator");
  }
  
  public TileEntity createNewTileEntity(World world) {
    return null;
  }
  
  public TileEntity createTileEntity(World world, int meta) {
    return (TileEntity)new TileEntityGamaGenerator();
  }
}
