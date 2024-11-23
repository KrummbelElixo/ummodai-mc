package com.classroom.item

import com.classroom.Course.MOD_ID
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import org.slf4j.LoggerFactory

object ModItems {
    private val logger = LoggerFactory.getLogger("moditems")

    val paper = registerItem("paper", Item(FabricItemSettings()))
    val pencil = registerItem("pencil", Item(FabricItemSettings()))

    fun registerModItems() {
        logger.info("Registrando itens de mods para Course")

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup)
    }

    fun registerItem(name: String, item: Item): Item {
        return Registry.register(Registries.ITEM, Identifier(MOD_ID, name), item)
    }

    fun addItemsToIngredientItemGroup(entries: FabricItemGroupEntries) {
        entries.add(paper)
        entries.add(pencil)
    }
}