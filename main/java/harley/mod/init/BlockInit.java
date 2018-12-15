package harley.mod.init;

import java.util.ArrayList;
import java.util.List;

import harley.mod.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_SILVER = new BlockBase("block_silver", Material.IRON);
}
