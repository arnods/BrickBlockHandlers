package org.minestombrick.blockhandlers.app;

import net.minestom.server.MinecraftServer;
import net.minestom.server.extensions.Extension;
import net.minestom.server.instance.block.Block;
import org.minestombrick.blockhandlers.app.handlers.DoorHandler;

public class BrickBlockHandlers extends Extension {

    @Override
    public void initialize() {
        getLogger().info("Enabling " + nameAndVersion() + ".");
        MinecraftServer.getBlockManager().registerHandler(
                Block.OAK_DOOR.namespace(),
                DoorHandler::new
        );


        getLogger().info("Enabled " + nameAndVersion() + ".");
    }

    @Override
    public void terminate() {
        getLogger().info("Disabled " + nameAndVersion() + ".");
    }

    private String nameAndVersion() {
        return getOrigin().getName() + " v" + getOrigin().getVersion();
    }
}