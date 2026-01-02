package com.simple.object;

public class Tv {
	private boolean power;
	private int volume;
	private int channel;
	
	public Tv() {
		this.power = false;
		this.volume = 1;
		this.channel = 1;
	}
	
	public Tv(boolean power, int volume, int channel) {
		this.power = false;
		this.volume = volume;
		this.channel = channel;
	}
	
	public void powerSwitch()	{
//		if (power == true) {
//			power = false;
//		} else {
//			power = true;
//		}
		
		power = !power;
		System.out.println("전원 : "+(power? "ON" : "OFF"));
		
		// if문을 쓰지 않고 논리 연산자 !를 사용하여 처리
	}
	public void volumeUp() {
		if(power) {
			if(volume < 10) 
			volume++; 
			System.out.println(" 현재 볼륨 :"+volume);
		}
	}	
	public void volumeDown()	{
		if(!power) {
			System.out.println(" TV가 꺼져 있습니다.");
			return;
		}
		if(volume > 0) 
			volume--; 
		System.out.println(" 현재 볼륨 :"+volume);
	}
	public void channelUp()	{
		if(channel < 30) 
			channel++; 
		System.out.println(" 현재 채널 :"+channel);
	}	
	public void channelDown()	{
		if(channel <= 1) 
			channel--; 
		System.out.println(" 현재 채널 :"+channel);
}

	public void setChannel(int channel) {
		if(channel >= 1 && channel <= 30) {
			this.channel = channel;
		}
		System.out.println(" 현재 채널 :"+channel);

	}	
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.powerSwitch();
		tv.setChannel(7);
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();		
		tv.channelUp();		
		tv.powerSwitch();
	}
		}