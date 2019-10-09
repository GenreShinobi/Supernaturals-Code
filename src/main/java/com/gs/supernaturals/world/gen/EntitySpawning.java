package com.gs.supernaturals.world.gen;

import com.google.common.collect.ImmutableList;
import com.gs.supernaturals.core.ModBlocks;
import com.gs.supernaturals.core.ModEntity;
import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.EntityClassification;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.jigsaw.JigsawManager;
import net.minecraft.world.gen.feature.jigsaw.JigsawPattern;
import net.minecraft.world.gen.feature.jigsaw.SingleJigsawPiece;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeManager;

public class EntitySpawning {

    public static void setupEntitySpawning() {
//        // CountRangeConfig(count, bottomOffset, topOffset, maximum)
////        // Silver
////        EntityClassification kitsuneClassification = EntityClassification.CREATURE;
////
////        for(BiomeManager.BiomeType btype : BiomeManager.BiomeType.values()) {
////            for (BiomeManager.BiomeEntry biomeEntry : BiomeManager.getBiomes(btype)) {
////                biomeEntry.biome.getSpawns(kitsuneClassification).add(new Biome.SpawnListEntry(ModEntity.KITSUNE, 10, 1,100));
////            }
////        }

        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("village/common/kitsune_entity"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("village/common/kitsune_entity"), 1)), JigsawPattern.PlacementBehaviour.RIGID));

    }
}
