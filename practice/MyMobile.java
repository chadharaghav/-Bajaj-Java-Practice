package day_two;

interface MobileFeatures {
	public void calling();
	public void sendSMS();
	public void playGame();
}

abstract class SimCardHolder {
	public void simCard() {
		System.out.println("Normal sim card...");
	}
	
	abstract void hybridSimCard();
}

class SmartMobile extends SimCardHolder implements MobileFeatures {
	
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling...");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("sending sms...");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("playing game...");
	}
	
	public void OS() {
		System.out.println("Android 10");
	}

	@Override
	void hybridSimCard() {
		// TODO Auto-generated method stub
		System.out.println("Use sim card or memory card!");
	}
	
}

class NokiaMobile extends SmartMobile {
	
	public void brandName() {
		System.out.println("Nokia");
	}
	
}

class SamsungMobile extends SmartMobile {
	
	public void brandName() {
		System.out.println("Samsung");
	}
	
}

public class MyMobile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartMobile mobile = new SmartMobile();
		mobile.calling();
		mobile.sendSMS();
		mobile.playGame();
		mobile.OS();
		mobile.hybridSimCard();
		mobile.simCard();
		
		NokiaMobile nokia = new NokiaMobile();
		nokia.brandName();
		nokia.calling();
		nokia.sendSMS();
		nokia.playGame();
		nokia.OS();
		nokia.hybridSimCard();
		nokia.simCard();
		
		SamsungMobile samsung = new SamsungMobile();
		samsung.brandName();
		samsung.calling();
		samsung.sendSMS();
		samsung.playGame();
		samsung.OS();
		samsung.hybridSimCard();
		samsung.simCard();
	}

}
