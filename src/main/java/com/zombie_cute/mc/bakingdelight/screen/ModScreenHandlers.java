package com.zombie_cute.mc.bakingdelight.screen;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.screen.custom.*;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<OvenScreenHandler> OVEN_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Bakingdelight.MOD_ID, "oven_screen"),
                    new ExtendedScreenHandlerType<>(OvenScreenHandler::new));
    public static final ScreenHandlerType<FreezerScreenHandler> FREEZER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Bakingdelight.MOD_ID, "freezing_screen"),
                    new ExtendedScreenHandlerType<>(FreezerScreenHandler::new));
    public static final ScreenHandlerType<AdvanceFurnaceScreenHandler> ADVANCE_FURNACE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Bakingdelight.MOD_ID, "advance_furnace_screen"),
                    new ExtendedScreenHandlerType<>(AdvanceFurnaceScreenHandler::new));
    public static final ScreenHandlerType<WoodenBasinScreenHandler> WOODEN_BASIN_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Bakingdelight.MOD_ID, "wooden_basin_screen"),
                    new ExtendedScreenHandlerType<>(WoodenBasinScreenHandler::new));
    public static final ScreenHandlerType<GasCanisterScreenHandler> GAS_CANISTER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Bakingdelight.MOD_ID, "gas_canister_screen"),
                    new ExtendedScreenHandlerType<>(GasCanisterScreenHandler::new));
    public static final ScreenHandlerType<BiogasDigesterControllerScreenHandler> BIOGAS_DIGESTER_CONTROLLER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Bakingdelight.MOD_ID, "biogas_digester_controller_screen"),
                    new ExtendedScreenHandlerType<>(BiogasDigesterControllerScreenHandler::new));
    public static final ScreenHandlerType<BiogasDigesterIOScreenHandler> BIOGAS_DIGESTER_IO_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Bakingdelight.MOD_ID, "biogas_digester_io_screen"),
                    new ExtendedScreenHandlerType<>(BiogasDigesterIOScreenHandler::new));
    public static final ScreenHandlerType<DeepFryerScreenHandler> DEEP_FRYER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Bakingdelight.MOD_ID, "deep_fryer_screen"),
                    new ExtendedScreenHandlerType<>(DeepFryerScreenHandler::new));
    public static void registerScreenHandlers(){
        Bakingdelight.LOGGER.info("Registering Screen Handlers for " + Bakingdelight.MOD_ID);
    }
}
