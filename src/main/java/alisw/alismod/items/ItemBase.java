package alisw.alismod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import alisw.alismod.AlisMod;
import alisw.alismod.ItemModelProvider;

public class ItemBase extends Item implements ItemModelProvider {
	
	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}

	@Override
	public void registerItemModel(Item i) {
		AlisMod.proxy.registerItemRenderer(i, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
