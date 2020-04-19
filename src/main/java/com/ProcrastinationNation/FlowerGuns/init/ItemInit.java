package com.ProcrastinationNation.FlowerGuns.init;

import com.ProcrastinationNation.FlowerGuns.objects.items.SpecialItem;
import com.ProcrastinationNation.FlowerGuns.FlowerGuns;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;


@Mod.EventBusSubscriber (modid = FlowerGuns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder (FlowerGuns.MOD_ID)
public class ItemInit {

    //vials
    public static final Item empty_dye_vial = null;
    public static final Item white_dye_vial = null;
    public static final Item black_dye_vial = null;
    public static final Item blue_dye_vial = null;
    public static final Item light_blue_dye_vial = null;
    public static final Item light_gray_dye_vial = null;
    public static final Item magenta_dye_vial = null;
    public static final Item orange_dye_vial = null;
    public static final Item pink_dye_vial = null;
    public static final Item red_dye_vial = null;
    public static final Item yellow_dye_vial = null;

    //syringes
    public static final Item blue_dye_syringe = null;
    public static final Item empty_syringe = null;



    @SubscribeEvent
    public static void registerItems (final RegistryEvent.Register<Item> event)
    {
        //Vials
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)).setRegistryName("empty_dye_vial"));
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)).setRegistryName("white_dye_vial"));
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)).setRegistryName("black_dye_vial"));
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)).setRegistryName("blue_dye_vial"));
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)).setRegistryName("light_blue_dye_vial"));
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)).setRegistryName("light_gray_dye_vial"));
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)).setRegistryName("magenta_dye_vial"));
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)).setRegistryName("orange_dye_vial"));
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)).setRegistryName("pink_dye_vial"));
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)).setRegistryName("red_dye_vial"));
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)).setRegistryName("yellow_dye_vial"));
        //Syringes
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)).setRegistryName("empty_syringe"));
        event.getRegistry().register(new Item(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance).food(new Food.Builder().hunger(0).saturation(0f).fastToEat().setAlwaysEdible().effect(new EffectInstance(Effects.JUMP_BOOST, 600, 1), 1f).build())).setRegistryName("blue_dye_syringe"));


        // Special Items
        event.getRegistry().register(new SpecialItem(new Item.Properties().group(FlowerGuns.FlowerGunsItemGroup.instance)));
    }

}
