package shinsei.items;

import cpw.mods.fml.common.registry.GameRegistry;
import shinsei.Main;
import net.minecraft.item.Item;

public final class ShinseiItems {

	//Item Variables
	public static Item itemSilt;
	public static Item itemLimestoneShard;
	public static Item itemCopperIngot;
	public static Item itemStonePickaxeHead;
	public static Item itemCopperPickaxeHead;
	public static Item itemCopperPickaxe;
	public static Item itemSilverPickaxe;
	public static Item itemCopperAxe;
	public static Item itemCopperHoe;
	public static Item itemCopperShovel;
	public static Item itemCopperSword;

	public static void init(){
		
	//Item Initialization
		
		//Ores
		itemLimestoneShard = new ShinseiItem().setUnlocalizedName("limestone_shard");
		GameRegistry.registerItem(itemLimestoneShard, "limestone_shard");
		itemCopperIngot = new ShinseiItem().setUnlocalizedName("copper_ingot");
		GameRegistry.registerItem(itemCopperIngot, "copper_ingot");

		//Minerals
		itemSilt = new ShinseiItem().setUnlocalizedName("silt");
		GameRegistry.registerItem(itemSilt, "silt");

		//Tool Parts		
		itemStonePickaxeHead = new ShinseiItem().setUnlocalizedName("stone_pickaxe_head");
		GameRegistry.registerItem(itemStonePickaxeHead, "stone_pickaxe_head");
		itemCopperPickaxeHead = new ShinseiItem().setUnlocalizedName("copper_pickaxe_head");
		GameRegistry.registerItem(itemCopperPickaxeHead, "copper_pickaxe_head");

		//Tools		
		itemCopperPickaxe = new ShinseiPickaxe(Main.materialCopper).setUnlocalizedName("copper_pickaxe");
		GameRegistry.registerItem(itemCopperPickaxe, "copper_pickaxe");
		itemCopperAxe = new ShinseiAxe(Main.materialCopper).setUnlocalizedName("copper_axe");
		GameRegistry.registerItem(itemCopperAxe, "copper_axe");
		itemCopperHoe = new ShinseiHoe(Main.materialCopper).setUnlocalizedName("copper_hoe");
		GameRegistry.registerItem(itemCopperHoe, "copper_hoe");
		itemCopperShovel = new ShinseiShovel(Main.materialCopper).setUnlocalizedName("copper_shovel");
		GameRegistry.registerItem(itemCopperShovel, "copper_shovel");
		itemCopperSword = new ShinseiSword(Main.materialCopper).setUnlocalizedName("copper_sword");
		GameRegistry.registerItem(itemCopperSword, "copper_sword");
	}
}