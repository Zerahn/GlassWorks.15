package com.zerahn.glassworks15;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.event.LootTableLoadEvent;

public class ModLoot {
    public static void inject(final LootTableLoadEvent event) {
        if (event.getName().equals(new ResourceLocation("minecraft","blocks/glass"))) {
            mergeLoot(event,"glassworks15","blocks/glass");
        }
        if (event.getName().equals(new ResourceLocation("minecraft","blocks/glass_pane"))) {
            mergeLoot(event,"glassworks15","blocks/glass_pane");
        }
    }
    private static void mergeLoot(LootTableLoadEvent event, String namespaceIn, String pathIn) {
        event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(namespaceIn,pathIn))).build());
    }
}