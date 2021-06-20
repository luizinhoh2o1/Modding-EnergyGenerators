package energyGenerators.tileEntitys;

import java.util.concurrent.TimeUnit;

import energyGenerators.fileModConfig.FileModConfig;


import ic2.api.Direction;
import ic2.api.energy.EnergyNet;
import ic2.api.energy.tile.IEnergySink;
import ic2.api.energy.tile.IEnergySource;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityNuclearFusor extends TileEntity implements IEnergySource {
	private boolean added = false;
	private int outPutValue = new FileModConfig().valueOutPut(0);
	
	public TileEntityNuclearFusor() {
		
	}
	
    public void updateEntity() {
        if (added == false) {
            EnergyNet.getForWorld(worldObj).addTileEntity(this);
            added = true;
        }
        //valueOutPut(index) consult file config
        EnergyNet.getForWorld(worldObj).emitEnergyFrom(this, outPutValue);
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
		return 512;
	}
}



