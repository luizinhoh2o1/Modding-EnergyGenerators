package energyGenerators.worldGen;

import cpw.mods.fml.common.IWorldGenerator;
import energyGenerators.properties.BlocksProperties;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenerator implements IWorldGenerator {
  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
    switch (world.provider.dimensionId) {
      case 0:
        generateSurface(world, random, chunkX * 16, chunkZ * 16);
        break;
    } 
  }
  
  public void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
    for (int a = 0; a < 64; a++) {
      int x = chunkX + rand.nextInt(16);
      int y = rand.nextInt(40);
      int z = chunkZ + rand.nextInt(16);
      (new WorldGenMinable(BlocksProperties.FluoriteOre.blockID, 3)).generate(world, rand, x, y, z);
    } 
  }
}
