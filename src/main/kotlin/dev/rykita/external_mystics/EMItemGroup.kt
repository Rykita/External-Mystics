package dev.rykita.external_mystics

import io.wispforest.owo.itemgroup.Icon
import io.wispforest.owo.itemgroup.OwoItemGroup
import io.wispforest.owo.itemgroup.gui.ItemGroupButton
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.tag.TagKey
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


class EMItemGroup(id: Identifier?) : OwoItemGroup(id) {
    public override fun setup() {
        this.addTab(Icon.of(ItemRegistry.ITEMS_ICON), "items", TagKey.of(Registry.ITEM_KEY, ExternalMystics.identify("items")))
        this.addTab(Icon.of(ItemRegistry.BLOCK_ICON), "blocks", TagKey.of(Registry.ITEM_KEY, ExternalMystics.identify("blocks")))
        this.addTab(Icon.of(ItemRegistry.TOOLS_ICON), "tools", TagKey.of(Registry.ITEM_KEY, ExternalMystics.identify("tools")))
        this.addTab(Icon.of(ItemRegistry.MISC_ICON), "misc", TagKey.of(Registry.ITEM_KEY, ExternalMystics.identify("misc")))

        this.addButton(ItemGroupButton.github("https://github.com/Noaaan/MythicMetals/issues"));
        this.addButton(ItemGroupButton.curseforge("https://www.curseforge.com/minecraft/mc-mods/mythicmetals"));
        this.addButton(ItemGroupButton.modrinth("https://modrinth.com/mod/mythicmetals"));
        this.addButton(ItemGroupButton.discord("https://discord.gg/69cKvQWScC"));
    }

    override fun createIcon(): ItemStack {
        return ItemStack(ItemRegistry.TAB_ICON)
    }
}
