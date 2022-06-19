package net.nospacehuman.blodreina;

import net.fabricmc.api.ModInitializer;
import net.nospacehuman.blodreina.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NouBlodreinaNowe implements ModInitializer {
	public static final String MOD_ID = "blodreina";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
