package com.kaboomroads.lostfeatures.entity.client.wildfire;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class WildfireAnimation {
    public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(2f).looping().addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -0.5f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.5f, KeyframeAnimations.posVec(0f, -0.5f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("shields", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 1f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 1f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("shields", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 360f, 0f), AnimationChannel.Interpolations.LINEAR))).addAnimation("shield4", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, -10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, -10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("shield2", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("shield3", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.5f, KeyframeAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("shield1", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(-10f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.5f, KeyframeAnimations.degreeVec(-10f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).build();
    public static final AnimationDefinition HURT = AnimationDefinition.Builder.withLength(1f).addAnimation("shields", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16766666f, KeyframeAnimations.posVec(0f, 2.5f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("shields", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 360f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("shield4", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, -45f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("shield2", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 40f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("shield3", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(45f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("shield1", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(-45f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).build();
}
