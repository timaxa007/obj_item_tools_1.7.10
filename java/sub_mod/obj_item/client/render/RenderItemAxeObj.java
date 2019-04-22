package sub_mod.obj_item.client.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import sub_mod.obj_item.client.ProxyClient;

public class RenderItemAxeObj implements IItemRenderer {

	@Override
	public boolean handleRenderType(ItemStack is, ItemRenderType type) {
		switch(type) {
		case INVENTORY:return false;
		default:return true;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack is, ItemRendererHelper helper) {
		switch(type) {
		case INVENTORY:return false;
		default:return true;
		}
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack is, Object... data) {
		GL11.glPushMatrix();
		switch(type) {
		case EQUIPPED_FIRST_PERSON:
			GL11.glTranslatef(0.5F, -0.25F, 0.5F);
			GL11.glScalef(2.5F, 2.5F, 2.5F);
			GL11.glRotatef(-180F + 45F, 0, 1, 0);
			break;
		case EQUIPPED:
			GL11.glTranslatef(1.25F, 0.25F, 1.25F);
			GL11.glScalef(2.5F, 2.5F, 2.5F);
			GL11.glRotatef(-90F + 45F, 0, 1, 0);
			GL11.glRotatef(65F, 0, 0, 1);
			break;
		default:
			GL11.glScalef(1.5F, 1.5F, 1.5F);
			break;
		}
		Minecraft.getMinecraft().renderEngine.bindTexture(ProxyClient.texture_metal);
		GL11.glCallList(ProxyClient.getRenderPart("axe", "head"));
		Minecraft.getMinecraft().renderEngine.bindTexture(ProxyClient.texture_wooden);
		GL11.glCallList(ProxyClient.getRenderPart("axe", "stick"));
		GL11.glPopMatrix();
	}

}
