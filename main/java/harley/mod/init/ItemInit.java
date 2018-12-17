package harley.mod.init;

import java.util.ArrayList;
import java.util.List;

import harley.mod.objects.items.ItemBase;
import harley.mod.objects.items.tools.ToolAxe;
import harley.mod.objects.items.tools.ToolHoe;
import harley.mod.objects.items.tools.ToolPickaxe;
import harley.mod.objects.items.tools.ToolSpade;
import harley.mod.objects.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_SILVER = EnumHelper.addToolMaterial("material_silver", 1, 192, 5.0F, 1.5F, 18);
	
	//Items
	public static final Item INGOT_SILVER = new ItemBase("ingot_silver");
	
	//Tools
	public static final ItemSword SWORD_SILVER = new ToolSword("sword_silver", MATERIAL_SILVER);
	public static final ItemSpade SPADE_SILVER = new ToolSpade("spade_silver", MATERIAL_SILVER);
	public static final ItemPickaxe PICKAXE_SILVER = new ToolPickaxe("pickaxe_silver", MATERIAL_SILVER);
	public static final ItemAxe AXE_SILVER = new ToolAxe("axe_silver", MATERIAL_SILVER);
	public static final ItemHoe HOE_SILVER = new ToolHoe("hoe_silver", MATERIAL_SILVER);
}
