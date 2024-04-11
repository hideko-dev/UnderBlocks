package dev.hideko.underblocks

import dev.hideko.underblocks.listeners.PlayerMove
import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.configuration.file.YamlConfiguration
import org.bukkit.plugin.java.JavaPlugin
import java.io.File

class UnderBlocks : JavaPlugin() {

    companion object {
        lateinit var instance: UnderBlocks
        lateinit var configs: FileConfiguration
    }

    override fun onEnable() {

        instance = this

        listOf(
            PlayerMove()
        ).forEach { server.pluginManager.registerEvents(it, this) }

        val configFile = File(dataFolder, "config.yml")
        if(!configFile.exists()) {
            configFile.parentFile.mkdirs()
            saveResource("config.yml", false)
        }
        configs = YamlConfiguration.loadConfiguration(configFile)

        logger.info("Plugin by Hideko")

    }
}
