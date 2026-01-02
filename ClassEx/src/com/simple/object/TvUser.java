package com.simple.object;

public class TvUser {

	public static void main(String[] args) {
		Tv tv = new Tv();
		RemoteController remote = new RemoteController(tv);
		
		remote.powerOnOf();
		remote.channelDown();
		remote.volumeUp();
		remote.volumeUp();
		remote.volumeUp();
		remote.setChannel(14);		
		
		remote.powerOnOf();
	}

}
