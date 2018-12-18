package harley.mod.init;

import java.util.ArrayList;
import java.util.List;

import harley.mod.objects.items.ItemBase;
import harley.mod.objects.items.armor.ArmorBase;
import harley.mod.objects.items.tools.ToolAxe;
import harley.mod.objects.items.tools.ToolHoe;
import harley.mod.objects.items.tools.ToolPickaxe;
import harley.mod.objects.items.tools.ToolSpade;
import harley.mod.objects.items.tools.ToolSword;
import harley.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
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
	public static final ArmorMaterial ARMOR_MATERIAL_SILVER = EnumHelper.addArmorMaterial("armor_material_silver", Reference.MODID + ":silver", 12, new int[] {1, 5, 4, 2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	
	//Items
	public static final Item INGOT_SILVER = new ItemBase("ingot_silver");
	
	//Tools
	public static final ItemSword SWORD_SILVER = new ToolSword("sword_silver", MATERIAL_SILVER);
	public static final ItemSpade SPADE_SILVER = new ToolSpade("spade_silver", MATERIAL_SILVER);
	public static final ItemPickaxe PICKAXE_SILVER = new ToolPickaxe("pickaxe_silver", MATERIAL_SILVER);
	public static final ItemAxe AXE_SILVER = new ToolAxe("axe_silver", MATERIAL_SILVER);
	public static final ItemHoe HOE_SILVER = new ToolHoe("hoe_silver", MATERIAL_SILVER);
	
	//Armor
	public static final Item HELMET_SILVER = new ArmorBase("helmet_silver", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_SILVER = new ArmorBase("chestplate_silver", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_SILVER = new ArmorBase("leggings_silver", ARMOR_MATERIAL_SILVER, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_SILVER = new ArmorBase("boots_silver", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.FEET);
}
