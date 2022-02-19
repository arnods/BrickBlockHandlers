package org.minestombrick.blockhandlers.app.handlers;

import net.minestom.server.coordinate.Point;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockHandler;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;

public class DoorHandler implements BlockHandler {
    @Override
    public @NotNull NamespaceID getNamespaceId() {
        return NamespaceID.from("blockhandlers:door");
    }

    @Override
    public void onPlace(@NotNull Placement placement) {
        Point point = placement.getBlockPosition().add(0,1,0);
        placement.getInstance().setBlock(point,placement.getBlock());
        placement.getInstance().setBlock(placement.getBlockPosition(), placement.getBlock());
        System.out.println("placement oakdoor");
    }

    @Override
    public void onDestroy(@NotNull Destroy destroy) {
        System.out.println("kapot");
    }

    @Override
    public boolean onInteract(@NotNull Interaction interaction) {
        return BlockHandler.super.onInteract(interaction);
    }

}
