package com.zombie_cute.mc.bakingdelight;

import com.zombie_cute.mc.bakingdelight.gen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BakingdelightDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModModelGenerator::new);
		pack.addProvider(ModLangGenerator::new);
		pack.addProvider(ModLangCNGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModBlockLootGenerator::new);
		pack.addProvider(ModBlockTagGenerator::new);
		pack.addProvider(ModItemTagGenerator::new);
		pack.addProvider(ModAdvancementGenerator::new);
	}
}
