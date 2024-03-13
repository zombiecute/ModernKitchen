package com.zombie_cute.mc.bakingdelight.gen;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.entities.FreezerBlockEntity;
import com.zombie_cute.mc.bakingdelight.block.entities.GlassBowlBlockEntity;
import com.zombie_cute.mc.bakingdelight.block.entities.OvenBlockEntity;
import com.zombie_cute.mc.bakingdelight.compat.glass_bowl.GlassBowlCategory;
import com.zombie_cute.mc.bakingdelight.item.ModItemGroups;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
import com.zombie_cute.mc.bakingdelight.item.custom.ButterItem;
import com.zombie_cute.mc.bakingdelight.item.custom.CuttleboneItem;
import com.zombie_cute.mc.bakingdelight.item.custom.TruffleItem;
import com.zombie_cute.mc.bakingdelight.item.custom.WhiskItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import org.jetbrains.annotations.NotNull;

public class ModLangCNGenerator extends FabricLanguageProvider {
    public ModLangCNGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(@NotNull TranslationBuilder translationBuilder) {
        translationBuilder.add(WhiskItem.WHISK_TOOL_TIP_1, "一款可以用于搅拌食物的搅拌器，" +
                "或者...用它来搅匀怪物的脑浆？");
        translationBuilder.add(CuttleboneItem.CUTTLEBONE_TOOL_TIP_1, "当紫水晶工具击杀鱿鱼时掉落");
        translationBuilder.add(TruffleItem.TRUFFLE_TOOL_TIP_1, "可以从灰化土中找到");
        translationBuilder.add(WhiskItem.TOOL_TIP_0, "按住 [SHIFT] 以显示更多");
        translationBuilder.add(ButterItem.BUTTER_TOOL_TIP_0, "黏糊糊的质感...或许除了做食物以外另有其用");


        translationBuilder.add(GlassBowlBlockEntity.WHISK_FAIL, "这东西似乎不是搅拌器能处理的");

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

        translationBuilder.add(ModItems.EGG_TART, "蛋挞");
        translationBuilder.add(ModItems.APPLE_PUDDING, "苹果布丁");
        translationBuilder.add(ModItems.BRAISED_SHRIMP_BALL, "红烧虾球");
        translationBuilder.add(ModItems.MATCHA_PUDDING, "抹茶补丁");
        translationBuilder.add(ModItems.SUNFLOWER_SEED, "葵花籽");
        translationBuilder.add(ModItems.TRUFFLE_EGG_TART, "松露蛋挞");
        translationBuilder.add(ModItems.PUDDING_WIP_1, "布丁（半成品）");
        translationBuilder.add(ModItems.PUDDING_WIP_2, "布丁（半成品）");

        translationBuilder.add(ModItems.POTATO_STARCH, "马铃薯淀粉");
        translationBuilder.add(ModItems.MIXED_DOUGH, "混合面团");

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
        translationBuilder.add(ModItems.GRILLED_SAUSAGE, "烤香肠");
        translationBuilder.add(ModItems.STARCH_SAUSAGE, "淀粉肠");
        translationBuilder.add(ModItems.GRILLED_STARCH_SAUSAGE, "烤淀粉肠");
        translationBuilder.add(ModItems.LITTLE_OCTOPUS_SAUSAGE, "小章鱼香肠");

        translationBuilder.add(ModItems.BLACK_TRUFFLE, "黑松露");
        translationBuilder.add(ModItems.WHITE_TRUFFLE, "白松露");
        translationBuilder.add(ModItems.ICE_BRICK, "冰砖");

        translationBuilder.add(ModItems.AMETHYST_SWORD, "紫水晶剑");
        translationBuilder.add(ModItems.AMETHYST_PICKAXE, "紫水晶镐");
        translationBuilder.add(ModItems.AMETHYST_AXE, "紫水晶斧");
        translationBuilder.add(ModItems.AMETHYST_SHOVEL, "紫水晶锹");
        translationBuilder.add(ModItems.AMETHYST_HOE, "紫水晶锄");

        translationBuilder.add(ModBlocks.GLASS_BOWL, "玻璃碗");
        translationBuilder.add(GlassBowlCategory.GLASS_BOWL_NAME, "搅拌");
        translationBuilder.add(ModBlocks.OVEN, "烤炉");
        translationBuilder.add(OvenBlockEntity.OVEN_NAME, "烘焙");
        translationBuilder.add(ModBlocks.FREEZER, "冰柜");
        translationBuilder.add(FreezerBlockEntity.FREEZER_NAME, "冷藏");

        translationBuilder.add(ModItemGroups.GROUPS_TAB_NAME, "烘焙乐事");

        translationBuilder.add("sounds.bakingdelight.entity_butter_hit", "黄油：击中");
        translationBuilder.add("sounds.bakingdelight.entity_butter_shoot", "黄油：发射");
        translationBuilder.add("sounds.bakingdelight.entity_cherry_bomb_explosion", "樱桃：爆炸");
        translationBuilder.add("sounds.bakingdelight.entity_cherry_bomb_shoot", "樱桃：发射");
        translationBuilder.add("sounds.bakingdelight.block_freezer_running", "冰箱：运行");
        translationBuilder.add("sounds.bakingdelight.block_freezer_open", "冰箱：打开");
        translationBuilder.add("sounds.bakingdelight.block_glass_bowl_whisking", "物品: 被搅拌");

        translationBuilder.add(ModAdvancementGenerator.GET_WHISK_TITLE, "准备烘焙!");
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

    }
}
