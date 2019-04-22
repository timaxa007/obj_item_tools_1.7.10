package sub_mod.obj_item.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import sub_mod.obj_item.ModItemObj;

public class ItemPickaxeObj extends ItemPickaxe {

	public ItemPickaxeObj(Item.ToolMaterial material) {
		super(material);
		setCreativeTab(CreativeTabs.tabMisc);
		setFull3D();
		setTextureName(ModItemObj.MODID + ":pickaxe_obj");
		setUnlocalizedName(ModItemObj.MODID + ".pickaxe_obj");
	}

}
