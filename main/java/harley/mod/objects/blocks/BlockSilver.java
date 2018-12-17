package harley.mod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSilver extends BlockBase{

	public BlockSilver(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.5f);
		setResistance(30);
		setHarvestLevel("pickaxe", 1);
	}
	
}
