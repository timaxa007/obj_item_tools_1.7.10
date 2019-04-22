package sub_mod.obj_item;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import sub_mod.obj_item.item.ItemAxeObj;
import sub_mod.obj_item.item.ItemHoeObj;
import sub_mod.obj_item.item.ItemPickaxeObj;
import sub_mod.obj_item.item.ItemShovelObj;
import sub_mod.obj_item.item.ItemSwordObj;

@Mod (modid = ModItemObj.MODID, name = ModItemObj.MODNAME, version = ModItemObj.VERSION)

public class ModItemObj {

	public static final String 
	MODID = "sub_mod_obj_item",
	MODNAME = "SM_OI",
	VERSION = "0.5b";

	@Instance(ModItemObj.MODID)
	public static ModItemObj instance;

	@SidedProxy(modId = ModItemObj.MODID,
			clientSide = "sub_mod.obj_item.client.ProxyClient",
			serverSide = "sub_mod.obj_item.ProxyCommon")
	public static ProxyCommon proxy;

	public static final Item.ToolMaterial toolMaterialObj = EnumHelper.addToolMaterial("ToolMaterialObj", 2, 250, 6.0F, 2.0F, 14);
	
	public static Item
	item_sword_obj,
	item_pickaxe_obj,
	item_shovel_obj,
	item_axe_obj,
	item_hoe_obj;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		item_sword_obj = new ItemSwordObj(toolMaterialObj);
		GameRegistry.registerItem(item_sword_obj, "item_sword_obj");

		item_pickaxe_obj = new ItemPickaxeObj(toolMaterialObj);
		GameRegistry.registerItem(item_pickaxe_obj, "item_pickaxe_obj");

		item_shovel_obj = new ItemShovelObj(toolMaterialObj);
		GameRegistry.registerItem(item_shovel_obj, "item_shovel_obj");

		item_axe_obj = new ItemAxeObj(toolMaterialObj);
		GameRegistry.registerItem(item_axe_obj, "item_axe_obj");

		item_hoe_obj = new ItemHoeObj(toolMaterialObj);
		GameRegistry.registerItem(item_hoe_obj, "item_hoe_obj");

		proxy.preInit();

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

}