package example_20220701_multi_implement.Teachersample;
import java.util.concurrent.TimeUnit;

public interface KimRemote {
    public static void channel1() {
        try {
            for (int i=0; i<5; i++) {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("김준석의 채널");
            } 
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}