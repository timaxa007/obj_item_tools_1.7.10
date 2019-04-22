package sub_mod.obj_item.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import sub_mod.obj_item.ModItemObj;

public class ItemShovelObj extends ItemSpade {

	public ItemShovelObj(Item.ToolMaterial material) {
		super(material);
		setCreativeTab(CreativeTabs.tabMisc);
		setFull3D();
		setTextureName(ModItemObj.MODID + ":shovel_obj");
		setUnlocalizedName(ModItemObj.MODID + ".shovel_obj");
	}

}
