package com.classroom.item

import com.classroom.Course.MOD_ID
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import java.util.logging.Logger

object ModItemGroups {
    private val logger = Logger.getLogger("moditemgroups")

    val academyGroup = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(MOD_ID, "academy_items"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.coursemod.academy"))
            .entries { displayContext, entries ->
                entries.add(ModItems.paper)
                entries.add(ModItems.pencil)
            }
            .build()
    )

    fun registerItemGroups() {
        logger.info("Carregando Item Groups de Course")
    }
}