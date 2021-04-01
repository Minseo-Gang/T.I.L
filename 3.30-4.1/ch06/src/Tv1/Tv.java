package Tv1;

public class Tv {
	
	boolean power; // 전원
	int volume; // 볼륨
	int channel; // 채널
	
	void powerChange() {
		power = !power;
	}
	
	/*
	void powerOn() {
		power = true;
	}
	
	void powerOff() {
		power = false;
	}
	*/
	
	void channelUp() {
		if(power == true) {
			channel++;
		}
	}
	
	void channelDown() {
		if(power == true && channel > 0) {
			channel--;
		}
	}
	
	void channelChange(int ch) {
		if(power == true) {
			channel = ch;
		}
	}
	
	void volumeUp() {
		if(power == true) {
			volume++;
		}
	}
	
	void volumeDown() {
		if(power == true && volume > 0) {
			volume--;
		}
	}
	
	void sayVolume() {
		System.out.println("현재 볼륨:" + volume);
	}
	
	void sayChannel() {
		System.out.println("현재 채널:" + channel);
	}
	
	void sayPower() {
		if(power == true) {
			System.out.println("전원켜짐");
		} else {
			System.out.println("전원꺼짐");
		}
	}
	
	
}
