package dev.lazuline;

import net.minecraft.entity.LivingEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.PersistentState;
import net.minecraft.world.PersistentStateManager;
import net.minecraft.world.World;
import java.util.HashMap;
import java.util.UUID;

public class StateSaverAndLoader extends PersistentState {

    public boolean isVampire = false;
    public HashMap<UUID, PlayerData> players = new HashMap<>();

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        nbt.putBoolean("isVampire", isVampire);
        return nbt;
    }
    public static StateSaverAndLoader createFromNbt(NbtCompound tag) {
        StateSaverAndLoader state = new StateSaverAndLoader();
        state.isVampire = tag.getBoolean("isVampire");
        return state;
    }
    public static StateSaverAndLoader getServerState(MinecraftServer server) {
        PersistentStateManager persistentStateManager = server.getWorld(World.OVERWORLD).getPersistentStateManager();

        StateSaverAndLoader state = persistentStateManager.getOrCreate(
                StateSaverAndLoader::createFromNbt,
                StateSaverAndLoader::new,
                BloodParched.MOD_ID
        );

        state.markDirty();

        return state;
    }
    public static PlayerData getPlayerState(LivingEntity player) {
        StateSaverAndLoader serverState = getServerState(player.getWorld().getServer());

        // get the player by the uuid, or we don't have data yet, make a new player state
        PlayerData playerState = serverState.players.computeIfAbsent(player.getUuid(), uuid -> new PlayerData());

        return playerState;
    }
}