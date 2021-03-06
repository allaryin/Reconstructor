package org.mcupdater.reconstructor.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.mcupdater.reconstructor.tile.BlockRecon;
import org.mcupdater.reconstructor.ModBlocks;

@Mod.EventBusSubscriber
public class CommonProxy
{

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event){
		event.getRegistry().register(new BlockRecon());
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event){
		event.getRegistry().register(ModBlocks.reconstructor.getItemBlock());
	}
}
