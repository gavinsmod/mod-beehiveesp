package com.peasenet.mod;

import com.peasenet.main.GavinsMod;
import com.peasenet.mods.esp.ModBeehiveEsp;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeehiveEspMod implements ModInitializer {
    public static Logger LOGGER = LoggerFactory.getLogger("gavinsmod");

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
        GavinsMod.addMod(new ModBeehiveEsp());
    }
}
