package generalTest;

import java.util.Date;
import java.util.Locale;


public class StringFormat {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String oldStr = "Hi %s: your id: %s is wrong";
        String dateStr = "error date: %ta, and : %d";

        String expectedStr = String.format(oldStr, "vicky","i332445");
        System.out.println(expectedStr);

        Date date = new Date();
        String expectedStr1 = String.format(Locale.GERMAN, dateStr, date,25);
        System.out.println(expectedStr1);
    }

}
