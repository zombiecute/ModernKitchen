package com.zombie_cute.mc.bakingdelight.block;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.entities.*;
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
    public static final BlockEntityType<BakingTrayBlockEntity> BAKING_TRAY_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID, "baking_tray_be"),
            FabricBlockEntityTypeBuilder.create(BakingTrayBlockEntity::new, ModBlocks.BAKING_TRAY).build(null)
    );
    public static final BlockEntityType<AdvanceFurnaceBlockEntity> ADVANCE_FURNACE_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID, "advance_furnace_block_entity"),
            FabricBlockEntityTypeBuilder.create(AdvanceFurnaceBlockEntity::new, ModBlocks.ADVANCE_FURNACE).build(null)
    );;
    public static final BlockEntityType<WoodenBasinBlockEntity> WOODEN_BASIN_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID,"wooden_basin_block_be"),
            FabricBlockEntityTypeBuilder.create(WoodenBasinBlockEntity::new, ModBlocks.WOODEN_BASIN).build(null)
    );
    public static final BlockEntityType<GasCanisterBlockEntity> GAS_CANISTER_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID,"gas_canister_block_be"),
            FabricBlockEntityTypeBuilder.create(GasCanisterBlockEntity::new, ModBlocks.GAS_CANISTER).build(null)
    );
    public static final BlockEntityType<BiogasDigesterControllerBlockEntity> BIOGAS_DIGESTER_CONTROLLER_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID,"biogas_digester_controller_block_be"),
            FabricBlockEntityTypeBuilder.create(BiogasDigesterControllerBlockEntity::new, ModBlocks.BIOGAS_DIGESTER_CONTROLLER).build(null)
    );
    public static final BlockEntityType<BiogasDigesterIOBlockEntity> BIOGAS_DIGESTER_IO_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID,"biogas_digester_io_block_be"),
            FabricBlockEntityTypeBuilder.create(BiogasDigesterIOBlockEntity::new, ModBlocks.BIOGAS_DIGESTER_IO).build(null)
    );
    public static final BlockEntityType<BurningGasCookingStoveBlockEntity> BURNING_GAS_COOKING_STOVE_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID,"gas_cooking_stove_block_be"),
            FabricBlockEntityTypeBuilder.create(BurningGasCookingStoveBlockEntity::new, ModBlocks.BURNING_GAS_COOKING_STOVE).build(null)
    );
    public static final BlockEntityType<DeepFryerBlockEntity> DEEP_FRYER_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID,"deep_fryer_block_be"),
            FabricBlockEntityTypeBuilder.create(DeepFryerBlockEntity::new, ModBlocks.DEEP_FRYER).build(null)
    );
    public static final BlockEntityType<KitchenUtensilHolderBlockEntity> KITCHEN_UTENSIL_HOLDER_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID, "kitchen_utensil_holder_be"),
            FabricBlockEntityTypeBuilder.create(KitchenUtensilHolderBlockEntity::new, ModBlocks.KITCHEN_UTENSIL_HOLDER).build(null)
    );
    public static final BlockEntityType<CuisineTableBlockEntity> CUISINE_TABLE_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID, "cuisine_table_be"),
            FabricBlockEntityTypeBuilder.create(CuisineTableBlockEntity::new, ModBlocks.CUISINE_TABLE).build(null)
    );
    public static final BlockEntityType<RawPizzaBlockEntity> RAW_PIZZA_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID, "raw_pizza_be"),
            FabricBlockEntityTypeBuilder.create(RawPizzaBlockEntity::new, ModBlocks.RAW_PIZZA).build(null)
    );
    public static final BlockEntityType<PizzaBlockEntity> PIZZA_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID, "pizza_be"),
            FabricBlockEntityTypeBuilder.create(PizzaBlockEntity::new, ModBlocks.PIZZA).build(null)
    );
    public static final BlockEntityType<CabinetBlockEntity> CABINET_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(Bakingdelight.MOD_ID, "cabinet_be"),
            FabricBlockEntityTypeBuilder.create(CabinetBlockEntity::new,
                    ModBlocks.ANDESITE_CABINET).build(null)
    );

    public static void registerBlockEntities(){
        Bakingdelight.LOGGER.info("Registering Mod Block Entities for " + Bakingdelight.MOD_ID);
    }
}
