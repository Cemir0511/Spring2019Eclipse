package day49;

public class Device {

	
	int serialNum;
	
	public Device() {
		System.out.println("Device constructor"); //bu noye print olmadi bu defa, cunku supr(arg li) oldu en son
	}
	
	public Device (int serialNum) {
		System.out.println("1 arg constructor"); //bu print oldu super (arg) old ugundan sub class ta 
		this.serialNum= serialNum;
	}
}
