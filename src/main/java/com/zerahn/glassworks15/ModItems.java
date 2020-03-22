package com.zerahn.glassworks15;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, GlassWorks15Main.MODID);

    public static final RegistryObject<Item> i_BRIGHTSHARD = ITEMS.register("brightshard", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> i_BRIGHTSHARDS = ITEMS.register("brightshards", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> i_GLASS_SHARD = ITEMS.register("glass_shard", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> i_GLASS_SHARDS = ITEMS.register("glass_shards", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> i_BRIGHTSAND = ITEMS.register("brightsand", () -> new BlockItem(ModBlocks.b_BRIGHTSAND.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> i_BRIGHTSANDSTONE = ITEMS.register("brightsandstone", () -> new BlockItem(ModBlocks.b_BRIGHTSANDSTONE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> i_BRIGHTSANDSTONE_SMOOTH = ITEMS.register("brightsandstone_smooth", () -> new BlockItem(ModBlocks.b_BRIGHTSANDSTONE_SMOOTH.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> i_BRIGHTGLASS = ITEMS.register("brightglass", () -> new BlockItem(ModBlocks.b_BRIGHTGLASS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> i_BRIGHTGLASS_PANE = ITEMS.register("brightglass_pane", () -> new BlockItem(ModBlocks.b_BRIGHTGLASS_PANE.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> i_BRIGHTGLASS_PLATE = ITEMS.register("brightglass_plate", () -> new BlockItem(ModBlocks.b_BRIGHTGLASS_PLATE.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> i_GLASS_PLATE = ITEMS.register("glass_plate", () -> new BlockItem(ModBlocks.b_GLASS_PLATE.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));

    public ModItems() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
