package com.zombie_cute.mc.bakingdelight.compat.rei.deep_frying;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.entities.DeepFryerBlockEntity;
import com.zombie_cute.mc.bakingdelight.tag.ModTagKeys;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.LinkedList;
import java.util.List;

public class DeepFryingCategory implements DisplayCategory<DeepFryingDisplay> {
    public static final Identifier TEXTURE =
            new Identifier(Bakingdelight.MOD_ID, "textures/gui/compats/deep_fryer.png");
    public static final CategoryIdentifier<DeepFryingDisplay> DEEP_FRYING =
            CategoryIdentifier.of(Bakingdelight.MOD_ID, "deep_frying");

    @Override
    public CategoryIdentifier<? extends DeepFryingDisplay> getCategoryIdentifier() {
        return DEEP_FRYING;
    }

    @Override
    public Text getTitle() {
        return Text.translatable(DeepFryerBlockEntity.DEEP_FRYER_NAME);
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(ModBlocks.DEEP_FRYER.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(DeepFryingDisplay display, Rectangle bounds) {
        final Point startPoint = new Point(bounds.getCenterX() - 77, bounds.getCenterY() - 35);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(startPoint.x, startPoint.y,150,73)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 11,startPoint.y + 23))
                .entries(display.getInputEntries().get(0)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 29,startPoint.y + 52))
                .markInput().entry(EntryStacks.of(ModBlocks.GAS_CANISTER)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 47,startPoint.y + 52))
                .markInput().entry(EntryStacks.of(ModBlocks.GAS_COOKING_STOVE)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 87,startPoint.y + 52))
                .markInput().entry(EntryStacks.of(ModBlocks.DEEP_FRY_BASKET)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 66,startPoint.y + 5))
                .markInput().entries(EntryIngredients.ofFluidTag(ModTagKeys.OIL)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 47,startPoint.y + 23))
                .markInput().entry(EntryStacks.of(ModBlocks.DEEP_FRYER)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 124,startPoint.y + 34))
                .markOutput().entries(display.getOutputEntries().get(0)));

        return widgets;
    }

    @Override
    public int getFixedDisplaysPerPage() {
        return 1;
    }
}
