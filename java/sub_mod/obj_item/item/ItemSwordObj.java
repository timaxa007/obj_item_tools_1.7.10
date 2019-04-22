package sub_mod.obj_item.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import sub_mod.obj_item.ModItemObj;

public class ItemSwordObj extends ItemSword {

	public ItemSwordObj(Item.ToolMaterial material) {
		super(material);
		setCreativeTab(CreativeTabs.tabMisc);
		setFull3D();
		setTextureName(ModItemObj.MODID + ":sword_obj");
		setUnlocalizedName(ModItemObj.MODID + ".sword_obj");
	}

}
