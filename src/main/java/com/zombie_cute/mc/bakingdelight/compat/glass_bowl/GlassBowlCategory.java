package com.zombie_cute.mc.bakingdelight.compat.glass_bowl;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.LinkedList;
import java.util.List;

public class GlassBowlCategory implements DisplayCategory<GlassBowlDisplay> {
    public static final Identifier TEXTURE =
            new Identifier(Bakingdelight.MOD_ID, "textures/gui/rei_compat/glass_bowl.png");
    public static final CategoryIdentifier<GlassBowlDisplay> WHISKING =
            CategoryIdentifier.of(Bakingdelight.MOD_ID, "whisking");
    public static final String GLASS_BOWL_NAME = "display_name.bakingdelight.glass_bowl_name";

    @Override
    public CategoryIdentifier<? extends GlassBowlDisplay> getCategoryIdentifier() {
        return WHISKING;
    }

    @Override
    public Text getTitle() {
        return Text.translatable(GLASS_BOWL_NAME);
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(ModBlocks.GLASS_BOWL.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(GlassBowlDisplay display, Rectangle bounds) {
        final Point startPoint = new Point(bounds.getCenterX() - 77, bounds.getCenterY() - 35);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(startPoint.x, startPoint.y,150,55)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 48,startPoint.y + 13))
                .entries(display.getInputEntries().get(0)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 101,startPoint.y + 20))
                .markOutput().entries(display.getOutputEntries().get(0)));

        return widgets;
    }
}
