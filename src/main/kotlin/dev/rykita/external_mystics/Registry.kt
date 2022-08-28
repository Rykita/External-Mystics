package dev.rykita.external_mystics

import io.wispforest.owo.itemgroup.OwoItemSettings
import io.wispforest.owo.registration.reflect.BlockRegistryContainer
import io.wispforest.owo.registration.reflect.ItemRegistryContainer
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup


class BlockRegistry : BlockRegistryContainer {
    companion object RegistryObj {

        @JvmField
        val TWIST_PLANKS = Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS))

    }

    override fun createBlockItem(block: Block?, identifier: String?): BlockItem {
        return BlockItem(block, OwoItemSettings().group(ExternalMystics.EM_GROUP).tab(1))
    }
}

class ItemRegistry : ItemRegistryContainer {
    companion object RegistryObj {

        @JvmField
        val TEST_ITEM = Item(OwoItemSettings().group(ExternalMystics.EM_GROUP).tab(0))


    }
}

