package example_20220701_multi_implement.Teachersample;


//상속받아 구현 
public class Audio implements RemoteControl {

    //필드
    private int volume;

    //turnOn() 추상 메소드의 실체 메서드 
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    //turnOff() 추상 메소드의 실체 메서드
    public  void turnOff() {
        System.out.println("Audio를 끕니다.");
    }
    
    //setVolume() 추상 메소드의 실체 메소드
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }


    @Override
    public void setMute(boolean mute) {
        if(mute) {
            System.out.println("오디오 무음");
        } else {
            System.out.println("오디오 무음 해제");
        }
    }
}