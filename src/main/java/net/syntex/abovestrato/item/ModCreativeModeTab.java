package net.syntex.abovestrato.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.syntex.abovestrato.AboveStrato;
import net.syntex.abovestrato.block.ModBlocks;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AboveStrato.MODID);

    public static final RegistryObject<CreativeModeTab> ABOVESTRATO_TAB = CREATIVE_MODE_TABS.register("abovestrato_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALUMINIUM_POWDER.get()))
                    .title(Component.translatable("creativetab.abovestrato_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_BAUXITE.get());
                        output.accept(ModBlocks.BAUXITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_BAUXITE_ORE.get());
                        output.accept(ModItems.ALUMINIUM_POWDER.get());
                        output.accept(ModItems.ALUMINIUM_INGOT.get());
                        output.accept(ModBlocks.ALUMINIUM_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
