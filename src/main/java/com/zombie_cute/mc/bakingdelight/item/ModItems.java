package com.zombie_cute.mc.bakingdelight.item;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.fluid.ModFluid;
import com.zombie_cute.mc.bakingdelight.item.custom.*;
import com.zombie_cute.mc.bakingdelight.item.enumeration.ModToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item EGG_TART = registerItem("egg_tart",new ModStewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3F).build())));
    public static final Item MASHED_POTATO = registerItem("mashed_potato", new ModStewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).snack().build()).recipeRemainder(Items.BOWL)));
    public static final Item WOODEN_WHISK = registerItem("wooden_whisk",
            new WhiskItem(1.5F, -2.5F, ToolMaterials.WOOD, new FabricItemSettings()));
    public static final Item STONE_WHISK = registerItem("stone_whisk",
            new WhiskItem(1.5F, -3.0F, ToolMaterials.STONE, new FabricItemSettings()));
    public static final Item COPPER_WHISK = registerItem("copper_whisk",
            new WhiskItem(1.5F, -3.4F, ModToolMaterials.COPPER, new FabricItemSettings()));
    public static final Item IRON_WHISK = registerItem("iron_whisk",
            new WhiskItem(1.5F, -3.3F, ToolMaterials.IRON, new FabricItemSettings()));
    public static final Item GOLDEN_WHISK = registerItem("golden_whisk",
            new WhiskItem(1.5F, -3.0F, ToolMaterials.GOLD, new FabricItemSettings()));
    public static final Item AMETHYST_WHISK = registerItem("amethyst_whisk",
            new WhiskItem(1.5F, -2.6F, ModToolMaterials.AMETHYST, new FabricItemSettings()));
    public static final Item DIAMOND_WHISK = registerItem("diamond_whisk",
            new WhiskItem(1.5F, -2.8F, ToolMaterials.DIAMOND, new FabricItemSettings()));
    public static final Item NETHERITE_WHISK = registerItem("netherite_whisk",
            new WhiskItem(1.5F, -3.0F, ToolMaterials.NETHERITE, new FabricItemSettings().fireproof()));
    public static final Item APPLE_PETAL = registerItem("apple_petal", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).snack().build())));
    public static final Item APPLE_CREAM = registerItem("apple_cream", new ModStewItem(new FabricItemSettings()
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
    public static final Item CHERRY_CREAM = registerItem("cherry_cream", new ModStewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build())
            .recipeRemainder(Items.BOWL)
            .maxCount(16)));
    public static final Item CHERRY_MOUSSE = registerItem("cherry_mousse", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.8F).build())));
    public static final Item CHOCOLATE_CREAM = registerItem("chocolate_cream", new ModStewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.8F).build())
            .recipeRemainder(Items.BOWL)
            .maxCount(16)));
    public static final Item CHOCOLATE_MOUSSE = registerItem("chocolate_mousse", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8F).build())));
    public static final Item PRAWN = registerItem("prawn", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2F).build())));
    public static final Item CREAM = registerItem("cream", new ModStewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build())
            .maxCount(16)));

    public static final Item CREAM_MOUSSE = registerItem("cream_mousse", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6F).build())));
    public static final Item CRYSTAL_DUMPLING = registerItem("crystal_dumpling", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(9).saturationModifier(0.6F).snack().meat().build())));
    public static final Item GLOW_SQUID = registerItem("glow_squid", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2F).meat()
                    .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 400, 0), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,200, 0), 0.4F).build())));
    public static final Item GRILLED_STARCH_SAUSAGE = registerItem("grilled_starch_sausage", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8F).meat().build())));
    public static final Item GRILLED_SAUSAGE = registerItem("grilled_sausage", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(1.0F).meat().build())));
    public static final Item LITTLE_OCTOPUS_SAUSAGE = registerItem("little_octopus_sausage", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.5F).meat().build())));
    public static final Item GOLDEN_APPLE_CREAM = registerItem("golden_apple_cream", new ModStewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F)
                    .alwaysEdible().build())
            .recipeRemainder(Items.BOWL)
            .maxCount(16)));
    public static final Item GOLDEN_APPLE_MOUSSE = registerItem("golden_apple_mousse", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.8F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4800, 1), 1.0F)
                    .alwaysEdible().build())
            .maxCount(16)));
    public static final Item MATCHA_CREAM = registerItem("matcha_cream", new ModStewItem(new FabricItemSettings()
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
    public static final Item PUMPKIN_CREAM = registerItem("pumpkin_cream", new ModStewItem(new FabricItemSettings()
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
    public static final Item SAUCE_MASHED_POTATO = registerItem("sauce_mashed_potato", new ModStewItem(new FabricItemSettings()
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
    public static final Item CUTTLEBONE = registerItem("cuttlebone", new CuttleboneItem(new FabricItemSettings()));
    public static final Item GLOW_CUTTLEBONE = registerItem("glow_cuttlebone", new CuttleboneItem(new FabricItemSettings()));
    public static final Item COPPER_KNIFE = registerItem("copper_knife",
            new KnifeItem(ModToolMaterials.COPPER,0, -2.0f, new FabricItemSettings()));
    public static final Item AMETHYST_KNIFE = registerItem("amethyst_knife",
            new KnifeItem(ModToolMaterials.AMETHYST,0.5f, -2.0f, new FabricItemSettings()));
    public static final Item BLACK_PEPPER_CORN = registerItem("black_pepper_corn", new AliasedBlockItem(ModBlocks.BLACK_PEPPER_CROP,
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1).build())));
    public static final Item BLACK_PEPPER_DUST = registerItem("black_pepper_dust", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1).build())));
    public static final Item CREAM_BUCKET = registerItem("cream_bucket",
            new BucketItem(ModFluid.STILL_CREAM,new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    public static final Item CHERRY_BOMB = registerItem("cherry_bomb",new CherryBombItem(new FabricItemSettings().maxCount(16)));
    public static final Item APPLE_PUDDING = registerItem("apple_pudding", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4F).snack().build())));
    public static final Item BRAISED_SHRIMP_BALL = registerItem("braised_shrimp_ball", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8F).meat().build())));
    public static final Item MATCHA_PUDDING = registerItem("matcha_pudding", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).snack()
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,600,0),1.0f).build())));
    public static final Item SUNFLOWER_SEED = registerItem("sunflower_seed", new SunFlowerSeedItem());
    public static final Item TRUFFLE_EGG_TART = registerItem("truffle_egg_tart", new ModStewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).build())));
    public static final Item ICE_BRICK = registerItem("ice_brick", new Item(new FabricItemSettings()));
    public static final Item PUDDING_WIP_1 = registerItem("pudding_wip_1", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build())));
    public static final Item PUDDING_WIP_2 = registerItem("pudding_wip_2", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).build())));
    public static final Item MOUSSE_WIP = registerItem("mousse_wip", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).build())));
    public static final Item KNEADING_STICK = registerItem("kneading_stick", new KneadingStickItem(ToolMaterials.WOOD,2.5f,-2.5f,
            new FabricItemSettings()));
    public static final Item WHEAT_FLOUR = registerItem("wheat_flour", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.2F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,200,0),0.5f).build())));
    public static final Item SUNFLOWER_SEED_PEEL = registerItem("sunflower_seed_peel", new Item(new FabricItemSettings()));
    public static final Item SECTIONED_SAUSAGE = registerItem("sectioned_sausage", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).meat().build())));
    public static final Item SUNFLOWER_SEED_PULP = registerItem("sunflower_seed_pulp", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).snack().build())));
    public static final Item CROWBAR = registerItem("crowbar", new CrowbarItem(ToolMaterials.IRON,7.5f,-3.5f));
    public static final Item SPATULA = registerItem("spatula", new SpatulaItem(ToolMaterials.IRON,2.5f,-2.8f));
    public static final Item ROASTED_SUNFLOWER_SEED = registerItem("roasted_sunflower_seed", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(3).snack().saturationModifier(0.2f).build())));
    public static final Item FILTER = registerItem("filter", new FilterItem(ToolMaterials.WOOD,
            new FabricItemSettings()));
    public static final Item OIL_IMPURITY = registerItem("oil_impurity",new Item(new FabricItemSettings()));
    public static final Item VEGETABLE_OIL_BOTTLE = registerItem("vegetable_oil_bottle",new Item(new FabricItemSettings()
            .maxCount(16).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item VEGETABLE_OIL_BUCKET = registerItem("vegetable_oil_bucket",new BucketItem(ModFluid.STILL_VEGETABLE_OIL,new FabricItemSettings()
            .maxCount(1).recipeRemainder(Items.BUCKET)));
    public static final Item EMPTY_CAKE = registerItem("empty_cake", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build())
    ));
    public static final Item BLUE_ORCHID_FLOWER_CAKE = registerItem("blue_orchid_flower_cake", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,10,0),1.0f).build())
    ));
    public static final Item CHERRY_CAKE = registerItem("cherry_cake", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,200,0),1.0f).build())
    ));
    public static final Item LILAC_CAKE = registerItem("lilac_cake", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,200,0),1.0f).build())
    ));
    public static final Item ORANGE_TULIP_CAKE = registerItem("orange_tulip_cake", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,200,0),1.0f).build())
    ));
    public static final Item OXEYE_DAISY_CAKE = registerItem("oxeye_daisy_cake", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,200,0),1.0f).build())
    ));
    public static final Item PINK_TULIP_CAKE = registerItem("pink_tulip_cake", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,100,1),1.0f).build())
    ));
    public static final Item ROSE_CAKE = registerItem("rose_cake", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,100,1),1.0f).build())
    ));
    public static final Item SUNFLOWER_CAKE = registerItem("sunflower_cake", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,300,0),1.0f).build())
    ));
    public static final Item WHITE_TULIP_CAKE = registerItem("white_tulip_cake", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,200,0),1.0f).build())
    ));
    public static final Item WITHER_ROSE_CAKE = registerItem("wither_rose_cake", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.5f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.WITHER,100,0),1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,300,1),1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,400,1),1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600,0),1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS,40,0),1.0f)
                    .build())
    ));
    public static final Item RAW_ONION_RING = registerItem("raw_onion_ring", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).snack().build())
    ));
    public static final Item ONION_RING = registerItem("onion_ring", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.2f).snack().build())
    ));
    public static final Item FRIED_COD = registerItem("fried_cod", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.3f).build())
    ));
    public static final Item FRIED_SALMON = registerItem("fried_salmon", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.4f).build())
    ));
    public static final Item FRIED_MILK_WIP = registerItem("fried_milk_wip", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())
    ));
    public static final Item FRIED_MILK = registerItem("fried_milk", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).snack().build())
    ));
    public static final Item FRIED_APPLE = registerItem("fried_apple", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).snack().build())
    ));
    public static final Item RAW_POTATO_CHIP = registerItem("raw_potato_chip", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build())
    ));
    public static final Item POTATO_CHIP = registerItem("potato_chip", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build())
    ));
    public static final Item CHEESE_BALL = registerItem("cheese_ball", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).snack().build())
    ));
    public static final Item FRIED_DOUGH_STICK = registerItem("fried_dough_stick", new Item(
            new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).snack().build())
    ));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Bakingdelight.MOD_ID,name),item);
    }
    public static void registerModItems(){
        Bakingdelight.LOGGER.info("Registering Mod Items for " + Bakingdelight.MOD_ID);
    }
}
