package org.darkstorm.minecraft.darkbot.event.protocol.client;

import org.darkstorm.minecraft.darkbot.world.entity.MainPlayerEntity;

public class PlayerRotateEvent extends PlayerUpdateEvent {
	public PlayerRotateEvent(MainPlayerEntity entity) {
		super(entity);
	}

	public PlayerRotateEvent(MainPlayerEntity entity, double yaw, double pitch) {
		super(entity, entity.getX(), entity.getY(), entity.getZ(), yaw, pitch, entity.isOnGround());
	}

	public PlayerRotateEvent(MainPlayerEntity entity, double yaw, double pitch, boolean onGround) {
		super(entity, entity.getX(), entity.getY(), entity.getZ(), yaw, pitch, onGround);
	}
}
