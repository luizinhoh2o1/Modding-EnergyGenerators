package energyGenerators.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class FluoriteOre extends Block {
  private Icon FluoriteOre;
  
  private Icon FluoriteOreTop;
  
  private Icon FluoriteOreDown;
  
  public FluoriteOre(int id, Material material) {
    super(id, material);
    setStepSound(soundStoneFootstep);
  }
  
  public Icon getIcon(int i, int j) {
    if (i == 0)
      return this.FluoriteOreDown; 
    if (i == 1)
      return this.FluoriteOreTop; 
    if (i == 2)
      return this.FluoriteOre; 
    return this.FluoriteOre;
  }
  
  public Icon getBlockTexture(int i, int j) {
    if (i == 0)
      return this.FluoriteOreDown; 
    if (i == 1)
      return this.FluoriteOreTop; 
    if (i == 2)
      return this.FluoriteOre; 
    return this.FluoriteOre;
  }
  
  public void registerIcons(IconRegister i) {
    this.FluoriteOreTop = i.registerIcon("fluorite_ore_top");
    this.FluoriteOreDown = i.registerIcon("fluorite_ore_down");
    this.FluoriteOre = i.registerIcon("fluorite_ore");
  }
}
