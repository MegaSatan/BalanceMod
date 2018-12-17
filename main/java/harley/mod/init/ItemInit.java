package harley.mod.init;

import java.util.ArrayList;
import java.util.List;

import harley.mod.objects.items.ItemBase;
import harley.mod.objects.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
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
}
