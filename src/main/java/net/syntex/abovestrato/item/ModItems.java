package net.syntex.abovestrato.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.syntex.abovestrato.AboveStrato;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AboveStrato.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



    public static final RegistryObject<Item> RAW_BAUXITE = ITEMS.register("raw_bauxite",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> ALUMINIUM_POWDER = ITEMS.register("aluminium_powder",
            () -> new Item(new Item.Properties())
        );
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties())
    );
}
