package energyGenerators.blocks.generators;

import energyGenerators.tileEntitys.TileEntityNuclearFusor;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class NuclearFusor extends BlockContainer {
  private Icon NuclearFusor;
  
  private Icon NuclearFusorTop;
  
  private Icon NuclearFusorDown;
  
  public NuclearFusor(int id, Material material) {
    super(id, material);
    setStepSound(soundAnvilFootstep);
    setLightValue(1.0F);
  }
  
  public Icon getIcon(int i, int j) {
    if (i == 0)
      return this.NuclearFusorDown; 
    if (i == 1)
      return this.NuclearFusorTop; 
    if (i == 2)
      return this.NuclearFusor; 
    return this.NuclearFusor;
  }
  
  public Icon getBlockTexture(int i, int j) {
    if (i == 0)
      return this.NuclearFusorDown; 
    if (i == 1)
      return this.NuclearFusorTop; 
    if (i == 2)
      return this.NuclearFusor; 
    return this.NuclearFusor;
  }
  
  public void registerIcons(IconRegister i) {
    this.NuclearFusorTop = i.registerIcon("nuclear_fusor_top");
    this.NuclearFusorDown = i.registerIcon("nuclear_fusor_down");
    this.NuclearFusor = i.registerIcon("nuclear_fusor");
  }
  
  public TileEntity createNewTileEntity(World world) {
    return null;
  }
  
  public TileEntity createTileEntity(World world, int meta) {
    return (TileEntity)new TileEntityNuclearFusor();
  }
}
