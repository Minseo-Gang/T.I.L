package Tv1;

public class Tv {
	
	boolean power; // ����
	int volume; // ����
	int channel; // ä��
	
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
		System.out.println("���� ����:" + volume);
	}
	
	void sayChannel() {
		System.out.println("���� ä��:" + channel);
	}
	
	void sayPower() {
		if(power == true) {
			System.out.println("��������");
		} else {
			System.out.println("��������");
		}
	}
	
	
}
