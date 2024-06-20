package com.zombie_cute.mc.bakingdelight.gen;

import com.zombie_cute.mc.bakingdelight.BakingdelightClient;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.custom.BoxedCherriesBlock;
import com.zombie_cute.mc.bakingdelight.block.custom.FreezerBlock;
import com.zombie_cute.mc.bakingdelight.block.custom.abstracts.AbstractBatteryBlock;
import com.zombie_cute.mc.bakingdelight.block.entities.*;
import com.zombie_cute.mc.bakingdelight.compat.rei.baking_tray.BakingTrayCategory;
import com.zombie_cute.mc.bakingdelight.compat.rei.biogas_fermentation.BiogasFermentationCategory;
import com.zombie_cute.mc.bakingdelight.compat.rei.glass_bowl.GlassBowlMixWithWaterCategory;
import com.zombie_cute.mc.bakingdelight.compat.rei.glass_bowl.GlassBowlWhiskingCategory;
import com.zombie_cute.mc.bakingdelight.compat.rei.pizza.PizzaMakingCategory;
import com.zombie_cute.mc.bakingdelight.compat.rei.transform.OvenTransformCategory;
import com.zombie_cute.mc.bakingdelight.effects.ModEffectsAndPotions;
import com.zombie_cute.mc.bakingdelight.entity.ModEntities;
import com.zombie_cute.mc.bakingdelight.item.ModItemGroups;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
import com.zombie_cute.mc.bakingdelight.screen.custom.*;
import com.zombie_cute.mc.bakingdelight.util.ModUtil;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import org.jetbrains.annotations.NotNull;

public class ModLangCNGenerator extends FabricLanguageProvider {
    public ModLangCNGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(@NotNull TranslationBuilder translationBuilder) {
        translationBuilder.add(ModUtil.SHIFT_FRONT, "按住 ");
        translationBuilder.add(ModUtil.SHIFT_END, " 以查看概要");
        translationBuilder.add(ModUtil.WHISK_1, "一款搅拌器可以用于搅拌或打发食材");
        translationBuilder.add(ModUtil.WHISK_2, "或者...？用它来搅匀怪物的脑浆？");
        translationBuilder.add(ModUtil.BUTTER_1, "黏糊糊的质感...或许除了用于");
        translationBuilder.add(ModUtil.BUTTER_2, "制作食物另有其用？");
        translationBuilder.add(ModUtil.TRUFFLE, "可以在灰化土中找到");
        translationBuilder.add(ModUtil.CUTTLEBONE, "被紫水晶工具击杀时掉落");
        translationBuilder.add(ModUtil.FILTER_1, "一款由线织成的过滤器，可以");
        translationBuilder.add(ModUtil.FILTER_2, "放在木盆中用于过滤油和渣");
        translationBuilder.add(ModUtil.KNEADING_STICK, "打人与擀面兼备");
        translationBuilder.add(ModUtil.SPATULA, "可以搭配受热的烤盘一起使用来炒菜");
        translationBuilder.add(ModUtil.BDC_1, "它是构成沼气池的核心部件，当它下有一个平");
        translationBuilder.add(ModUtil.BDC_2, "整的完全密封的长方体区域时，这块区域就会");
        translationBuilder.add(ModUtil.BDC_3, "被自动的识别为沼气池的一部分。");
        translationBuilder.add(ModUtil.BDI_1, "当其下方存在一个工作的沼气池控制器时，它将被");
        translationBuilder.add(ModUtil.BDI_2, "激活，这时，你只需将任意的食物装入其中，他就");
        translationBuilder.add(ModUtil.BDI_3, "会开始发酵，并产生沼气。当它的侧面存在一个燃");
        translationBuilder.add(ModUtil.BDI_4, "气罐时，就可以为燃气罐充气。");
        translationBuilder.add(ModUtil.GAS_COOKING_STOVE_1, "当它的侧面有一个装有气体的燃气罐时，右键即可");
        translationBuilder.add(ModUtil.GAS_COOKING_STOVE_2, "有几率激活它。激活后，它可以加热其上方的方块，");
        translationBuilder.add(ModUtil.GAS_COOKING_STOVE_3, "烤盘，烤炉，高级熔炉均可兼容。");
        translationBuilder.add(ModUtil.CROWBAR, "物理学圣剑");
        translationBuilder.add(ModUtil.PIZZA_INGREDIENTS, "成分：");
        translationBuilder.add(ModUtil.BAKING_TRAY_1, "一款简易的小铁盘，可以用于升级高级熔炉，也可以用于炒菜：");
        translationBuilder.add(ModUtil.BAKING_TRAY_2, "在其下方有燃气灶为其加热的条件下，将食物放在烤盘的上方，");
        translationBuilder.add(ModUtil.BAKING_TRAY_3, "使用锅铲进行翻炒5次即可炒熟食物。");
        translationBuilder.add(ModUtil.DEEP_FRYER_1, "油炸锅可以用于油炸各种食物。倒入食用油，在其后方放置一个装有燃气的燃气罐时，");
        translationBuilder.add(ModUtil.DEEP_FRYER_2, "再按下它前方的按钮，它就会开始消耗燃气并加热，接着将食物加入其中就会开始油炸了，");
        translationBuilder.add(ModUtil.DEEP_FRYER_3, "对其按住Shift加右键可以查看其详细状态。");
        translationBuilder.add(ModUtil.WOODEN_BASIN_1, "一个可以用于榨取植物油的木盆，放入油料作物");
        translationBuilder.add(ModUtil.WOODEN_BASIN_2, "（如炒葵花籽）和过滤网，然后站在它上面跳跃就可以榨油了，");
        translationBuilder.add(ModUtil.WOODEN_BASIN_3, "你可以使用玻璃瓶或是桶来取出油。");
        translationBuilder.add(ModUtil.DFB, "用于安全无伤的取出油炸锅内的物品");


        translationBuilder.add(AdvanceFurnaceScreen.TOOLTIP,"点击以获取经验值");

        translationBuilder.add(GlassBowlBlockEntity.WHISK_FAIL, "这东西似乎不是搅拌器能处理的");
        translationBuilder.add(GlassBowlBlockEntity.NEED_BOWL, "你需要一个碗来盛出这些东西");
        translationBuilder.add(PizzaWIPBlockEntity.NEED_INGREDIENT, "你需要在这里放一个适当的食材");
        translationBuilder.add(PizzaWIPBlockEntity.NEED_CHEESE, "你需要在这里放一个奶酪");
        translationBuilder.add(FreezerBlock.FAIL_TO_OPEN, "冰箱的门被意外的阻挡了");

        translationBuilder.add(ModItems.WOODEN_WHISK, "木搅拌器");
        translationBuilder.add(ModItems.STONE_WHISK, "石搅拌器");
        translationBuilder.add(ModItems.COPPER_WHISK, "铜搅拌器");
        translationBuilder.add(ModItems.IRON_WHISK, "铁搅拌器");
        translationBuilder.add(ModItems.GOLDEN_WHISK, "金搅拌器");
        translationBuilder.add(ModItems.AMETHYST_WHISK, "紫水晶搅拌器");
        translationBuilder.add(ModItems.DIAMOND_WHISK, "钻石搅拌器");
        translationBuilder.add(ModItems.NETHERITE_WHISK, "下界合金搅拌器");

        translationBuilder.add(ModItems.COPPER_KNIFE, "铜刀");
        translationBuilder.add(ModItems.AMETHYST_KNIFE, "紫水晶刀");
        translationBuilder.add(ModItems.KNEADING_STICK, "擀面杖");
        translationBuilder.add(ModItems.CROWBAR, "撬棍");
        translationBuilder.add(ModItems.SPATULA, "锅铲");
        translationBuilder.add(ModItems.FILTER, "过滤网");

        translationBuilder.add(ModItems.EGG_TART, "蛋挞");
        translationBuilder.add(ModItems.APPLE_PUDDING, "苹果布丁");
        translationBuilder.add(ModItems.BRAISED_SHRIMP_BALL, "红烧虾球");
        translationBuilder.add(ModItems.MATCHA_PUDDING, "抹茶布丁");
        translationBuilder.add(ModItems.SUNFLOWER_SEED, "葵花籽");
        translationBuilder.add(ModItems.SUNFLOWER_SEED_PEEL, "葵花籽皮");
        translationBuilder.add(ModItems.SUNFLOWER_SEED_PULP, "葵花籽肉");
        translationBuilder.add(ModItems.ROASTED_SUNFLOWER_SEED, "炒葵花籽");
        translationBuilder.add(ModItems.OIL_IMPURITY, "油渣");
        translationBuilder.add(ModItems.VEGETABLE_OIL_BOTTLE, "植物油瓶");
        translationBuilder.add(ModItems.VEGETABLE_OIL_BUCKET, "植物油桶");

        translationBuilder.add(ModItems.TRUFFLE_EGG_TART, "松露蛋挞");
        translationBuilder.add(ModItems.PUDDING_WIP_1, "布丁（半成品）");
        translationBuilder.add(ModItems.PUDDING_WIP_2, "布丁（半成品）");

        translationBuilder.add(ModItems.POTATO_STARCH, "马铃薯淀粉");
        translationBuilder.add(ModItems.MIXED_DOUGH, "混合面团");
        translationBuilder.add(ModItems.WHEAT_FLOUR, "小麦粉");
        translationBuilder.add(ModBlocks.WHEAT_DOUGH, "小麦面团");

        translationBuilder.add(ModItems.BLACK_PEPPER_CORN, "黑胡椒粒");
        translationBuilder.add(ModItems.BLACK_PEPPER_DUST, "黑胡椒粉");

        translationBuilder.add(ModItems.MASHED_POTATO, "土豆泥");
        translationBuilder.add(ModItems.SAUCE_MASHED_POTATO, "酱汁土豆泥");
        translationBuilder.add(ModBlocks.MASHED_POTATO_BLOCK, "土豆泥块");

        translationBuilder.add(ModItems.APPLE_PETAL, "苹果片");
        translationBuilder.add(ModItems.CHERRY, "樱桃");
        translationBuilder.add(ModItems.CHERRY_BOMB, "樱桃");
        translationBuilder.add(ModItems.BUTTER, "黄油");
        translationBuilder.add(ModItems.CHEESE, "奶酪");

        translationBuilder.add(ModItems.BREAD_SLICE, "面包片");
        translationBuilder.add(ModItems.BUTTER_BREAD_SLICE, "黄油面包片");

        translationBuilder.add(ModItems.CREAM_BUCKET, "奶油桶");
        translationBuilder.add(ModItems.CREAM, "奶油");
        translationBuilder.add(ModItems.APPLE_CREAM, "苹果奶油");
        translationBuilder.add(ModItems.CHERRY_CREAM, "樱桃奶油");
        translationBuilder.add(ModItems.CHOCOLATE_CREAM, "巧克力奶油");
        translationBuilder.add(ModItems.PRAWN, "对虾");
        translationBuilder.add(ModItems.GOLDEN_APPLE_CREAM, "金苹果奶油");
        translationBuilder.add(ModItems.MATCHA_CREAM, "抹茶奶油");
        translationBuilder.add(ModItems.PUMPKIN_CREAM, "南瓜奶油");

        translationBuilder.add(ModItems.MOUSSE_WIP, "慕斯（半成品）");
        translationBuilder.add(ModItems.CREAM_MOUSSE, "奶油慕斯");
        translationBuilder.add(ModItems.CHERRY_MOUSSE, "樱桃慕斯");
        translationBuilder.add(ModItems.CHOCOLATE_MOUSSE, "巧克力慕斯");
        translationBuilder.add(ModItems.PUMPKIN_MOUSSE, "南瓜慕斯");
        translationBuilder.add(ModItems.GOLDEN_APPLE_MOUSSE, "金苹果慕斯");
        translationBuilder.add(ModItems.MATCHA_MOUSSE, "抹茶慕斯");

        translationBuilder.add(ModItems.CRYSTAL_DUMPLING, "水晶饺子");

        translationBuilder.add(ModItems.SQUID, "鱿鱼");
        translationBuilder.add(ModItems.ROASTED_SQUID, "烤鱿鱼");
        translationBuilder.add(ModItems.CUTTLEBONE, "鱿鱼骨");
        translationBuilder.add(ModItems.GLOW_SQUID, "发光鱿鱼");
        translationBuilder.add(ModItems.ROASTED_GLOW_SQUID, "烤发光鱿鱼");
        translationBuilder.add(ModItems.GLOW_CUTTLEBONE, "发光鱿鱼骨");

        translationBuilder.add(ModItems.SAUSAGE, "香肠");
        translationBuilder.add(ModItems.SECTIONED_SAUSAGE, "切片香肠");
        translationBuilder.add(ModItems.GRILLED_SAUSAGE, "烤香肠");
        translationBuilder.add(ModItems.STARCH_SAUSAGE, "淀粉肠");
        translationBuilder.add(ModItems.GRILLED_STARCH_SAUSAGE, "烤淀粉肠");
        translationBuilder.add(ModItems.LITTLE_OCTOPUS_SAUSAGE, "小章鱼香肠");

        translationBuilder.add(ModItems.BLACK_TRUFFLE, "黑松露");
        translationBuilder.add(ModItems.WHITE_TRUFFLE, "白松露");
        translationBuilder.add(ModItems.ICE_BRICK, "冰砖");

        translationBuilder.add(ModItems.SILICON_INGOT, "硅锭");
        translationBuilder.add(ModBlocks.SILICON_BLOCK, "硅块");
        translationBuilder.add(ModItems.SILICON_COMPONENT, "硅构件");
        translationBuilder.add(ModItems.REDSTONE_COMPONENT, "红石构件");
        translationBuilder.add(ModItems.DIAMOND_COMPONENT, "钻石构件");

        translationBuilder.add(ModItems.AMETHYST_SWORD, "紫水晶剑");
        translationBuilder.add(ModItems.AMETHYST_PICKAXE, "紫水晶镐");
        translationBuilder.add(ModItems.AMETHYST_AXE, "紫水晶斧");
        translationBuilder.add(ModItems.AMETHYST_SHOVEL, "紫水晶锹");
        translationBuilder.add(ModItems.AMETHYST_HOE, "紫水晶锄");

        translationBuilder.add(ModItems.EMPTY_CAKE, "饼皮");
        translationBuilder.add(ModItems.BLUE_ORCHID_FLOWER_CAKE, "兰花饼");
        translationBuilder.add(ModItems.CHERRY_CAKE, "樱桃饼");
        translationBuilder.add(ModItems.LILAC_CAKE, "丁香饼");
        translationBuilder.add(ModItems.ORANGE_TULIP_CAKE, "橙色郁金香饼");
        translationBuilder.add(ModItems.OXEYE_DAISY_CAKE, "滨菊饼");
        translationBuilder.add(ModItems.PINK_TULIP_CAKE, "粉色郁金香饼");
        translationBuilder.add(ModItems.ROSE_CAKE, "玫瑰饼");
        translationBuilder.add(ModItems.SUNFLOWER_CAKE, "向日葵饼");
        translationBuilder.add(ModItems.WHITE_TULIP_CAKE, "白色郁金香饼");
        translationBuilder.add(ModItems.WITHER_ROSE_CAKE, "凋灵玫瑰饼");

        translationBuilder.add(ModItems.RAW_ONION_RING, "生洋葱圈");
        translationBuilder.add(ModItems.ONION_RING, "鸡肉洋葱圈");
        translationBuilder.add(ModItems.FRIED_COD, "油炸鳕鱼");
        translationBuilder.add(ModItems.FRIED_SALMON, "油炸鲑鱼");
        translationBuilder.add(ModItems.FRIED_MILK_WIP, "油炸牛奶（半成品）");
        translationBuilder.add(ModItems.FRIED_MILK, "油炸牛奶");
        translationBuilder.add(ModItems.FRIED_APPLE, "油炸苹果");
        translationBuilder.add(ModItems.RAW_POTATO_CHIP, "生土豆片");
        translationBuilder.add(ModItems.POTATO_CHIP, "薯片");
        translationBuilder.add(ModItems.CHEESE_BALL, "起司球");
        translationBuilder.add(ModItems.FRIED_DOUGH_STICK, "油条");
        translationBuilder.add(ModItems.RAW_CHICKEN_FILLET, "生鸡柳");
        translationBuilder.add(ModItems.CHICKEN_FILLET, "炸鸡柳");

        translationBuilder.add(ModEntities.BUTTER,"黄油");
        translationBuilder.add(ModEntities.CHERRY_BOMB,"樱桃");

        translationBuilder.add(ModBlocks.PIZZA, "披萨");
        translationBuilder.add(ModBlocks.RAW_PIZZA, "生披萨");
        translationBuilder.add(ModBlocks.PIZZA_WIP, "披萨（半成品）");
        translationBuilder.add(ModItems.ANCIENT_SCRAP, "远古残片");

        translationBuilder.add(ModBlocks.GLASS_BOWL, "玻璃碗");
        translationBuilder.add(GlassBowlWhiskingCategory.GLASS_BOWL_NAME, "搅拌");
        translationBuilder.add(GlassBowlMixWithWaterCategory.WATER_GLASS_BOWL_NAME,"与水混合");
        translationBuilder.add(ModBlocks.OVEN, "烤炉");
        translationBuilder.add(ModBlocks.ADVANCE_FURNACE, "高级熔炉");
        translationBuilder.add(AdvanceFurnaceBlockEntity.ADVANCE_FURNACE_NAME, "高级熔炉");
        translationBuilder.add(ModBlocks.BAKING_TRAY, "烤盘");
        translationBuilder.add(OvenBlockEntity.OVEN_NAME, "烘焙");
        translationBuilder.add(ModBlocks.FREEZER, "冰柜");
        translationBuilder.add(FreezerBlockEntity.FREEZER_NAME, "冷藏");
        translationBuilder.add(PizzaMakingCategory.PIZZA_TITLE, "制作披萨");
        translationBuilder.add(OvenTransformCategory.TRANSFORM_TITLE, "世界交互");
        translationBuilder.add(ModBlocks.DEEP_FRYER, "油炸锅");
        translationBuilder.add(BakingTrayCategory.BAKING_TRAY_NAME, "炒菜");
        translationBuilder.add(ModBlocks.WOODEN_BASIN, "木盆");
        translationBuilder.add(WoodenBasinBlockEntity.WOODEN_BASIN_NAME, "榨油");
        translationBuilder.add(ModBlocks.GAS_CANISTER, "燃气罐");
        translationBuilder.add(GasCanisterBlockEntity.GAS_CANISTER_NAME, "储气量");
        translationBuilder.add(ModBlocks.BIOGAS_DIGESTER_CONTROLLER, "沼气池控制器");
        translationBuilder.add(BiogasDigesterControllerScreen.UNAVAILABLE, "控制器下方的空间不完整、不封闭或者过大");
        translationBuilder.add(BiogasDigesterControllerScreen.SIZE, "控制器下方的空间的大小");
        translationBuilder.add(BiogasDigesterControllerScreen.GAS_VALUE, "当前的储气量");
        translationBuilder.add(BiogasDigesterControllerScreen.MAX_GAS_VALUE, "沼气池的最大储气量");
        translationBuilder.add(ModBlocks.BIOGAS_DIGESTER_IO, "沼气池输入输出接口");
        translationBuilder.add(BiogasDigesterIOScreen.UNAVAILABLE, "此接口下方的方块不是控制器，或者控制器不可用");
        translationBuilder.add(BiogasFermentationCategory.BIOGAS_FERMENTATION_NAME, "沼气发酵");
        translationBuilder.add(BiogasFermentationCategory.FOOD, "任意食物");
        translationBuilder.add(ModBlocks.BURNING_GAS_COOKING_STOVE, "燃烧中的燃气灶");
        translationBuilder.add(ModBlocks.GAS_COOKING_STOVE, "燃气灶");
        translationBuilder.add(ModBlocks.DEEP_FRY_BASKET, "油炸篮");
        translationBuilder.add(DeepFryerBlockEntity.DEEP_FRYER_NAME, "油炸");
        translationBuilder.add(DeepFryerBlockEntity.ADD_OIL, "你需要向其中加入食用油");
        translationBuilder.add(DeepFryerBlockEntity.TOO_HOT, "太烫了！请用油炸篮来取物");
        translationBuilder.add(ModBlocks.KITCHEN_UTENSIL_HOLDER, "厨具架");
        translationBuilder.add(ModBlocks.CUISINE_TABLE, "料理台");
        translationBuilder.add(CuisineTableBlockEntity.CUISINE_TABLE_NAME, "烹饪");
        translationBuilder.add(ModBlocks.ANDESITE_CABINET, "安山岩橱柜");
        translationBuilder.add(ModBlocks.DIORITE_CABINET, "闪长岩橱柜");
        translationBuilder.add(ModBlocks.GRANITE_CABINET, "花岗岩橱柜");
        translationBuilder.add(ModBlocks.BLACKSTONE_CABINET, "黑石橱柜");
        translationBuilder.add(ModBlocks.BASALT_CABINET, "玄武岩橱柜");
        translationBuilder.add(ModBlocks.DEEPSLATE_CABINET, "深板岩橱柜");
        translationBuilder.add(ModBlocks.OBSIDIAN_CABINET, "黑曜石橱柜");
        translationBuilder.add(CabinetBlockEntity.CABINET_NAME, "橱柜");
        translationBuilder.add(PhotovoltaicGeneratorBlockEntity.PHOTOVOLTAIC_GENERATOR_NAME, "光伏发电");
        translationBuilder.add(ModBlocks.PHOTOVOLTAIC_GENERATOR, "光伏发电机");
        translationBuilder.add(PhotovoltaicGeneratorScreen.GREEN_TIP_1, "高效率模式：");
        translationBuilder.add(PhotovoltaicGeneratorScreen.GREEN_TIP_2, "仅限白天且露天时启动");
        translationBuilder.add(PhotovoltaicGeneratorScreen.GREEN_TIP_3, " ");
        translationBuilder.add(PhotovoltaicGeneratorScreen.YELLOW_TIP_1, "低效率模式：");
        translationBuilder.add(PhotovoltaicGeneratorScreen.YELLOW_TIP_2, "附近有足够的光照时启动");
        translationBuilder.add(PhotovoltaicGeneratorScreen.YELLOW_TIP_3, " ");
        translationBuilder.add(ModBlocks.GAS_PIPE, "燃气管道");
        translationBuilder.add(ModBlocks.AC_DC_CONVERTER, "交流/直流转换器");
        translationBuilder.add(ModBlocks.FAN_BLADE_ITEM, "风力发电机叶片");
        translationBuilder.add(ModBlocks.WIND_TURBINE_CONTROLLER, "风力发电机控制器");
        translationBuilder.add(ModBlocks.SIMPLE_BATTERY, "简易电池");
        translationBuilder.add(ModBlocks.INTERMEDIATE_BATTERY, "中级电池");
        translationBuilder.add(ModBlocks.ADVANCE_BATTERY, "高级电池");
        translationBuilder.add(ModBlocks.DIMENSION_BATTERY, "维度电池");
        translationBuilder.add(AbstractBatteryBlock.TOOLTIP_TEXT, "电量：");
        translationBuilder.add(ModBlocks.STERLING_ENGINE_ITEM, "斯特林引擎");
        translationBuilder.add(ModBlocks.FARADAY_GENERATOR, "法拉第发电机");
        translationBuilder.add(ACDCConverterScreen.SPEED_NAME, "工作速度");
        translationBuilder.add(ModBlocks.TESLA_COIL, "特斯拉线圈");
        translationBuilder.add(ModBlocks.ELECTRICIANS_DESK, "电工台");
        translationBuilder.add(ModBlocks.BOXED_CHERRIES, "箱装樱桃");
        translationBuilder.add(BoxedCherriesBlock.TIP, "你需要至少32个火药来激活它");
        translationBuilder.add(ModBlocks.BAMBOO_COVER, "竹蒸笼盖");
        translationBuilder.add(ModBlocks.BAMBOO_GRATE, "竹蒸笼箅");
        translationBuilder.add(BambooGrateBlockEntity.NAME, "竹蒸笼");

        translationBuilder.add("death.attack.bakingdelight_electroshock","%1$s 触电身亡！");

        translationBuilder.add(ModBlocks.CREAM_FLUID_BLOCK, "奶油");
        translationBuilder.add(ModBlocks.VEGETABLE_OIL_FLUID_BLOCK, "植物油");

        translationBuilder.add(ModEffectsAndPotions.STICKY,"黏糊糊");

        translationBuilder.add("item.minecraft.potion.effect.sticky_potion","黏脚药水");
        translationBuilder.add("item.minecraft.potion.effect.sticky_long_potion","黏脚药水");
        translationBuilder.add("item.minecraft.potion.effect.squid_power_potion","鱿鱼药水");
        translationBuilder.add("item.minecraft.potion.effect.squid_power_long_potion","鱿鱼药水");
        translationBuilder.add("item.minecraft.potion.effect.squid_power_strong_potion","鱿鱼药水");
        translationBuilder.add("item.minecraft.potion.effect.glow_squid_power_potion","发光鱿鱼药水");
        translationBuilder.add("item.minecraft.potion.effect.glow_squid_power_long_potion","发光鱿鱼药水");
        translationBuilder.add("item.minecraft.potion.effect.glow_squid_power_strong_potion","发光鱿鱼药水");
        translationBuilder.add("item.minecraft.splash_potion.effect.sticky_potion","喷溅型黏脚药水");
        translationBuilder.add("item.minecraft.splash_potion.effect.sticky_long_potion","喷溅型黏脚药水");
        translationBuilder.add("item.minecraft.splash_potion.effect.squid_power_potion","喷溅型鱿鱼药水");
        translationBuilder.add("item.minecraft.splash_potion.effect.squid_power_long_potion","喷溅型鱿鱼药水");
        translationBuilder.add("item.minecraft.splash_potion.effect.squid_power_strong_potion","喷溅型鱿鱼药水");
        translationBuilder.add("item.minecraft.splash_potion.effect.glow_squid_power_potion","喷溅型发光鱿鱼药水");
        translationBuilder.add("item.minecraft.splash_potion.effect.glow_squid_power_long_potion","喷溅型发光鱿鱼药水");
        translationBuilder.add("item.minecraft.splash_potion.effect.glow_squid_power_strong_potion","喷溅型发光鱿鱼药水");
        translationBuilder.add("item.minecraft.lingering_potion.effect.sticky_potion","滞留型黏脚药水");
        translationBuilder.add("item.minecraft.lingering_potion.effect.sticky_long_potion","滞留型黏脚药水");
        translationBuilder.add("item.minecraft.lingering_potion.effect.squid_power_potion","滞留型鱿鱼药水");
        translationBuilder.add("item.minecraft.lingering_potion.effect.squid_power_long_potion","滞留型鱿鱼药水");
        translationBuilder.add("item.minecraft.lingering_potion.effect.squid_power_strong_potion","滞留型鱿鱼药水");
        translationBuilder.add("item.minecraft.lingering_potion.effect.glow_squid_power_potion","滞留型发光鱿鱼药水");
        translationBuilder.add("item.minecraft.lingering_potion.effect.glow_squid_power_long_potion","滞留型发光鱿鱼药水");
        translationBuilder.add("item.minecraft.lingering_potion.effect.glow_squid_power_strong_potion","滞留型发光鱿鱼药水");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.sticky_potion","黏脚之箭");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.sticky_long_potion","黏脚之箭");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.squid_power_potion","鱿鱼之箭");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.squid_power_long_potion","鱿鱼之箭");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.squid_power_strong_potion","鱿鱼之箭");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.glow_squid_power_potion","发光鱿鱼之箭");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.glow_squid_power_long_potion","发光鱿鱼之箭");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.glow_squid_power_strong_potion","发光鱿鱼之箭");

        translationBuilder.add(ModItemGroups.GROUPS_TAB_NAME, "现代厨房");

        translationBuilder.add("sounds.bakingdelight.entity_butter_hit", "黄油：击中");
        translationBuilder.add("sounds.bakingdelight.entity_butter_shoot", "黄油：发射");
        translationBuilder.add("sounds.bakingdelight.entity_cherry_bomb_explosion", "樱桃：爆炸");
        translationBuilder.add("sounds.bakingdelight.entity_cherry_bomb_shoot", "樱桃：发射");
        translationBuilder.add("sounds.bakingdelight.block_freezer_running", "冰箱：运行");
        translationBuilder.add("sounds.bakingdelight.block_freezer_open", "冰箱：打开");
        translationBuilder.add("sounds.bakingdelight.block_freezer_close", "冰箱：关闭");
        translationBuilder.add("sounds.bakingdelight.block_glass_bowl_whisking", "物品: 被搅拌");
        translationBuilder.add("sounds.bakingdelight.block_food_frying", "食物: 煎炸");
        translationBuilder.add("sounds.bakingdelight.item_crowbar_hit", "撬棍: 击打");
        translationBuilder.add("sounds.bakingdelight.item_crowbar_attack", "撬棍: 击中生物");
        translationBuilder.add("sounds.bakingdelight.block_gas_canister_filling", "燃气罐: 填充");
        translationBuilder.add("sounds.bakingdelight.block_gas_cooking_stove_ignite", "燃气灶：尝试点燃");
        translationBuilder.add("sounds.bakingdelight.block_sterling_engine", "斯特林引擎：运行");
        translationBuilder.add("sounds.bakingdelight.block_tesla_coil", "特斯拉线圈：电击");

        translationBuilder.add(BakingdelightClient.ORE_UI_DARK, "Ore UI 风格资源包（深色）");
        translationBuilder.add(BakingdelightClient.ORE_UI_BRIGHT, "Ore UI 风格资源包（浅色）");

        translationBuilder.add(ModAdvancementGenerator.GET_WHISK_TITLE, "真相就是搅拌器");
        translationBuilder.add(ModAdvancementGenerator.GET_WHISK_DESC, "合成一把搅拌器来开始你新的厨房之旅");
        translationBuilder.add(ModAdvancementGenerator.GET_AMETHYST_TOOL_TITLE, "亮晶晶!");
        translationBuilder.add(ModAdvancementGenerator.GET_AMETHYST_TOOL_DESC, "合成一把紫水晶工具");
        translationBuilder.add(ModAdvancementGenerator.GET_NETHERITE_WHISK_TITLE, "啊?!");
        translationBuilder.add(ModAdvancementGenerator.GET_NETHERITE_WHISK_DESC, "合成一把下界合金搅拌器或者滚出厨房");
        translationBuilder.add(ModAdvancementGenerator.GET_CUTTLEBONE_TITLE, "比牛奶更好！");
        translationBuilder.add(ModAdvancementGenerator.GET_CUTTLEBONE_DESC, "获得鱿鱼骨");
        translationBuilder.add(ModAdvancementGenerator.GET_TRUFFLE_TITLE, "掘地三尺");
        translationBuilder.add(ModAdvancementGenerator.GET_TRUFFLE_DESC, "找到松露");
        translationBuilder.add(ModAdvancementGenerator.GET_ALL_AMETHYST_TITLE, "紫水晶爱好者");
        translationBuilder.add(ModAdvancementGenerator.GET_ALL_AMETHYST_DESC, "拥有所有的紫水晶工具");
        translationBuilder.add(ModAdvancementGenerator.GET_CHERRY_BOMB_TITLE, "轰！");
        translationBuilder.add(ModAdvancementGenerator.GET_CHERRY_BOMB_DESC, "✧(≖ ◡ ≖✿)");
        translationBuilder.add(ModAdvancementGenerator.GET_GLASS_BOWL_TITLE, "轻拿轻放");
        translationBuilder.add(ModAdvancementGenerator.GET_GLASS_BOWL_DESC, "小心别把这碗弄碎了");
        translationBuilder.add(ModAdvancementGenerator.GET_MASHED_POTATO_TITLE, "粉嫩质感");
        translationBuilder.add(ModAdvancementGenerator.GET_MASHED_POTATO_DESC, "将马铃薯放入玻璃碗，再用搅拌器搅拌即可获得土豆泥");
        translationBuilder.add(ModAdvancementGenerator.GET_POTATO_STARCH_TITLE, "搅得稀碎");
        translationBuilder.add(ModAdvancementGenerator.GET_POTATO_STARCH_DESC, "将土豆泥放入玻璃碗，再用搅拌器搅拌即可获得马铃薯淀粉");
        translationBuilder.add(ModAdvancementGenerator.GET_FREEZER_TITLE, "冷静！");
        translationBuilder.add(ModAdvancementGenerator.GET_FREEZER_DESC, "多棒的冰柜啊，它居然需要“烧”冰");
        translationBuilder.add(ModAdvancementGenerator.GET_BLUE_ICE_TITLE, "最佳“燃料”");
        translationBuilder.add(ModAdvancementGenerator.GET_BLUE_ICE_DESC, "这绝对是冰柜的好帮手");
        translationBuilder.add(ModAdvancementGenerator.GET_OVEN_TITLE, "“热”门话题");
        translationBuilder.add(ModAdvancementGenerator.GET_OVEN_DESC, "烤炉会帮你烘焙更棒的美食");
        translationBuilder.add(ModAdvancementGenerator.GET_EGG_TART_TITLE, "甜蜜蜜！");
        translationBuilder.add(ModAdvancementGenerator.GET_EGG_TART_DESC, "依次将奶油、混合面团、鸡蛋和糖放入烤炉来制作蛋挞");
        translationBuilder.add(ModAdvancementGenerator.GET_PUDDING_WIP_1_TITLE, "布丁：第一步");
        translationBuilder.add(ModAdvancementGenerator.GET_PUDDING_WIP_1_DESC, "按照进度来做，相信你会做好布丁的");
        translationBuilder.add(ModAdvancementGenerator.GET_PUDDING_WIP_2_TITLE, "布丁：第二步");
        translationBuilder.add(ModAdvancementGenerator.GET_PUDDING_WIP_2_DESC, "将4个布丁（半成品）放入烤炉");
        translationBuilder.add(ModAdvancementGenerator.GET_ALL_PUDDING_TITLE, "Q弹！");
        translationBuilder.add(ModAdvancementGenerator.GET_ALL_PUDDING_DESC, "将烘焙过布丁放在冰箱的中格，两侧放入对应口味的食材，你将得到真正的布丁");
        translationBuilder.add(ModAdvancementGenerator.GET_MOUSSE_WIP_TITLE, "慕斯：第一步");
        translationBuilder.add(ModAdvancementGenerator.GET_MOUSSE_WIP_DESC, "按照进度来做，相信你会做好慕斯的");
        translationBuilder.add(ModAdvancementGenerator.GET_ALL_MOUSSE_TITLE, "好松软！");
        translationBuilder.add(ModAdvancementGenerator.GET_ALL_MOUSSE_DESC, "将慕斯（半成品）放在冰箱的中格，两侧放入对应口味的食材，你将得到真正的慕斯");
        translationBuilder.add(ModAdvancementGenerator.GET_CREAM_BUCKET_TITLE, "黏糊糊的奶");
        translationBuilder.add(ModAdvancementGenerator.GET_CREAM_BUCKET_DESC, "将奶桶放入玻璃碗，再用搅拌器搅拌即可获得奶油桶");
        translationBuilder.add(ModAdvancementGenerator.GET_BUTTER_TITLE, "甜而粘口");
        translationBuilder.add(ModAdvancementGenerator.GET_BUTTER_DESC, "将奶油放入玻璃碗，再用搅拌器搅拌即可获得黄油");
        translationBuilder.add("advancement.bakingdelight.get_start_desc", "在吃完这一块面包后，是否觉得它太过于平庸了？是时候准备一些全新的食物了！");
        translationBuilder.add("advancement.bakingdelight.get_kneading_stick.title", "李奶奶的擀面杖");
        translationBuilder.add("advancement.bakingdelight.get_kneading_stick.desc", "其实只是一根普通的木头棒子罢");
        translationBuilder.add("advancement.bakingdelight.get_wheat_flour.title", "做更好的面包");
        translationBuilder.add("advancement.bakingdelight.get_wheat_flour.desc", "搅拌小麦以获得小麦粉");
        translationBuilder.add("advancement.bakingdelight.get_wheat_dough.title", "一大坨");
        translationBuilder.add("advancement.bakingdelight.get_wheat_dough.desc", "将水倒入玻璃碗中，加入小麦粉，揉成面团！你可以用揉面棒将它擀平，也可以去烤面包");
        translationBuilder.add("advancement.bakingdelight.get_raw_pizza.title", "准备开业！");
        translationBuilder.add("advancement.bakingdelight.get_raw_pizza.desc", "首先，在擀平的面团中加入奶酪，然后加入5种你喜欢的食材，最后加入一个奶酪");
        translationBuilder.add("advancement.bakingdelight.get_pizza.title", "披萨！");
        translationBuilder.add("advancement.bakingdelight.get_pizza.desc", "按照黑胡椒粉、糖、黑胡椒粉、生披萨的顺序放入烤炉");
        translationBuilder.add("advancement.bakingdelight.get_black_pepper.title", "箱底之下");
        translationBuilder.add("advancement.bakingdelight.get_black_pepper.desc", "在村民家中或遗迹中发现新作物");
        translationBuilder.add("advancement.bakingdelight.get_cheese.title", "一点都不酸");
        translationBuilder.add("advancement.bakingdelight.get_cheese.desc", "将奶放入烤炉中去煮");
        translationBuilder.add("advancement.bakingdelight.get_advance_furnace.title", "四倍速");
        translationBuilder.add("advancement.bakingdelight.get_advance_furnace.desc", "合成一个高级熔炉，它比普通熔炉快四倍！");
        translationBuilder.add("advancement.bakingdelight.get_baking_tray.title", "不只是一个“烤”盘");
        translationBuilder.add("advancement.bakingdelight.get_baking_tray.desc", "它可以被放在高级熔炉里面来升级你的炉子");
        translationBuilder.add("advancement.bakingdelight.get_crowbar.title", "统治物理学");
        translationBuilder.add("advancement.bakingdelight.get_crowbar.desc", "一个超棒的工具好吗？既可以右键降级烤炉，还可以右键快速破坏门窗。记住千万不要拿他打人");
        translationBuilder.add("advancement.bakingdelight.wooden_basin.title", "不是洗脸盆！");
        translationBuilder.add("advancement.bakingdelight.wooden_basin.desc", "显然它是用来榨油的工具");
        translationBuilder.add("advancement.bakingdelight.filter.title", "开始劳苦的一生");
        translationBuilder.add("advancement.bakingdelight.filter.desc", "把过滤器和炒制的油料作物（例如葵花籽）放入木盆，并用脚踩木盆来榨油");
        translationBuilder.add("advancement.bakingdelight.vegetable_oil.title", "第一桶油");
        translationBuilder.add("advancement.bakingdelight.vegetable_oil.desc", "恭喜你你离油炸食物已经不远啦");
        translationBuilder.add("advancement.bakingdelight.deep_fryer.title", "煎熬（对食物而言）");
        translationBuilder.add("advancement.bakingdelight.deep_fryer.desc", "右键倒入油或存入或取出物品，潜行加右键可查看其状态。它必须在有油和有燃气罐连接的情况下才能工作");
        translationBuilder.add("advancement.bakingdelight.deep_fry_basket.title", "当心热油烫手");
        translationBuilder.add("advancement.bakingdelight.deep_fry_basket.desc", "记得用油炸篮来从油炸锅中取物，当心油锅杀人事件");
        translationBuilder.add("advancement.bakingdelight.all_fried.title", "完全煎炸");
        translationBuilder.add("advancement.bakingdelight.all_fried.desc", "品尝所有的油炸食品！");
        translationBuilder.add("advancement.bakingdelight.wither_rose_cake.title", "绽放与终结");
        translationBuilder.add("advancement.bakingdelight.wither_rose_cake.desc", "吃下凋灵玫瑰饼，然后好好思考你的人生");
        translationBuilder.add("advancement.bakingdelight.bdc_bdi.title", "沼气工业");
        translationBuilder.add("advancement.bakingdelight.bdc_bdi.desc", "合成一个沼气池控制器和沼气池输入输出接口。记得看清它们的使用说明，然后建造你的沼气发酵池吧");
        translationBuilder.add("advancement.bakingdelight.gas_canister.title", "再靠近一点就会爆炸！");
        translationBuilder.add("advancement.bakingdelight.gas_canister.desc", "它可以从沼气池输入输出接口那里装载气体，也可以为燃气灶供气。不过记住一定要注意安全！");
        translationBuilder.add("advancement.bakingdelight.gas_cooking_stove.title", "另起炉灶");
        translationBuilder.add("advancement.bakingdelight.gas_cooking_stove.desc", "燃气灶可以加热很多东西，包括你自己");
        translationBuilder.add("advancement.bakingdelight.spatula.title", "炒菜时间到！");
        translationBuilder.add("advancement.bakingdelight.spatula.desc", "对一个烤盘用燃气灶加热，这时往它上面放入食材再拿锅铲翻炒即可炒菜");
        translationBuilder.add("advancement.bakingdelight.kuh.title", "美化厨房");
        translationBuilder.add("advancement.bakingdelight.kuh.desc", "合成一个厨具架");
        translationBuilder.add("advancement.bakingdelight.cuisine_table.title", "分解一切");
        translationBuilder.add("advancement.bakingdelight.cuisine_table.desc", "合成一个料理台, 上面的槽位放工具，下面的槽放物品，你能分解很多东西！");
    }
}
