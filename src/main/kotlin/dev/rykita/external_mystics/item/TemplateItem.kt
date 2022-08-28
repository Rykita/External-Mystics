package dev.rykita.external_mystics.item

import dev.rykita.external_mystics.ExternalMystics.MOD_ID
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.world.World

class TemplateItem(settings: Settings = Settings().group(ItemGroup.MISC)) : Item(settings) {
    @Environment(EnvType.CLIENT)
    override fun appendTooltip(
        stack: ItemStack,
        world: World?,
        tooltip: MutableList<Text>,
        context: TooltipContext
    ) {
        tooltip.add(Text.translatable("item.${MOD_ID}.template_item.tooltip"))
    }
}