package com.zombie_cute.mc.bakingdelight;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.entities.ModBlockEntities;
import com.zombie_cute.mc.bakingdelight.effects.ModPotions;
import com.zombie_cute.mc.bakingdelight.entity.ModEntities;
import com.zombie_cute.mc.bakingdelight.entity.custom.ButterEntity;
import com.zombie_cute.mc.bakingdelight.entity.custom.CherryBombEntity;
import com.zombie_cute.mc.bakingdelight.item.ModItemGroups;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
import com.zombie_cute.mc.bakingdelight.recipe.ModRecipes;
import com.zombie_cute.mc.bakingdelight.screen.ModScreenHandlers;
import com.zombie_cute.mc.bakingdelight.sound.ModSounds;
import com.zombie_cute.mc.bakingdelight.util.ModLootTableModifies;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ProjectileDispenserBehavior;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bakingdelight implements ModInitializer {

	public static final String MOD_ID = "bakingdelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroup();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModLootTableModifies.modifyLootTables();
		ModPotions.registerModPotions();
		ModEntities.registerModEntities();
		ModSounds.registerModSounds();
		ModScreenHandlers.registerScreenHandlers();
		ModRecipes.registerRecipes();

		FuelRegistry.INSTANCE.add(ModItems.WOODEN_WHISK, 200);

		DispenserBlock.registerBehavior(ModItems.BUTTER, new ProjectileDispenserBehavior() {
			@Override
			protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
				return new ButterEntity(world,position.getX(),position.getY(),position.getZ());
			}
		});
		DispenserBlock.registerBehavior(ModItems.CHERRY_BOMB, new ProjectileDispenserBehavior() {
			@Override
			protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
				return new CherryBombEntity(world,position.getX(),position.getY(),position.getZ());
			}
		});
	}
}