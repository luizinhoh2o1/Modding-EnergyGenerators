package energyGenerators.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class GuiMatter extends GuiScreen{
	
	//int guiWidth = 176;
	//int guiHeight = 140;

	//Minecraft mc = Minecraft.getMinecraft();
	
	public GuiMatter(Minecraft minecraft) {
		mc = minecraft;
		fontRenderer = mc.fontRenderer;
	}
	
	@Override
	public void drawScreen(int x, int y, float ticks) {
		
		drawRect(5, 10, 20, 20, 0x99424242);
		
		/*
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		//mc.renderEngine.getTexture("guimatter.png");
		mc.renderEngine.bindTexture("gui/guimatter.png");
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
		super.drawScreen(x, y, ticks);
		*/
	}
	
	protected void mouseClicked(int i, int j, int k) {
		super.mouseClicked(i, j, k);
		
		if (5 < i && 20 > i && 10 < j && 20 > j) {
			
		}
	}
}
