package i.learn.fabric

import i.learn.fabric.items.FabricItem
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import org.slf4j.LoggerFactory

class LearnFabricMod : ModInitializer {
    private val FABRIC_ITEM = FabricItem(FabricItemSettings().group(ItemGroup.MISC).maxCount(16))

    private val logger = LoggerFactory.getLogger(LearnFabricMod::class.java)
    override fun onInitialize() {
        logger.info("Hello Fabric world!")
        Registry.register(Registry.ITEM, Identifier("tutorial", "fabric_item"), FABRIC_ITEM)
    }
}
