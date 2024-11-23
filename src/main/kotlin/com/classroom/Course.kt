package com.classroom

import com.classroom.item.ModItemGroups
import com.classroom.item.ModItems
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Course : ModInitializer {
	const val MOD_ID = "coursemod"

    private val logger = LoggerFactory.getLogger("course")

	override fun onInitialize() {
		logger.info("Hello Fabric world!")

		ModItems.registerModItems()
		ModItemGroups.registerItemGroups()
	}
}