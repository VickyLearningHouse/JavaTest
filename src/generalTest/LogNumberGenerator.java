package generalTest;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

public class LogNumberGenerator {
    private static final AtomicLong LAST_TIME_MS = new AtomicLong();

    public static void main(String[] args) throws IOException {
        /*for (int j = 0; j < 800; j++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 40; i++) {
                        String now = uniqueCurrentTimeMS();
                        System.out.println("now: " + now + "i=" + i);
                    }
                }
            });
            t.start();
        }*/
        String now = uniqueCurrentTimeMS();
        String now1 = uniqueCurrentTimeMS();
        System.out.println("now: " + now  + " now1: " + now1);
        System.out.println(Long.MAX_VALUE);
    }

    public static String uniqueCurrentTimeMS() {
        long now = Long.valueOf("0000000000000000001");
        while (true) {
            long lastTime = LAST_TIME_MS.get();
            if (lastTime >= now) {
                now = lastTime + 1;
            }
            if (LAST_TIME_MS.compareAndSet(lastTime, now)) {
                return String.format("%019d", now);
            }
        }
    }

}
