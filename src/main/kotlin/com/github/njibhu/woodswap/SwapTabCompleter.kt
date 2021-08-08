package com.github.njibhu.woodswap

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter


class SwapTabCompleter: TabCompleter {
    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        alias: String,
        args: Array<out String>
    ): MutableList<String> {
        return WoodType.values().map { it.type }.toMutableList()
    }

}