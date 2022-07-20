package example_20220701_multi_implement.Teachersample;
import java.util.concurrent.TimeUnit;

public interface LeeRemote {
    public default void ch2() {   
        try {
            for (int i=0; i<11; i++) {
                TimeUnit.SECONDS.sleep(11);
                System.out.println("이준석의 채널");
            } 
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}



