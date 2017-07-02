package alisw.alismod.blocks;

import alisw.alismod.items.AlisItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class TeaCrop extends BlockCrops {
	
	public TeaCrop() {
		setUnlocalizedName("tea_crop");
		setRegistryName("tea_crop");
	}
	
	@Override
	protected Item getSeed() {
		return AlisItems.tea_seed;
	}
	
	@Override
	protected Item getCrop() {
		return AlisItems.tea;
	}
}
