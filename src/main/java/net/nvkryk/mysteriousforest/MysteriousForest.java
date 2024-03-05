package net.nvkryk.mysteriousforest;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.impl.content.registry.FlammableBlockRegistryImpl;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.nvkryk.mysteriousforest.block.AllyWoodLog.ALLY_WOOD_LOG_BLOCK;

public class MysteriousForest implements ModInitializer {
  @Override
  public void onInitialize() {
    Registry.register(Registry.BLOCK, new Identifier("mysteriousforest", "ally_wood_log"), ALLY_WOOD_LOG_BLOCK);
    FlammableBlockRegistryImpl flammableBlockRegistry = (FlammableBlockRegistryImpl) FlammableBlockRegistry.getDefaultInstance();
    int flammability = 5, spreadChance = 10;
    flammableBlockRegistry.add(ALLY_WOOD_LOG_BLOCK, flammability, spreadChance);
    Registry.register(Registry.ITEM, new Identifier("mysteriousforest", "ally_wood_log"),
            new BlockItem(ALLY_WOOD_LOG_BLOCK, new FabricItemSettings()));
  }
}