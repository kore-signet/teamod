package alisw.alismod.items;

import alisw.alismod.ItemModelProvider;
import alisw.alismod.ItemOreDict;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AlisItems {
	
	public static ItemBase tea = new ItemBase("tea").setCreativeTab(CreativeTabs.FOOD);
	public static TeaSeed tea_seed = new TeaSeed().setCreativeTab(CreativeTabs.FOOD);
	public static ColdTea teacup_cold = new ColdTea();
	public static HotTea teacup_hot = new HotTea();
	public static ItemBase teacup = (ItemBase) new ItemBase("teacup").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(6);
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		if (item instanceof ItemOreDict) {
			((ItemOreDict)item).initOreDict();
		}
		
		return item;
	}
	
	public static void init() {
		register(tea);
		register(tea_seed);
		register(teacup_cold);
		register(teacup_hot);
		register(teacup);
	}
}
