package com.sussysyrup.theforge;

import com.sussysyrup.theforge.api.block.ForgePartBenchRegistry;
import com.sussysyrup.theforge.api.fluid.ForgeMoltenFluidRegistry;
import com.sussysyrup.theforge.api.item.ForgePartRegistry;
import com.sussysyrup.theforge.api.item.ForgeToolRegistry;
import com.sussysyrup.theforge.networking.s2c.S2CReceivers;
import com.sussysyrup.theforge.registry.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {
    //Order of loading doesn't matter here so go mad
    @Override
    public void onInitializeClient() {
        ModScreenRegistry.init();

        MaterialRegistry.clientInit();

        ForgePartRegistry.clientInit();

        ForgeToolRegistry.itemRenderingInit();

        ForgePartBenchRegistry.clientInit();

        ForgeMoltenFluidRegistry.clientInit();

        FluidRegistry.clientInit();

        ItemsRegistry.clientInit();

        BlocksRegistry.clientInit();

        EventRegistry.clientInit();

        TextureRegistry.init();

        S2CReceivers.init();
    }

}
