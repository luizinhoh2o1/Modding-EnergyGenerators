package energyGenerators.tileEntitys;

import ic2.api.Direction;
import ic2.api.energy.EnergyNet;
import ic2.api.energy.tile.IEnergySource;
import net.minecraft.tileentity.TileEntity;

public class TileEntityAdvancedGenerator extends TileEntity implements IEnergySource {
  private boolean added = false;
  
  public void updateEntity() {
    if (!this.added) {
      EnergyNet.getForWorld(this.worldObj).addTileEntity(this);
      this.added = true;
    } 
    EnergyNet.getForWorld(this.worldObj).emitEnergyFrom(this, 128);
  }
  
  public boolean emitsEnergyTo(TileEntity receiver, Direction direction) {
    return true;
  }
  
  public boolean isAddedToEnergyNet() {
    return this.added;
  }
  
  public int getMaxEnergyOutput() {
    return 128;
  }
}
