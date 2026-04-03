package com.anedhel.vext.sound;

import com.anedhel.vext.VExtMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    /**Sounds for Spider_Web
     *
     */
    public static final SoundEvent SPIDER_WEB_BREAK = registerSoundEvent("spider_web_break");


    public static final BlockSoundGroup SPIDER_WEB_SOUNDS = new BlockSoundGroup(1f,1f,
            SPIDER_WEB_BREAK, SPIDER_WEB_BREAK, SPIDER_WEB_BREAK, SPIDER_WEB_BREAK, SPIDER_WEB_BREAK);



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(VExtMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        VExtMod.LOGGER.info("Registering Mod Sounds for " + VExtMod.MOD_ID);
    }

}
