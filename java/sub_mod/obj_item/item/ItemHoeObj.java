package sub_mod.obj_item.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import sub_mod.obj_item.ModItemObj;

public class ItemHoeObj extends ItemHoe {

	public ItemHoeObj(Item.ToolMaterial material) {
		super(material);
		setCreativeTab(CreativeTabs.tabMisc);
		setFull3D();
		setTextureName(ModItemObj.MODID + ":hoe_obj");
		setUnlocalizedName(ModItemObj.MODID + ".hoe_obj");
	}

}
