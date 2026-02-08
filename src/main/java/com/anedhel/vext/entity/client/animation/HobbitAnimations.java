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

package com.anedhel.vext.entity.client.animation;

import net.minecraft.client.render.entity.animation.*;

/**
 * A class containing the animation definitions for the Hobbit entity.
 * Created with Blockbench
 *
 * @author bakbar
 * @since 0.1.0
 */
public class HobbitAnimations {

	public static final AnimationDefinition WALKING = AnimationDefinition.Builder.create(1f).looping()
			.addBoneAnimation("leftArm",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.25f, AnimationHelper.createRotationalVector(-15f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(15f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("rightArm",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.25f, AnimationHelper.createRotationalVector(15f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(-15f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("leftLeg",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.25f, AnimationHelper.createRotationalVector(15f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(-15f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("rightLeg",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.25f, AnimationHelper.createRotationalVector(-15f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(15f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("smoke",
					new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0f, AnimationHelper.createScalingVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("hobbitPipe",
					new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0f, AnimationHelper.createScalingVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR))).build();

	public static final AnimationDefinition RUNNING = AnimationDefinition.Builder.create(0.5f).looping()
			.addBoneAnimation("leftArm",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.125f, AnimationHelper.createRotationalVector(-25f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.375f, AnimationHelper.createRotationalVector(25f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("rightArm",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.125f, AnimationHelper.createRotationalVector(25f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.375f, AnimationHelper.createRotationalVector(-25f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("leftLeg",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.125f, AnimationHelper.createRotationalVector(25f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.375f, AnimationHelper.createRotationalVector(-25f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("rightLeg",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.125f, AnimationHelper.createRotationalVector(-25f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.375f, AnimationHelper.createRotationalVector(25f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("smoke",
					new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0f, AnimationHelper.createScalingVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("hobbitPipe",
					new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0f, AnimationHelper.createScalingVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR))).build();

	public static final AnimationDefinition IDLE = AnimationDefinition.Builder.create(6f).looping()
			.addBoneAnimation("head",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(1.5f, AnimationHelper.createRotationalVector(0f, 0f, -2.5f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(4.458343f, AnimationHelper.createRotationalVector(0f, 0f, 2.5f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(6f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("rightArm",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(1.5f, AnimationHelper.createRotationalVector(0f, 0f, 5f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(3f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(4.5f, AnimationHelper.createRotationalVector(0f, 0f, 5f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(6f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("leftArm",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(1.5f, AnimationHelper.createRotationalVector(0f, 0f, -5f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(3f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(4.5f, AnimationHelper.createRotationalVector(0f, 0f, -5f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(6f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("hobbitPipe",
					new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0f, AnimationHelper.createScalingVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("smoke",
					new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0f, AnimationHelper.createScalingVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR))).build();
}
