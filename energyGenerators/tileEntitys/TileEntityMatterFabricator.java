package energyGenerators.tileEntitys;


import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import ic2.api.Direction;
import ic2.api.energy.event.EnergyTileLoadEvent;
import ic2.api.energy.event.EnergyTileUnloadEvent;
import ic2.api.energy.tile.IEnergySink;
import ic2.api.item.Items;

public class TileEntityMatterFabricator extends TileEntity implements IEnergySink{
	private int energy = 0;
	private int maxEnergy = 10000000;
	private int qtdMatter = 0; 
	private boolean initialized;
	
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		super.readFromNBT(nbttagcompound);
		if (nbttagcompound.hasKey("energy")) {
			this.energy = nbttagcompound.getInteger("energy");
		}
	}
	
	public void writeToNBT(NBTTagCompound nbttagcompound) {
		super.writeToNBT(nbttagcompound);
		
		nbttagcompound.setInteger("energy", this.energy);
	}
	
	@Override
	public void updateEntity() {
		if (!initialized && worldObj != null) {
			if (!worldObj.isRemote) {
				EnergyTileLoadEvent loadEvent = new EnergyTileLoadEvent(this);
				MinecraftForge.EVENT_BUS.post(loadEvent);
			}
			initialized = true;
		}
	}

	@Override
	public void invalidate() {
		EnergyTileUnloadEvent unloadEvent = new EnergyTileUnloadEvent(this);
		MinecraftForge.EVENT_BUS.post(unloadEvent);
	}

	@Override
	public boolean acceptsEnergyFrom(TileEntity emitter, Direction direction) {
		return true;
	}

	@Override
	public boolean isAddedToEnergyNet() {
		return true;
	}

	@Override
	public int demandsEnergy() {
		return this.maxEnergy - this.energy;
	}

	@Override
	public int injectEnergy(Direction directionFrom, int amount) {
		if (this.energy >= this.maxEnergy) return amount;
		
		int openEnergy = this.maxEnergy - this.energy;
		generateMatter();
		if (openEnergy >= amount) {
			this.energy += amount;
			return 0;
		} else if (amount > openEnergy) {
			this.energy = this.maxEnergy;
			return amount - openEnergy;
		}
		return 0;
	}

	@Override
	public int getMaxSafeInput() {
		return 16384;
	}
	
	public void generateMatter() {
		if (energy >= 50000) {
			if (qtdMatter < 1728) {
				this.energy -= 50000;
				this.qtdMatter += 1;
			}
		}
	}
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getMaxEnergy() {
		return maxEnergy;
	}

	public void setMaxEnergy(int maxEnergy) {
		this.maxEnergy = maxEnergy;
	}

	public int getQtdMatter() {
		return qtdMatter;
	}

	public void setQtdMatter(int qtdMatter) {
		this.qtdMatter = qtdMatter;
	}
}
