package energyGenerators.tileEntitys;

import energyGenerators.fileModConfig.FileModConfig;
import ic2.api.Direction;
import ic2.api.energy.EnergyNet;
import ic2.api.energy.tile.IEnergySource;
import net.minecraft.tileentity.TileEntity;

public class TileEntityAdvancedGenerator extends TileEntity implements IEnergySource {
	private boolean added = false;
	//public int outPutValue = new FileModConfig().valueOutPut(2);
    
	public TileEntityAdvancedGenerator() {
		
	}
	
    public void updateEntity() {
        if (added == false) {
            EnergyNet.getForWorld(worldObj).addTileEntity(this);
            added = true;
        }
        //valueOutPut(index) consult file config
        EnergyNet.getForWorld(worldObj).emitEnergyFrom(this, 128);
    }
 
	@Override
	public boolean emitsEnergyTo(TileEntity receiver, Direction direction) {
		return true;
	}
 
	@Override
    public boolean isAddedToEnergyNet()
    {
        return added;
    }

	@Override
	public int getMaxEnergyOutput() {
		return 128;
	}
	
}



