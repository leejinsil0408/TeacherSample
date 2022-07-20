package example_20220701_multi_implement.Teachersample;


public interface RemoteControl {

	//실제로 코드 구현되기 전에는 존재하지 않음 껍대기같은 존재. 
	//인터페이스 기준으로 실제 코드(자식클래스)랑 연결이 됨. 인터페이스로 인해 객체가 구현이 됨. 

	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	// int BATTERY_COUNT = 0;
	
	//추상 메서드 (이름만 있는 것)
	void turnOn();
	void turnOff();
	void setVolume(int volume);  //매개변수 지정 

	//default 메서드 (static X 인스턴스 없이 실행X 자식클래스에서 구현해야 함 )
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음");
		} else {
			System.out.println("무음 해제");
		}
	}
	
	//정적 메서드 (인스턴스 없이 실행 가능)
	static void changeBattery() {
		System.out.println("배터리 교체");
	}
}
