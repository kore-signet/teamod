package alisw.alismod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import alisw.alismod.AlisMod;
import alisw.alismod.ItemModelProvider;
import alisw.alismod.blocks.AlisBlocks;

public class TeaSeed extends ItemSeeds implements ItemModelProvider {

	public TeaSeed() {
		super(AlisBlocks.tea_crop, Blocks.FARMLAND);
		setUnlocalizedName("tea_seed");
		setRegistryName("tea_seed");
	}

	@Override
	public void registerItemModel(Item item) {
		AlisMod.proxy.registerItemRenderer(item, 0, "tea_seed");
	}
	
	@Override
	public TeaSeed setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}