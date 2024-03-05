package net.nvkryk.mysteriousforest.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.nvkryk.mysteriousforest.block.AllyWoodLog;

public class MysteriousForestClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    BlockRenderLayerMap.INSTANCE.putBlock(AllyWoodLog.ALLY_WOOD_LOG_BLOCK, RenderLayer.getCutout());
  }
}