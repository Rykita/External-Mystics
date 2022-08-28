package dev.rykita.external_mystics

import com.mojang.logging.LogUtils
import io.wispforest.owo.itemgroup.OwoItemGroup
import io.wispforest.owo.registration.RegistryHelper
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler
import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier
import org.slf4j.Logger


object ExternalMystics : ModInitializer {

    val MOD_ID = "external_mystics"
    val LOGGER: Logger = LogUtils.getLogger()

    fun identify(path: String?): Identifier? {
        return Identifier(MOD_ID, path)
    }

    val EM_GROUP: OwoItemGroup = EMItemGroup(identify("main"))

    override fun onInitialize() {

        EM_GROUP.initialize()

        FieldRegistrationHandler.register(BlockRegistry::class.java, MOD_ID, false)
        FieldRegistrationHandler.register(ItemRegistry::class.java, MOD_ID, false)

        LOGGER.info("${javaClass.simpleName} initialized")
    }
}
