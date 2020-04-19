package com.ProcrastinationNation.FlowerGuns.init;

import com.ProcrastinationNation.FlowerGuns.FlowerGuns;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber (modid = FlowerGuns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(FlowerGuns.MOD_ID)

public class BlockInit {
    public static final Block distillery = null;

    //Blocks
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3).sound(SoundType.METAL)).setRegistryName("distillery"));
    }
    //BlockItems
    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new BlockItem(distillery, new Item.Properties().group(ItemGroup.BREWING)).setRegistryName("distillery"));
    }

}
