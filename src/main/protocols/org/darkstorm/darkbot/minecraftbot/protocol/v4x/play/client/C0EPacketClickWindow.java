package org.darkstorm.darkbot.minecraftbot.protocol.v4x.play.client;

import java.io.*;

import org.darkstorm.darkbot.minecraftbot.protocol.*;
import org.darkstorm.darkbot.minecraftbot.protocol.ProtocolX.State;

public class C0EPacketClickWindow extends AbstractPacketX implements WriteablePacket {

	public C0EPacketClickWindow() {
		super(0x00, State.PLAY, Direction.UPSTREAM);
	}

	@Override
	public void writeData(DataOutputStream out) throws IOException {
	}
}