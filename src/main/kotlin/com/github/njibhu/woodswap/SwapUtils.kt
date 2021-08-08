package com.github.njibhu.woodswap

import com.sk89q.worldedit.world.block.BlockType
import org.bukkit.Material


enum class WoodType(val type: String){
    ACACIA("acacia"),
    BIRCH("birch"),
    DARK_OAK("dark_oak"),
    JUNGLE("jungle"),
    OAK("oak"),
    SPRUCE("spruce"),
}

fun getBlockTypes(woodType: String): List<BlockType> {
    when(woodType){
        WoodType.ACACIA.type -> {
            return listOf(
                BlockType.REGISTRY.get(Material.ACACIA_WOOD.key.key)!!,
                BlockType.REGISTRY.get(Material.ACACIA_LOG.key.key)!!,
                BlockType.REGISTRY.get(Material.ACACIA_PLANKS.key.key)!!,
                BlockType.REGISTRY.get(Material.ACACIA_STAIRS.key.key)!!,
                BlockType.REGISTRY.get(Material.ACACIA_SLAB.key.key)!!,
                BlockType.REGISTRY.get(Material.ACACIA_FENCE.key.key)!!,
                BlockType.REGISTRY.get(Material.ACACIA_FENCE_GATE.key.key)!!,
                BlockType.REGISTRY.get(Material.STRIPPED_ACACIA_LOG.key.key)!!,
                BlockType.REGISTRY.get(Material.STRIPPED_ACACIA_WOOD.key.key)!!,
            )
        }
        WoodType.BIRCH.type -> {
            return listOf(
                BlockType.REGISTRY.get(Material.BIRCH_WOOD.key.key)!!,
                BlockType.REGISTRY.get(Material.BIRCH_LOG.key.key)!!,
                BlockType.REGISTRY.get(Material.BIRCH_PLANKS.key.key)!!,
                BlockType.REGISTRY.get(Material.BIRCH_STAIRS.key.key)!!,
                BlockType.REGISTRY.get(Material.BIRCH_SLAB.key.key)!!,
                BlockType.REGISTRY.get(Material.BIRCH_FENCE.key.key)!!,
                BlockType.REGISTRY.get(Material.BIRCH_FENCE_GATE.key.key)!!,
                BlockType.REGISTRY.get(Material.STRIPPED_BIRCH_LOG.key.key)!!,
                BlockType.REGISTRY.get(Material.STRIPPED_BIRCH_WOOD.key.key)!!,
            )
        }
        WoodType.DARK_OAK.type -> {
            return listOf(
                BlockType.REGISTRY.get(Material.DARK_OAK_WOOD.key.key)!!,
                BlockType.REGISTRY.get(Material.DARK_OAK_LOG.key.key)!!,
                BlockType.REGISTRY.get(Material.DARK_OAK_PLANKS.key.key)!!,
                BlockType.REGISTRY.get(Material.DARK_OAK_STAIRS.key.key)!!,
                BlockType.REGISTRY.get(Material.DARK_OAK_SLAB.key.key)!!,
                BlockType.REGISTRY.get(Material.DARK_OAK_FENCE.key.key)!!,
                BlockType.REGISTRY.get(Material.DARK_OAK_FENCE_GATE.key.key)!!,
                BlockType.REGISTRY.get(Material.STRIPPED_DARK_OAK_LOG.key.key)!!,
                BlockType.REGISTRY.get(Material.STRIPPED_DARK_OAK_WOOD.key.key)!!,
            )
        }
        WoodType.JUNGLE.type -> {
            return listOf(
                BlockType.REGISTRY.get(Material.JUNGLE_WOOD.key.key)!!,
                BlockType.REGISTRY.get(Material.JUNGLE_LOG.key.key)!!,
                BlockType.REGISTRY.get(Material.JUNGLE_PLANKS.key.key)!!,
                BlockType.REGISTRY.get(Material.JUNGLE_STAIRS.key.key)!!,
                BlockType.REGISTRY.get(Material.JUNGLE_SLAB.key.key)!!,
                BlockType.REGISTRY.get(Material.JUNGLE_FENCE.key.key)!!,
                BlockType.REGISTRY.get(Material.JUNGLE_FENCE_GATE.key.key)!!,
                BlockType.REGISTRY.get(Material.STRIPPED_JUNGLE_LOG.key.key)!!,
                BlockType.REGISTRY.get(Material.STRIPPED_JUNGLE_WOOD.key.key)!!,
            )
        }
        WoodType.OAK.type -> {
            return listOf(
                BlockType.REGISTRY.get(Material.OAK_WOOD.key.key)!!,
                BlockType.REGISTRY.get(Material.OAK_LOG.key.key)!!,
                BlockType.REGISTRY.get(Material.OAK_PLANKS.key.key)!!,
                BlockType.REGISTRY.get(Material.OAK_STAIRS.key.key)!!,
                BlockType.REGISTRY.get(Material.OAK_SLAB.key.key)!!,
                BlockType.REGISTRY.get(Material.OAK_FENCE.key.key)!!,
                BlockType.REGISTRY.get(Material.OAK_FENCE_GATE.key.key)!!,
                BlockType.REGISTRY.get(Material.STRIPPED_OAK_LOG.key.key)!!,
                BlockType.REGISTRY.get(Material.STRIPPED_OAK_WOOD.key.key)!!,
            )
        }
        WoodType.SPRUCE.type -> {
            return listOf(
                BlockType.REGISTRY.get(Material.SPRUCE_WOOD.key.key)!!,
                BlockType.REGISTRY.get(Material.SPRUCE_LOG.key.key)!!,
                BlockType.REGISTRY.get(Material.SPRUCE_PLANKS.key.key)!!,
                BlockType.REGISTRY.get(Material.SPRUCE_STAIRS.key.key)!!,
                BlockType.REGISTRY.get(Material.SPRUCE_SLAB.key.key)!!,
                BlockType.REGISTRY.get(Material.SPRUCE_FENCE.key.key)!!,
                BlockType.REGISTRY.get(Material.SPRUCE_FENCE_GATE.key.key)!!,
                BlockType.REGISTRY.get(Material.STRIPPED_SPRUCE_LOG.key.key)!!,
                BlockType.REGISTRY.get(Material.STRIPPED_SPRUCE_WOOD.key.key)!!,
            )
        }
    }

    return listOf()
}
