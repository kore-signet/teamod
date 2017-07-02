package alisw.alismod.items;

import alisw.alismod.AlisMod;
import alisw.alismod.ItemModelProvider;
import alisw.alismod.ItemOreDict;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class ColdTea extends ItemFood implements ItemModelProvider, ItemOreDict {
	
	public ColdTea() {
		super(1,0.6f,false);
		setUnlocalizedName("teacup_cold");
		setRegistryName("teacup_cold");
		setCreativeTab(CreativeTabs.FOOD);
		setMaxStackSize(4);
		setAlwaysEdible();
	}

	@Override
	public void initOreDict() {
		OreDictionary.registerOre("teacup_cold", this);
	}

	@Override
	public void registerItemModel(Item item) {
		AlisMod.proxy.registerItemRenderer(this, 0, "teacup_cold");
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		if (!world.isRemote) {
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(9),400)); 
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),400,0));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(10),200,0));
		}
	}
}
