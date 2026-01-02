package com.simple.object;

public class RemoteController {
	private Tv tv;

	public RemoteController(Tv tv) {
		this.tv = tv;
	}

	public void powerOnOf() {
		// ?
		tv.powerSwitch();
	}

	public void volumeUp() {
		tv.volumeUp();
	}

	public void volumeDown() {
		tv.volumeDown();
	}
	
	public void channelUp() {
		tv.channelUp();
	}
	
	public void channelDown() {
		tv.channelDown();
	}
	
	public void setChannel(int channel) {
		tv.setChannel(channel);
	}
}