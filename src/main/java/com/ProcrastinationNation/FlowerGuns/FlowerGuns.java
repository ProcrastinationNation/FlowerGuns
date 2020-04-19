package com.ProcrastinationNation.FlowerGuns;

import com.ProcrastinationNation.FlowerGuns.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.stream.Collectors;

@Mod("flowerguns")
public class FlowerGuns
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "flowerguns";
    public static FlowerGuns instance;

    public FlowerGuns() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

      
        instance = this;

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    public static class FlowerGunsItemGroup extends ItemGroup {
        public static final FlowerGunsItemGroup instance = new FlowerGunsItemGroup(ItemGroup.GROUPS.length, "flowergunstab" );
        private FlowerGunsItemGroup(int index, String label)
        {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.empty_dye_vial);
        }
    }

}
