package example_20220701_multi_implement.Teachersample;
import java.util.concurrent.TimeUnit;

public interface ParkRemote {
    public default void ch3() {
        try {
            for (int i=0; i<3; i++) {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("박준석의 채널");
            } 
        }catch(Exception e) {
            System.out.println(e);
        }
    }  
}
