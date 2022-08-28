package dev.rykita.external_mystics

import io.wispforest.owo.Owo
import io.wispforest.owo.itemgroup.OwoItemSettings
import io.wispforest.owo.registration.reflect.BlockRegistryContainer
import io.wispforest.owo.registration.reflect.ItemRegistryContainer
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.block.Material
import net.minecraft.block.PillarBlock
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup


class BlockRegistry : BlockRegistryContainer {
    companion object RegistryObj {

        @JvmField val TWIST_PLANKS = Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS))
        @JvmField val TWIST_LOG = PillarBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_LOG))
        @JvmField val STRIPPED_TWIST_LOG = PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_MANGROVE_LOG))

    }

    override fun createBlockItem(block: Block?, identifier: String?): BlockItem {
        return BlockItem(block, OwoItemSettings().group(ExternalMystics.EM_GROUP).tab(1))
    }

    override fun afterFieldProcessing() {
        StrippableBlockRegistry.register(TWIST_LOG, STRIPPED_TWIST_LOG)
    }
}

class ItemRegistry : ItemRegistryContainer {
    companion object RegistryObj {

        @JvmField val BLOCK_ICON = Item(OwoItemSettings())
        @JvmField val TOOLS_ICON = Item(OwoItemSettings())
        @JvmField val MISC_ICON = Item(OwoItemSettings())
        @JvmField val ITEMS_ICON = Item(OwoItemSettings())
        @JvmField val TAB_ICON = Item(OwoItemSettings())



    }
}

