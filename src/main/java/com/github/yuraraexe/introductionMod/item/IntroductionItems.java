package com.github.yuraraexe.introductionMod.item;

import com.github.yuraraexe.introductionMod.IntroductionMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IntroductionItems {
    //レジストリの作成
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, IntroductionMod.MOD_ID);
    //アイテムのレジストリへの登録
    public static final RegistryObject<Item> RAW_SHIMANIUM = ITEMS.register("raw_shimanium",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHIMANIUM_INGOT = ITEMS.register("shimanium_ingot",() -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
