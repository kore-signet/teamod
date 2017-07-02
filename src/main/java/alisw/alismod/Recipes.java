package alisw.alismod;

import alisw.alismod.items.AlisItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {
		GameRegistry.addShapedRecipe(new ItemStack(AlisItems.teacup,2),
			"   ",
			"A A",
			" A ",
			'A', Items.CLAY_BALL);
		GameRegistry.addShapedRecipe(new ItemStack(AlisItems.teacup_cold),
			"   ",
			"ABC",
			"   ",
			'A', AlisItems.teacup,'B',Items.WATER_BUCKET,'C',AlisItems.tea);
		GameRegistry.addSmelting(AlisItems.teacup_cold, new ItemStack(AlisItems.teacup_hot), 40);
	}
}
