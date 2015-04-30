package org.darkstorm.minecraft.darkbot.event.protocol.server;

import org.darkstorm.minecraft.darkbot.world.item.InventoryType;

public class WindowOpenEvent extends WindowEvent {
	private final InventoryType inventoryType;
	private final String windowTitle;
	private final int slotCount;

	public WindowOpenEvent(int windowId, InventoryType inventoryType, String windowTitle, int slotCount) {
		super(windowId);

		this.inventoryType = inventoryType;
		this.windowTitle = windowTitle;
		this.slotCount = slotCount;
	}

	public InventoryType getInventoryType() {
		return inventoryType;
	}

	public String getWindowTitle() {
		return windowTitle;
	}

	public int getSlotCount() {
		return slotCount;
	}
}
