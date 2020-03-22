package com.zerahn.glassworks15;

import com.zerahn.glassworks15.blocks.BrightglassPane;
import com.zerahn.glassworks15.blocks.BrightglassPlate;
import com.zerahn.glassworks15.blocks.GlassPlate;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, GlassWorks15Main.MODID);

    public static final RegistryObject<Block> b_BRIGHTSAND = BLOCKS.register("brightsand", () ->
            new FallingBlock(Block.Properties.create(Material.SAND, MaterialColor.SAND).sound(SoundType.SAND)
                    .hardnessAndResistance(0.5F)
                    .lightValue(10))
    );
    public static final RegistryObject<Block> b_BRIGHTSANDSTONE = BLOCKS.register("brightsandstone", () ->
            new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND)
                    .hardnessAndResistance(0.8F)
                    .lightValue(10))
    );
    public static final RegistryObject<Block> b_BRIGHTSANDSTONE_SMOOTH = BLOCKS.register("brightsandstone_smooth", () ->
            new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND)
                    .hardnessAndResistance(0.8F)
                    .lightValue(10))
    );
    public static final RegistryObject<Block> b_BRIGHTGLASS = BLOCKS.register("brightglass", () ->
            new GlassBlock(Block.Properties.create(Material.GLASS, MaterialColor.SAND).sound(SoundType.GLASS)
                    .hardnessAndResistance(0.3F)
                    .lightValue(15)
                    .notSolid()
            )

    );
    public static final RegistryObject<Block> b_BRIGHTGLASS_PANE = BLOCKS.register("brightglass_pane", () ->
            new BrightglassPane(Block.Properties.create(Material.GLASS, MaterialColor.SAND).sound(SoundType.GLASS)
                    .hardnessAndResistance(0.3F)
                    .lightValue(15)
                    .notSolid()
            )
    );
    public static final RegistryObject<Block> b_BRIGHTGLASS_PLATE = BLOCKS.register("brightglass_plate", () ->
            new BrightglassPlate(Block.Properties.create(Material.GLASS, MaterialColor.SAND).sound(SoundType.GLASS)
                    .hardnessAndResistance(0.3F)
                    .lightValue(15)
                    .notSolid()
            )
    );
    public static final RegistryObject<Block> b_GLASS_PLATE = BLOCKS.register("glass_plate", () ->
            new GlassPlate(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS)
                    .hardnessAndResistance(0.3F)
                    .notSolid()
            )
    );

    public static void clientSide() {
        RenderTypeLookup.setRenderLayer(ModBlocks.b_BRIGHTGLASS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.b_BRIGHTGLASS_PANE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.b_BRIGHTGLASS_PLATE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.b_GLASS_PLATE.get(), RenderType.getCutout());
    }

    public ModBlocks() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
