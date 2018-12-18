package harley.mod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OreSilver extends BlockBase{

	public OreSilver(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(2.5F);
		setResistance(15F);
		setHarvestLevel("pickaxe", 1);
	}
	
}
