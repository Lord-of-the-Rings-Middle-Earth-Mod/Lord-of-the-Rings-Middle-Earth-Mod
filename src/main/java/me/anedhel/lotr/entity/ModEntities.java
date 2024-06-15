package me.anedhel.lotr.entity;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.entity.custom.HobbitEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<HobbitEntity> HOBBIT = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "hobbit"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, HobbitEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

}
