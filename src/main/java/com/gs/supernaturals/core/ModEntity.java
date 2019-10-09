package com.gs.supernaturals.core;

import com.gs.supernaturals.entity.creatures.KitsuneEntity;
import com.gs.supernaturals.util.Reference;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModEntity {
    @ObjectHolder("supernaturals:kitsune_entity")
    public static EntityType<?> KITSUNE = EntityType.Builder.create(KitsuneEntity::new, EntityClassification.MISC).build(Reference.MODID + ":kitsune_entity").setRegistryName("kitsune_entity");

}
