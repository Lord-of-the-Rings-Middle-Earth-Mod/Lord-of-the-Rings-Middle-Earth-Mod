/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.entity.custom;

import com.anedhel.vext.entity.variant.HobbitVariant;
import com.anedhel.vext.item.ModItems;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.recipe.Ingredient;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.util.Util;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

/**
 * Represents a Hobbit entity in the game.
 *
 * @author Moruitz Rohleder
 * @since 0.1.0
 */
public class HobbitEntity extends PathAwareEntity {

	private static final TrackedData<Integer> DATA_ID_TYPE_VARIANT = DataTracker.registerData(HobbitEntity.class,
			TrackedDataHandlerRegistry.INTEGER);

	public final AnimationState idleAnimationState = new AnimationState();
	public int idleAnimationTimeout = 0;

	public HobbitEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
		super(entityType, world);
	}

	/**
	 * Initializes the goals for the Hobbit entity.
	 */
	@Override
	protected void initGoals() {
		this.goalSelector.add(0, new SwimGoal(this));

		this.goalSelector.add(1, new EscapeDangerGoal(this, 2.0));

		this.goalSelector.add(2, new TemptGoal(this, 0.5, Ingredient.ofItems(ModItems.CORN), false));

		this.goalSelector.add(3, new WanderAroundGoal(this, 0.5));
		this.goalSelector.add(4, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
		this.goalSelector.add(5, new LookAroundGoal(this));
	}

	/**
	 * Creates and returns the default attribute container for a Hobbit entity.
	 *
	 * @return A {@link DefaultAttributeContainer.Builder} containing the attributes.
	 */
	public static DefaultAttributeContainer.Builder createHobbitAttributes() {
		return MobEntity.createMobAttributes()
				.add(EntityAttributes.MAX_HEALTH, 15)
				.add(EntityAttributes.MOVEMENT_SPEED, 0.5f)
				.add(EntityAttributes.ARMOR, 0.5f)
				.add(EntityAttributes.ATTACK_DAMAGE, 1)
				.add(EntityAttributes.TEMPT_RANGE, 10f);
	}

	/**
	 * Updates the animation states for the entity.
	 */
	private void setupAnimationStates() {
		if (this.idleAnimationTimeout <= 0) {
			this.idleAnimationTimeout = 475 + this.random.nextInt(1000);
			this.idleAnimationState.start(this.age);
		} else {
			--this.idleAnimationTimeout;
		} //Looking at PandaEntity might help with all the different things they are doing
	}

//	@Override
//	public HobbitEntity createChild(ServerWorld world, PassiveEntity entity) {
//		HobbitEntity baby = ModEntities.HOBBIT.create(world, SpawnReason.BREEDING);
//		HobbitVariant variant = Util.getRandom(HobbitVariant.values(), this.random);
//		baby.setVariant(variant);
//		return baby;
//	}

	/**
	 * Ticks the entity, updating animation states if on the client side.
	 */
	@Override
	public void tick() {
		super.tick();
		if (this.getEntityWorld().isClient()) {
			setupAnimationStates();
		}
	}

	/**
	 * Initializes the data tracker for the entity, adding the variant data.
	 *
	 * @param builder The {@link DataTracker.Builder} to initialize.
	 */
	@Override
	protected void initDataTracker(DataTracker.Builder builder) {
		super.initDataTracker(builder);
		builder.add(DATA_ID_TYPE_VARIANT, 0);
	}

	private int getTypeVariant() {
		return this.dataTracker.get(DATA_ID_TYPE_VARIANT);
	}

	public HobbitVariant getVariant() {
		return HobbitVariant.byId(this.getTypeVariant() & 255);
	}

	public void setVariant(HobbitVariant variant) {
		this.dataTracker.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
	}

	/**
	 * Initializes the entity data when the entity is spawned, setting a random variant.
	 *
	 * @param world The world in which the entity is being spawned.
	 * @param difficulty The local difficulty at the spawn location.
	 * @param spawnReason The reason for the entity's spawn.
	 * @param entityData Additional data for the entity's initialization.
	 * @return The initialized {@link EntityData}.
	 */
	@Override
	public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason,
			EntityData entityData) {
		setVariant(Util.getRandom(HobbitVariant.values(), this.random));
		return super.initialize(world, difficulty, spawnReason, entityData);
	}

	/**
	 * Reads custom data for the entity, including the variant.
	 *
	 * @param view The {@link ReadView} containing the data to read.
	 */
	@Override
	protected void readCustomData(ReadView view) {
		super.readCustomData(view);
		this.dataTracker.set(DATA_ID_TYPE_VARIANT, view.getInt("Variant", 0));
	}

	/**
	 * Writes custom data for the entity, including the variant.
	 *
	 * @param view The {@link WriteView} to write the data to.
	 */
	@Override
	protected void writeCustomData(WriteView view) {
		super.writeCustomData(view);
		view.putInt("Variant", this.getTypeVariant());
	}
}
