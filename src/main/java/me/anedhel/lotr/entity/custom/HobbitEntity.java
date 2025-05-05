/*
 * Copyright (c)
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * lord-of-the-rings-middle-earth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * lord-of-the-rings-middle-earth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotr.entity.custom;

import me.anedhel.lotr.entity.NPCEntity;
import me.anedhel.lotr.entity.variant.HobbitVariant;
import me.anedhel.lotr.item.ModItems;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Util;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

/**
 * HobbitEntity class representing a Hobbit NPC in the game. This class extends the NPCEntity class and implements
 * various behaviors and attributes for the Hobbit.
 */
public class HobbitEntity extends NPCEntity {

    private static final TrackedData<Integer> DATA_ID_TYPE_VARIANT = DataTracker.registerData(HobbitEntity.class,
            TrackedDataHandlerRegistry.INTEGER);

    public final AnimationState idleAnimationState = new AnimationState();
    public int idleAnimationTimeout = 0;

    public HobbitEntity(EntityType<? extends NPCEntity> entityType, World world) {
        super(entityType, world);
    }

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
     * @return A {@link DefaultAttributeContainer.Builder} containing the attributes: - Maximum health: 15 - Movement
     * 		speed: 0.5 - Armor: 0.5 - Attack damage: 1
     */
    public static DefaultAttributeContainer.Builder createHobbitAttributes() {
            return MobEntity.createMobAttributes()
                    .add(EntityAttributes.GENERIC_MAX_HEALTH, 15)
                    .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5f)
                    .add(EntityAttributes.GENERIC_ARMOR, 0.5f)
                    .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1);
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

    @Override
    protected void updateLimbs(float posDelta) {
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 6.0f, 1.0f) : 0.0f;
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()) {
            setupAnimationStates();
        }
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(DATA_ID_TYPE_VARIANT, 0);
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

    @Override
    public @Nullable EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason,
            @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        setVariant(Util.getRandom(HobbitVariant.values(), this.random));
        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, nbt.getInt("Variant"));
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("Variant", this.getTypeVariant());
    }
}
