package generalTest;

import java.sql.Timestamp;

public class TimeStamp {

    public static void main(String args[]){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        System.out.println(ts);
    }

}
