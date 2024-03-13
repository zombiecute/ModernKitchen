package com.zombie_cute.mc.bakingdelight.item;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.item.custom.*;
import com.zombie_cute.mc.bakingdelight.item.enumeration.ModToolMaterials;
import com.zombie_cute.mc.bakingdelight.tag.ModTagKeys;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item EGG_TART = registerItem("egg_tart",new StewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3F).build())));
    public static final Item MASHED_POTATO = registerItem("mashed_potato", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).snack().build())));
    public static final Item WOODEN_WHISK = registerItem("wooden_whisk",
            new WhiskItem(1.5F, -2.5F, ToolMaterials.WOOD, ModTagKeys.WHISK_MINEABLE, new FabricItemSettings()));
    public static final Item STONE_WHISK = registerItem("stone_whisk",
            new WhiskItem(1.5F, -3.0F, ToolMaterials.STONE, ModTagKeys.WHISK_MINEABLE, new FabricItemSettings()));
    public static final Item COPPER_WHISK = registerItem("copper_whisk",
            new WhiskItem(1.5F, -3.4F, ModToolMaterials.COPPER, ModTagKeys.WHISK_MINEABLE, new FabricItemSettings()));
    public static final Item IRON_WHISK = registerItem("iron_whisk",
            new WhiskItem(1.5F, -3.3F, ToolMaterials.IRON, ModTagKeys.WHISK_MINEABLE, new FabricItemSettings()));
    public static final Item GOLDEN_WHISK = registerItem("golden_whisk",
            new WhiskItem(1.5F, -3.0F, ToolMaterials.GOLD, ModTagKeys.WHISK_MINEABLE, new FabricItemSettings()));
    public static final Item AMETHYST_WHISK = registerItem("amethyst_whisk",
            new WhiskItem(1.5F, -2.6F, ModToolMaterials.AMETHYST, ModTagKeys.WHISK_MINEABLE, new FabricItemSettings()));
    public static final Item DIAMOND_WHISK = registerItem("diamond_whisk",
            new WhiskItem(1.5F, -2.8F, ToolMaterials.DIAMOND, ModTagKeys.WHISK_MINEABLE, new FabricItemSettings()));
    public static final Item NETHERITE_WHISK = registerItem("netherite_whisk",
            new WhiskItem(1.5F, -3.0F, ToolMaterials.NETHERITE, ModTagKeys.WHISK_MINEABLE, new FabricItemSettings().fireproof()));
    public static final Item APPLE_PETAL = registerItem("apple_petal", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).snack().build())));
    public static final Item APPLE_CREAM = registerItem("apple_cream", new StewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build())
            .recipeRemainder(Items.BOWL)
            .maxCount(16)));
    public static final Item BUTTER = registerItem("butter", new ButterItem(new FabricItemSettings().maxCount(16)));
    public static final Item BUTTER_BREAD_SLICE = registerItem("butter_bread_slice", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8F).snack().build())));
    public static final Item BREAD_SLICE = registerItem("bread_slice", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).snack().build())));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).snack().build())));
    public static final Item CHERRY = registerItem("cherry", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build())));
    public static final Item CHERRY_CREAM = registerItem("cherry_cream", new StewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build())
            .recipeRemainder(Items.BOWL)
            .maxCount(16)));
    public static final Item CHERRY_MOUSSE = registerItem("cherry_mousse", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.8F).build())));
    public static final Item CHOCOLATE_CREAM = registerItem("chocolate_cream", new StewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(1.0F).build())
            .recipeRemainder(Items.BOWL)
            .maxCount(16)));
    public static final Item CHOCOLATE_MOUSSE = registerItem("chocolate_mousse", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(1.1F).build())));
    public static final Item PRAWN = registerItem("prawn", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2F).build())));
    public static final Item CREAM = registerItem("cream", new StewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build())
            .maxCount(16)));

    public static final Item CREAM_MOUSSE = registerItem("cream_mousse", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6F).build())));
    public static final Item CRYSTAL_DUMPLING = registerItem("crystal_dumpling", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(9).saturationModifier(0.4F).snack().meat().build())));
    public static final Item GLOW_SQUID = registerItem("glow_squid", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2F).meat()
                    .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 400, 0), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,200, 0), 0.4F).build())));
    public static final Item GRILLED_STARCH_SAUSAGE = registerItem("grilled_starch_sausage", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(9).saturationModifier(1.0F).meat().build())));
    public static final Item GRILLED_SAUSAGE = registerItem("grilled_sausage", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(1.0F).meat().build())));
    public static final Item LITTLE_OCTOPUS_SAUSAGE = registerItem("little_octopus_sausage", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(10).saturationModifier(1.0F).meat().build())));
    public static final Item GOLDEN_APPLE_CREAM = registerItem("golden_apple_cream", new StewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F)
                    .alwaysEdible().build())
            .recipeRemainder(Items.BOWL)
            .maxCount(16)));
    public static final Item GOLDEN_APPLE_MOUSSE = registerItem("golden_apple_mousse", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(10).saturationModifier(1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4800, 1), 1.0F)
                    .alwaysEdible().build())
            .maxCount(16)));
    public static final Item MATCHA_CREAM = registerItem("matcha_cream", new StewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0), 0.7F).build())
            .recipeRemainder(Items.BOWL)
            .maxCount(16)));
    public static final Item MATCHA_MOUSSE = registerItem("matcha_mousse", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.8F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 0), 0.7F)
                    .build())));
    public static final Item MIXED_DOUGH = registerItem("mixed_dough", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300, 0), 0.4F).build())));
    public static final Item POTATO_STARCH = registerItem("potato_starch", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).build())));
    public static final Item PUMPKIN_CREAM = registerItem("pumpkin_cream", new StewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).build())
            .recipeRemainder(Items.BOWL)
            .maxCount(16)));
    public static final Item PUMPKIN_MOUSSE = registerItem("pumpkin_mousse", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7F).build())));
    public static final Item ROASTED_GLOW_SQUID = registerItem("roasted_glow_squid", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat()
                    .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200, 0), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,1200, 0), 1.0F).build())));
    public static final Item ROASTED_SQUID = registerItem("roasted_squid", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat().build())));
    public static final Item SAUCE_MASHED_POTATO = registerItem("sauce_mashed_potato", new StewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6F).build())
            .recipeRemainder(Items.BOWL)
            .maxCount(16)));
    public static final Item SQUID = registerItem("squid", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2F).meat().build())));
    public static final Item STARCH_SAUSAGE = registerItem("starch_sausage", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).meat().build())));
    public static final Item SAUSAGE = registerItem("sausage", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).meat().build())));
    public static final Item BLACK_TRUFFLE = registerItem("black_truffle", new TruffleItem(new FabricItemSettings()));
    public static final Item WHITE_TRUFFLE = registerItem("white_truffle", new TruffleItem(new FabricItemSettings()));
    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword",
            new SwordItem(ModToolMaterials.AMETHYST,  3,-2.2F, new FabricItemSettings()));
    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe",
            new PickaxeItem(ModToolMaterials.AMETHYST, 2,-2.8F, new FabricItemSettings()));
    public static final Item AMETHYST_AXE = registerItem("amethyst_axe",
            new AxeItem(ModToolMaterials.AMETHYST, 6, -3.0F, new FabricItemSettings()));
    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel",
            new ShovelItem(ModToolMaterials.AMETHYST, 2.5F, -2.7F, new FabricItemSettings()));
    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe",
            new HoeItem(ModToolMaterials.AMETHYST, 0, 0.0F, new FabricItemSettings()));
    public static final Item CUTTLEBONE = registerItem("cuttlebone", new CuttleboneItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 2),1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 300,0), 1.0F)
                    .build())));
    public static final Item GLOW_CUTTLEBONE = registerItem("glow_cuttlebone", new CuttleboneItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2400, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 2400, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 600,0), 1.0F)
            .build())));
    public static final Item COPPER_KNIFE = registerItem("copper_knife",
            new KnifeItem(ModToolMaterials.COPPER, 0, -2.0F, new FabricItemSettings()));
    public static final Item AMETHYST_KNIFE = registerItem("amethyst_knife",
            new KnifeItem(ModToolMaterials.AMETHYST, 0, -2.0F, new FabricItemSettings()));
    public static final Item BLACK_PEPPER_CORN = registerItem("black_pepper_corn", new AliasedBlockItem(ModBlocks.BLACK_PEPPER_CROP,
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1).build())));
    public static final Item BLACK_PEPPER_DUST = registerItem("black_pepper_dust", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1).build())));
    public static final Item CREAM_BUCKET = registerItem("cream_bucket", new Item(new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    public static final Item CHERRY_BOMB = registerItem("cherry_bomb",new CherryBombItem(new FabricItemSettings().maxCount(16)));
    public static final Item APPLE_PUDDING = registerItem("apple_pudding", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4F).snack().build())));
    public static final Item BRAISED_SHRIMP_BALL = registerItem("braised_shrimp_ball", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8F).meat().build())));
    public static final Item MATCHA_PUDDING = registerItem("matcha_pudding", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).snack()
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,600,0),1.0f).build())));
    public static final Item SUNFLOWER_SEED = registerItem("sunflower_seed", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).snack().build())));
    public static final Item TRUFFLE_EGG_TART = registerItem("truffle_egg_tart", new StewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).build())));
    public static final Item ICE_BRICK = registerItem("ice_brick", new Item(new FabricItemSettings()));
    public static final Item PUDDING_WIP_1 = registerItem("pudding_wip_1", new Item(new FabricItemSettings()));
    public static final Item PUDDING_WIP_2 = registerItem("pudding_wip_2", new Item(new FabricItemSettings()));
    public static final Item MOUSSE_WIP = registerItem("mousse_wip", new Item(new FabricItemSettings()));


    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Bakingdelight.MOD_ID,name),item);
    }
    public static void registerModItems(){
        Bakingdelight.LOGGER.info("Registering Mod Items for " + Bakingdelight.MOD_ID);
    }
}
