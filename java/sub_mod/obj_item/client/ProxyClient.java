package sub_mod.obj_item.client;

import java.util.HashMap;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.AdvancedModelLoader;
import sub_mod.obj_item.ModItemObj;
import sub_mod.obj_item.ProxyCommon;
import sub_mod.obj_item.client.render.RenderItemAxeObj;
import sub_mod.obj_item.client.render.RenderItemHoeObj;
import sub_mod.obj_item.client.render.RenderItemPickaxeObj;
import sub_mod.obj_item.client.render.RenderItemShovelObj;
import sub_mod.obj_item.client.render.RenderItemSwordObj;

public class ProxyClient extends ProxyCommon {

	public static ResourceLocation
	texture_metal,
	texture_wooden;

	private static final HashMap<String, Integer> hash = new HashMap<String, Integer>();

	public void preInit() {
		super.preInit();
	}

	public void init() {
		super.init();
		texture_metal = new ResourceLocation(ModItemObj.MODID, "textures/metal.png");
		texture_wooden = new ResourceLocation(ModItemObj.MODID, "textures/wooden.png");

		//if (isCheck) {
		//getRenderPart("sword", "head");
		//getRenderPart("sword", "stick");

		//getRenderPart("pickaxe", "head");
		//getRenderPart("pickaxe", "stick");

		//getRenderPart("shovel", "head");
		//getRenderPart("shovel", "stick");

		//getRenderPart("axe", "head");
		//getRenderPart("axe", "stick");

		//getRenderPart("hoe", "head");
		//getRenderPart("hoe", "stick");
		//}

		//Item
		MinecraftForgeClient.registerItemRenderer(ModItemObj.item_sword_obj, new RenderItemSwordObj());
		MinecraftForgeClient.registerItemRenderer(ModItemObj.item_pickaxe_obj, new RenderItemPickaxeObj());
		MinecraftForgeClient.registerItemRenderer(ModItemObj.item_shovel_obj, new RenderItemShovelObj());
		MinecraftForgeClient.registerItemRenderer(ModItemObj.item_axe_obj, new RenderItemAxeObj());
		MinecraftForgeClient.registerItemRenderer(ModItemObj.item_hoe_obj, new RenderItemHoeObj());

	}

	public static int getRenderAll(String model) {
		if (hash.containsKey(model)) hash.get(model);
		int displayList = GLAllocation.generateDisplayLists(1);
		GL11.glNewList(displayList, GL11.GL_COMPILE);
		AdvancedModelLoader.loadModel(new ResourceLocation(ModItemObj.MODID, "obj/" + model + ".obj")).renderAll();
		GL11.glEndList();
		hash.put(model, displayList);
		return displayList;
	}

	public static int getRenderPart(String model, String partName) {
		if (hash.containsKey(model + "_" + partName)) hash.get(model + "_" + partName);
		int displayList = GLAllocation.generateDisplayLists(1);
		GL11.glNewList(displayList, GL11.GL_COMPILE);
		AdvancedModelLoader.loadModel(new ResourceLocation(ModItemObj.MODID, "obj/" + model + ".obj")).renderPart(partName);
		GL11.glEndList();
		hash.put(model + "_" + partName, displayList);
		return displayList;
	}

}
