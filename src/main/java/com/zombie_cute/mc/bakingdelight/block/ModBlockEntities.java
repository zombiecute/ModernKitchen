package com.zombie_cute.mc.bakingdelight.block;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.entities.FreezerBlockEntity;
import com.zombie_cute.mc.bakingdelight.block.entities.GlassBowlBlockEntity;
import com.zombie_cute.mc.bakingdelight.block.entities.OvenBlockEntity;
import com.zombie_cute.mc.bakingdelight.block.entities.PizzaWIPBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<OvenBlockEntity> OVEN_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID,"oven_be"),
                    FabricBlockEntityTypeBuilder.create(OvenBlockEntity::new, ModBlocks.OVEN).build());
    public static final BlockEntityType<GlassBowlBlockEntity> GLASS_BOWL_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID, "glass_bowl_be"),
            FabricBlockEntityTypeBuilder.create(GlassBowlBlockEntity::new, ModBlocks.GLASS_BOWL).build(null)
    );
    public static final BlockEntityType<FreezerBlockEntity> FREEZER_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID, "freezer_be"),
            FabricBlockEntityTypeBuilder.create(FreezerBlockEntity::new, ModBlocks.FREEZER).build(null)
    );
    public static final BlockEntityType<PizzaWIPBlockEntity> PIZZA_WIP_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID, "pizza_wip_be"),
            FabricBlockEntityTypeBuilder.create(PizzaWIPBlockEntity::new, ModBlocks.PIZZA_WIP).build(null)
    );
    public static void registerBlockEntities(){
        Bakingdelight.LOGGER.info("Registering Mod Block Entities for " + Bakingdelight.MOD_ID);
    }
}
