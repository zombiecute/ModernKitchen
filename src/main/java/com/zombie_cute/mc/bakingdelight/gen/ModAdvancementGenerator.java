package com.zombie_cute.mc.bakingdelight.gen;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;


public class ModAdvancementGenerator extends FabricAdvancementProvider {

    public ModAdvancementGenerator(FabricDataOutput output) {
        super(output);
    }
    public static final String GET_WHISK_TITLE = "advancement.bakingdelight.get_whisk_title";
    public static final String GET_WHISK_DESC = "advancement.bakingdelight.get_whisk_desc";
    public static final String GET_AMETHYST_TOOL_TITLE = "advancement.bakingdelight.get_amethyst_tool_title";
    public static final String GET_AMETHYST_TOOL_DESC = "advancement.bakingdelight.get_amethyst_tool_desc";
    public static final String GET_NETHERITE_WHISK_TITLE = "advancement.bakingdelight.get_netherite_whisk_title";
    public static final String GET_NETHERITE_WHISK_DESC = "advancement.bakingdelight.get_netherite_whisk_desc";
    public static final String GET_CUTTLEBONE_TITLE = "advancement.bakingdelight.get_cuttlebone_title";
    public static final String GET_CUTTLEBONE_DESC = "advancement.bakingdelight.get_cuttlebone_desc";
    public static final String GET_TRUFFLE_TITLE = "advancement.bakingdelight.get_truffle_title";
    public static final String GET_TRUFFLE_DESC = "advancement.bakingdelight.get_truffle_desc";
    public static final String GET_ALL_AMETHYST_TITLE = "advancement.bakingdelight.get_all_amethyst_title";
    public static final String GET_ALL_AMETHYST_DESC = "advancement.bakingdelight.get_all_amethyst_desc";
    public static final String GET_CHERRY_BOMB_TITLE = "advancement.bakingdelight.get_cherry_bomb_title";
    public static final String GET_CHERRY_BOMB_DESC = "advancement.bakingdelight.get_cherry_bomb_desc";
    public static final String GET_GLASS_BOWL_TITLE = "advancement.bakingdelight.get_glass_bowl_title";
    public static final String GET_GLASS_BOWL_DESC = "advancement.bakingdelight.get_glass_bowl_desc";
    public static final String GET_MASHED_POTATO_TITLE = "advancement.bakingdelight.get_mashed_potato_title";
    public static final String GET_MASHED_POTATO_DESC = "advancement.bakingdelight.get_mashed_potato_desc";
    public static final String GET_POTATO_STARCH_TITLE = "advancement.bakingdelight.get_potato_starch_title";
    public static final String GET_POTATO_STARCH_DESC = "advancement.bakingdelight.get_potato_starch_desc";
    public static final String GET_FREEZER_TITLE = "advancement.bakingdelight.get_freezer_title";
    public static final String GET_FREEZER_DESC = "advancement.bakingdelight.get_freezer_desc";
    public static final String GET_BLUE_ICE_TITLE = "advancement.bakingdelight.get_blue_ice_title";
    public static final String GET_BLUE_ICE_DESC = "advancement.bakingdelight.get_blue_ice_desc";
    public static final String GET_OVEN_TITLE = "advancement.bakingdelight.get_oven_title";
    public static final String GET_OVEN_DESC = "advancement.bakingdelight.get_oven_desc";
    public static final String GET_EGG_TART_TITLE = "advancement.bakingdelight.get_egg_tart_title";
    public static final String GET_EGG_TART_DESC = "advancement.bakingdelight.get_egg_tart_desc";
    public static final String GET_PUDDING_WIP_1_TITLE = "advancement.bakingdelight.get_pudding_wip_1_title";
    public static final String GET_PUDDING_WIP_1_DESC = "advancement.bakingdelight.get_pudding_wip_1_desc";
    public static final String GET_PUDDING_WIP_2_TITLE = "advancement.bakingdelight.get_pudding_wip_2_title";
    public static final String GET_PUDDING_WIP_2_DESC = "advancement.bakingdelight.get_pudding_wip_2_desc";
    public static final String GET_ALL_PUDDING_TITLE = "advancement.bakingdelight.get_all_pudding_title";
    public static final String GET_ALL_PUDDING_DESC = "advancement.bakingdelight.get_all_pudding_desc";
    public static final String GET_MOUSSE_WIP_TITLE = "advancement.bakingdelight.get_mousse_wip_title";
    public static final String GET_MOUSSE_WIP_DESC = "advancement.bakingdelight.get_mousse_wip_desc";
    public static final String GET_ALL_MOUSSE_TITLE = "advancement.bakingdelight.get_all_mousse_title";
    public static final String GET_ALL_MOUSSE_DESC = "advancement.bakingdelight.get_all_mousse_desc";
    public static final String GET_CREAM_BUCKET_TITLE = "advancement.bakingdelight.get_cream_bucket_title";
    public static final String GET_CREAM_BUCKET_DESC = "advancement.bakingdelight.get_cream_bucket_desc";
    public static final String GET_BUTTER_TITLE = "advancement.bakingdelight.get_butter_title";
    public static final String GET_BUTTER_DESC = "advancement.bakingdelight.get_butter_desc";
    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement getWhisk = Advancement.Builder.create()
                .display(
                        ModItems.IRON_WHISK,
                        Text.translatable(GET_WHISK_TITLE),
                        Text.translatable(GET_WHISK_DESC),
                        new Identifier("textures/block/beehive_end.png"),
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("iron_whisk", InventoryChangedCriterion.Conditions.items(ModItems.IRON_WHISK))
                .criterion("wooden_whisk", InventoryChangedCriterion.Conditions.items(ModItems.WOODEN_WHISK))
                .criterion("stone_whisk", InventoryChangedCriterion.Conditions.items(ModItems.STONE_WHISK))
                .criterion("copper_whisk", InventoryChangedCriterion.Conditions.items(ModItems.COPPER_WHISK))
                .criterion("golden_whisk", InventoryChangedCriterion.Conditions.items(ModItems.GOLDEN_WHISK))
                .criterion("amethyst_whisk", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_WHISK))
                .criterion("diamond_whisk", InventoryChangedCriterion.Conditions.items(ModItems.DIAMOND_WHISK))
                .criterion("netherite_whisk", InventoryChangedCriterion.Conditions.items(ModItems.NETHERITE_WHISK))
                .requirements(new String[][]{new String[]{"iron_whisk","wooden_whisk","stone_whisk","copper_whisk","golden_whisk","amethyst_whisk","diamond_whisk","netherite_whisk"}})
                .build(consumer, Bakingdelight.MOD_ID + "/root");
        Advancement getAmethystTool = Advancement.Builder.create().parent(getWhisk)
                .display(
                        ModItems.AMETHYST_KNIFE,
                        Text.translatable(GET_AMETHYST_TOOL_TITLE),
                        Text.translatable(GET_AMETHYST_TOOL_DESC),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("amethyst_whisk", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_WHISK))
                .criterion("amethyst_sword", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_SWORD))
                .criterion("amethyst_pickaxe", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_PICKAXE))
                .criterion("amethyst_axe", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_AXE))
                .criterion("amethyst_shovel", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_SHOVEL))
                .criterion("amethyst_hoe", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_HOE))
                .criterion("amethyst_knife", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_KNIFE))
                .requirements(new String[][]{new String[]{"amethyst_whisk","amethyst_sword","amethyst_pickaxe","amethyst_axe","amethyst_shovel","amethyst_hoe","amethyst_knife"}})
                .build(consumer, Bakingdelight.MOD_ID + "/got_amethyst_tool");
        Advancement getNetheriteWhisk = Advancement.Builder.create().parent(getWhisk)
                .display(
                        ModItems.NETHERITE_WHISK,
                        Text.translatable(GET_NETHERITE_WHISK_TITLE),
                        Text.translatable(GET_NETHERITE_WHISK_DESC),
                        null,
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.experience(1000))
                .criterion("netherite_whisk", InventoryChangedCriterion.Conditions.items(ModItems.NETHERITE_WHISK))
                .build(consumer, Bakingdelight.MOD_ID + "/got_netherite_whisk");
        Advancement getCuttlebone = Advancement.Builder.create().parent(getAmethystTool)
                .display(
                        ModItems.CUTTLEBONE,
                        Text.translatable(GET_CUTTLEBONE_TITLE),
                        Text.translatable(GET_CUTTLEBONE_DESC),
                        null,
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("cuttlebone", InventoryChangedCriterion.Conditions.items(ModItems.CUTTLEBONE))
                .criterion("glow_cuttlebone", InventoryChangedCriterion.Conditions.items(ModItems.GLOW_CUTTLEBONE))
                .requirements(new String[][]{new String[]{"cuttlebone","glow_cuttlebone"}})
                .build(consumer, Bakingdelight.MOD_ID + "/got_cuttlebone");
        Advancement getTruffle = Advancement.Builder.create().parent(getWhisk)
                .display(
                        ModItems.BLACK_TRUFFLE,
                        Text.translatable(GET_TRUFFLE_TITLE),
                        Text.translatable(GET_TRUFFLE_DESC),
                        null,
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("black_truffle", InventoryChangedCriterion.Conditions.items(ModItems.BLACK_TRUFFLE))
                .criterion("white_truffle", InventoryChangedCriterion.Conditions.items(ModItems.WHITE_TRUFFLE))
                .requirements(new String[][]{new String[]{"black_truffle","white_truffle"}})
                .build(consumer, Bakingdelight.MOD_ID + "/got_truffle");
        Advancement getAllAmethyst = Advancement.Builder.create().parent(getAmethystTool)
                .display(
                        Items.AMETHYST_SHARD,
                        Text.translatable(GET_ALL_AMETHYST_TITLE),
                        Text.translatable(GET_ALL_AMETHYST_DESC),
                        null,
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("amethyst_whisk", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_WHISK))
                .criterion("amethyst_sword", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_SWORD))
                .criterion("amethyst_pickaxe", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_PICKAXE))
                .criterion("amethyst_axe", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_AXE))
                .criterion("amethyst_shovel", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_SHOVEL))
                .criterion("amethyst_hoe", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_HOE))
                .criterion("amethyst_knife", InventoryChangedCriterion.Conditions.items(ModItems.AMETHYST_KNIFE))
                .build(consumer, Bakingdelight.MOD_ID + "/got_all_amethyst");
        Advancement GetCherryBomb = Advancement.Builder.create().parent(getWhisk)
                .display(
                        ModItems.CHERRY,
                        Text.translatable(GET_CHERRY_BOMB_TITLE),
                        Text.translatable(GET_CHERRY_BOMB_DESC),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        false,
                        true
                )
                .criterion("cherry_bomb", InventoryChangedCriterion.Conditions.items(ModItems.CHERRY_BOMB))
                .build(consumer, Bakingdelight.MOD_ID + "/got_cherry_bomb");
        Advancement getGlassBowl = Advancement.Builder.create().parent(getWhisk)
                .display(
                        ModBlocks.GLASS_BOWL,
                        Text.translatable(GET_GLASS_BOWL_TITLE),
                        Text.translatable(GET_GLASS_BOWL_DESC),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("glass_bowl", InventoryChangedCriterion.Conditions.items(ModBlocks.GLASS_BOWL))
                .build(consumer, Bakingdelight.MOD_ID + "/got_glass_bowl");
        Advancement getMashedPotato = Advancement.Builder.create().parent(getGlassBowl)
                .display(
                        ModItems.MASHED_POTATO,
                        Text.translatable(GET_MASHED_POTATO_TITLE),
                        Text.translatable(GET_MASHED_POTATO_DESC),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        false,
                        false
                )
                .criterion("mashed_potato", InventoryChangedCriterion.Conditions.items(ModItems.MASHED_POTATO))
                .build(consumer, Bakingdelight.MOD_ID + "/got_mashed_potato");
        Advancement getPotatoStarch = Advancement.Builder.create().parent(getMashedPotato)
                .display(
                        ModItems.POTATO_STARCH,
                        Text.translatable(GET_POTATO_STARCH_TITLE),
                        Text.translatable(GET_POTATO_STARCH_DESC),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        false,
                        false
                )
                .criterion("potato_starch", InventoryChangedCriterion.Conditions.items(ModItems.POTATO_STARCH))
                .build(consumer, Bakingdelight.MOD_ID + "/got_potato_starch");
        Advancement getFreezer = Advancement.Builder.create().parent(getWhisk)
                .display(
                        ModBlocks.FREEZER,
                        Text.translatable(GET_FREEZER_TITLE),
                        Text.translatable(GET_FREEZER_DESC),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("freezer", InventoryChangedCriterion.Conditions.items(ModBlocks.FREEZER))
                .build(consumer, Bakingdelight.MOD_ID + "/got_freezer");
        Advancement getBlueIce = Advancement.Builder.create().parent(getFreezer)
                .display(
                        Items.BLUE_ICE,
                        Text.translatable(GET_BLUE_ICE_TITLE),
                        Text.translatable(GET_BLUE_ICE_DESC),
                        null,
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("blue_ice", InventoryChangedCriterion.Conditions.items(Items.BLUE_ICE))
                .build(consumer, Bakingdelight.MOD_ID + "/got_blue_ice");
        Advancement getOven = Advancement.Builder.create().parent(getWhisk)
                .display(
                        ModBlocks.OVEN,
                        Text.translatable(GET_OVEN_TITLE),
                        Text.translatable(GET_OVEN_DESC),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("oven", InventoryChangedCriterion.Conditions.items(ModBlocks.OVEN))
                .build(consumer, Bakingdelight.MOD_ID + "/got_oven");
        Advancement getEggTart = Advancement.Builder.create().parent(getOven)
                .display(
                        ModItems.EGG_TART,
                        Text.translatable(GET_EGG_TART_TITLE),
                        Text.translatable(GET_EGG_TART_DESC),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        false,
                        false
                )
                .criterion("egg_tart", InventoryChangedCriterion.Conditions.items(ModItems.EGG_TART))
                .build(consumer, Bakingdelight.MOD_ID + "/got_egg_tart");
        Advancement getPuddingWIP1 = Advancement.Builder.create().parent(getWhisk)
                .display(
                        ModItems.PUDDING_WIP_1,
                        Text.translatable(GET_PUDDING_WIP_1_TITLE),
                        Text.translatable(GET_PUDDING_WIP_1_DESC),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        false,
                        false
                )
                .criterion("pudding_wip_1", InventoryChangedCriterion.Conditions.items(ModItems.PUDDING_WIP_1))
                .build(consumer, Bakingdelight.MOD_ID + "/got_pudding_wip_1");
        Advancement getPuddingWIP2 = Advancement.Builder.create().parent(getPuddingWIP1)
                .display(
                        ModItems.PUDDING_WIP_2,
                        Text.translatable(GET_PUDDING_WIP_2_TITLE),
                        Text.translatable(GET_PUDDING_WIP_2_DESC),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        false,
                        false
                )
                .criterion("pudding_wip_2", InventoryChangedCriterion.Conditions.items(ModItems.PUDDING_WIP_2))
                .build(consumer, Bakingdelight.MOD_ID + "/got_pudding_wip_2");
        Advancement getAllPudding = Advancement.Builder.create().parent(getPuddingWIP2)
                .display(
                        ModItems.APPLE_PUDDING,
                        Text.translatable(GET_ALL_PUDDING_TITLE),
                        Text.translatable(GET_ALL_PUDDING_DESC),
                        null,
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("apple_pudding", InventoryChangedCriterion.Conditions.items(ModItems.APPLE_PUDDING))
                .criterion("matcha_pudding", InventoryChangedCriterion.Conditions.items(ModItems.MATCHA_PUDDING))
                .build(consumer, Bakingdelight.MOD_ID + "/got_all_pudding");
        Advancement getMousseWIP = Advancement.Builder.create().parent(getFreezer)
                .display(
                        ModItems.MOUSSE_WIP,
                        Text.translatable(GET_MOUSSE_WIP_TITLE),
                        Text.translatable(GET_MOUSSE_WIP_DESC),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        false,
                        false
                )
                .criterion("mousse_wip", InventoryChangedCriterion.Conditions.items(ModItems.MOUSSE_WIP))
                .build(consumer, Bakingdelight.MOD_ID + "/got_mousse_wip");
        Advancement getAllMousse = Advancement.Builder.create().parent(getMousseWIP)
                .display(
                        ModItems.CHERRY_MOUSSE,
                        Text.translatable(GET_ALL_MOUSSE_TITLE),
                        Text.translatable(GET_ALL_MOUSSE_DESC),
                        null,
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("cherry_mousse", InventoryChangedCriterion.Conditions.items(ModItems.CHERRY_MOUSSE))
                .criterion("chocolate_mousse", InventoryChangedCriterion.Conditions.items(ModItems.CHOCOLATE_MOUSSE))
                .criterion("cream_mousse", InventoryChangedCriterion.Conditions.items(ModItems.CREAM_MOUSSE))
                .criterion("golden_apple_mousse", InventoryChangedCriterion.Conditions.items(ModItems.GOLDEN_APPLE_MOUSSE))
                .criterion("matcha_mousse", InventoryChangedCriterion.Conditions.items(ModItems.MATCHA_MOUSSE))
                .criterion("pumpkin_mousse", InventoryChangedCriterion.Conditions.items(ModItems.PUMPKIN_MOUSSE))
                .build(consumer, Bakingdelight.MOD_ID + "/got_all_mousse");
        Advancement getCream = Advancement.Builder.create().parent(getGlassBowl)
                .display(
                        ModItems.CREAM_BUCKET,
                        Text.translatable(GET_CREAM_BUCKET_TITLE),
                        Text.translatable(GET_CREAM_BUCKET_DESC),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        false,
                        false
                )
                .criterion("cream", InventoryChangedCriterion.Conditions.items(ModItems.CREAM_BUCKET))
                .build(consumer, Bakingdelight.MOD_ID + "/got_cream");
        Advancement getButter = Advancement.Builder.create().parent(getCream)
                .display(
                        ModItems.BUTTER,
                        Text.translatable(GET_BUTTER_TITLE),
                        Text.translatable(GET_BUTTER_DESC),
                        null,
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("butter", InventoryChangedCriterion.Conditions.items(ModItems.BUTTER))
                .build(consumer, Bakingdelight.MOD_ID + "/got_butter");
    }
}
