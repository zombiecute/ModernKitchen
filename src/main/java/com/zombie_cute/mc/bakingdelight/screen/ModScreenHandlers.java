package com.zombie_cute.mc.bakingdelight.screen;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<OvenScreenHandler> OVEN_SCREEN_HANDLER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Bakingdelight.MOD_ID, "oven_baking"),
                    new ExtendedScreenHandlerType<>(OvenScreenHandler::new));
    public static final ScreenHandlerType<FreezerScreenHandler> FREEZER_SCREEN_HANDLER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Bakingdelight.MOD_ID, "freezing"),
                    new ExtendedScreenHandlerType<>(FreezerScreenHandler::new));
    public static void registerScreenHandlers(){
        Bakingdelight.LOGGER.info("Registering Screen Handlers for " + Bakingdelight.MOD_ID);
    }
}
