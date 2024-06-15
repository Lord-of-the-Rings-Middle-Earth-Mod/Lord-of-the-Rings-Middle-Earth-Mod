package me.anedhel.lotr.entity.custom;

import me.anedhel.lotr.entity.NPCEntity;
import me.anedhel.lotr.item.ModItems;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;

public class HobbitEntity extends NPCEntity {

    public final AnimationState idleAnimationState = new AnimationState();
    public int idleAnimationTimeout = 0;

    public HobbitEntity(EntityType<? extends NPCEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));

        this.goalSelector.add(1, new TemptGoal(this, 0.5, Ingredient.ofItems(ModItems.CORN), false));

        this.goalSelector.add(2, new WanderAroundGoal(this, 0.5));
        this.goalSelector.add(3, new StopAndLookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(4, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createHobbitAttributes() {
            return MobEntity.createMobAttributes()
                    .add(EntityAttributes.GENERIC_MAX_HEALTH, 15)
                    .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5f)
                    .add(EntityAttributes.GENERIC_ARMOR, 0.5f)
                    .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1);
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 460;
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
}
