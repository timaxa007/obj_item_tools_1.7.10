package sub_mod.obj_item.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import sub_mod.obj_item.ModItemObj;

public class ItemAxeObj extends ItemAxe {

	public ItemAxeObj(Item.ToolMaterial material) {
		super(material);
		setCreativeTab(CreativeTabs.tabMisc);
		setFull3D();
		setTextureName(ModItemObj.MODID + ":axe_obj");
		setUnlocalizedName(ModItemObj.MODID + ".axe_obj");
	}

}
