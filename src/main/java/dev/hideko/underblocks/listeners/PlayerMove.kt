package dev.hideko.underblocks.listeners

import dev.hideko.underblocks.UnderBlocks
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent

class PlayerMove: Listener {
    @EventHandler
    fun onPlayerMovement(e: PlayerMoveEvent) {
        val config = UnderBlocks.configs
        val playerBlock = e.player.location.subtract(0.0, 1.0, 0.0)
        val underBlock = playerBlock.block.type
        config.getKeys(false).forEach { key ->
            val blocks = config.getStringList("$key.block")
            val commands = config.getStringList("$key.command")
            blocks.forEach { block ->
                val material = Material.matchMaterial(block)
                if (material !== null && material == Material.SNOW && material == e.player.location.block.type) {
                    commands.forEach { cmd ->
                        e.player.performCommand(cmd)
                    }
                }
                if(material !== null && underBlock !== Material.SNOW && material == underBlock) {
                    commands.forEach { cmd ->
                        e.player.performCommand(cmd)
                    }
                }
            }
        }
    }
}