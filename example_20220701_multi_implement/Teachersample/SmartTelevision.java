package example_20220701_multi_implement.Teachersample;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("tv켬");
	}	
	public void turnOff() {
		System.out.println("tv끔");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(" " + volume);
	}
	
	public void search(String url) {
		System.out.println(url + " ");
	}
}
