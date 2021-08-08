package com.github.njibhu.woodswap

import org.bukkit.plugin.java.JavaPlugin


class Woodswap : JavaPlugin() {
    override fun onEnable() {
        val woodSwapCommand = this.getCommand("woodswap")!!
        woodSwapCommand.setExecutor(SwapCommandListener())
        woodSwapCommand.tabCompleter = SwapTabCompleter()
    }

    override fun onDisable() {
    }
}