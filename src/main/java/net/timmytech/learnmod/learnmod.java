package net.timmytech.learnmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.timmytech.learnmod.proxy.IProxy;
import net.timmytech.learnmod.reference.Reference;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class learnmod
{
    @Mod.Instance(Reference.MOD_ID)
    public static learnmod instance;

    @SidedProxy(clientSide = "net.timmytech.learnmod.proxy.ClientProxy", serverSide = "net.timmytech.learnmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
