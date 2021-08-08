package com.github.njibhu.woodswap

import com.sk89q.worldedit.WorldEdit
import com.sk89q.worldedit.bukkit.BukkitAdapter
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import kotlinx.coroutines.*

class SwapCommandListener: CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if(args.size < 2){
            sender.sendMessage("Expecting two arguments")
            return true
        }
        val sourceWood = WoodType.values().find {
            it.type == args[0]
        }
        val targetWood = WoodType.values().find {
            it.type == args[1]
        }
        if(sourceWood == null || targetWood == null){
            sender.sendMessage("Invalid wood type for command woodswap")
            return true
        }

        val worldEdit = WorldEdit.getInstance()

        if(sender !is org.bukkit.entity.Player) {
            sender.sendMessage("This command can only be ran by a player")
            return  true
        }

        val actor = BukkitAdapter.adapt(sender)
        val localSession = worldEdit.sessionManager.get(actor)
        val selection = localSession.selection
        val selectionWorld = localSession.selectionWorld

        if (selection == null || selectionWorld == null){
            sender.sendMessage("You need to have a selection first");
            return true
        }

        runBlocking {
            launch {
                val editSession =  WorldEdit.getInstance().newEditSession(actor)
                val sourceWoodBlocks = getBlockTypes(sourceWood.type);
                val targetWoodBlocks = getBlockTypes(targetWood.type);

                localSession.selection.forEach {
                    val block = selectionWorld.getBlock(it)
                    val index = sourceWoodBlocks.indexOf(block.blockType)
                    if (index > -1){
                        val equivalentBlock = targetWoodBlocks[index]
                        editSession.setBlock(it, equivalentBlock.getState(block.states))
                    }
                }
                editSession.close()
                localSession.remember(editSession)
                sender.sendMessage("/woodswap ${args[0]} ${args[1]} done")
            }
        }

        return true
    }

}
