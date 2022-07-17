package com.sussysyrup.smitheesfoundry;

import com.sussysyrup.smitheesfoundry.api.entrypoints.CommonSetup;
import com.sussysyrup.smitheesfoundry.registry.*;

public class SetupCommon implements CommonSetup {

    @Override
    public void init() {
        //First to exist other than config
        MaterialRegistry.main();

        //Creates Default Parts
        PartRegistry.main();

        //Makes all the necessary calls for ForgePartBenchRegistry. multiple calls like this can exist as long as its before ForgePartBenchRegistry
        PartBenchRegistry.main();

        //Fluids
        FluidRegistry.main();

        //Smelting
        SmelteryResourceRegistry.main();
    }
}
