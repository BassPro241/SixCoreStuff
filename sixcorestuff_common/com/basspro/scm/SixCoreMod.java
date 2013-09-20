package com.basspro.scm;

import com.basspro.scm.core.proxy.CommonProxy;
import com.basspro.scm.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SixCoreMod
{

    @Instance(Reference.MOD_ID)
    public static SixCoreMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        
    }

    @Mod.EventHandler
    private void load(FMLInitializationEvent event)
    {

    }
}
