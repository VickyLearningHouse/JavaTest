package generalTest;

import java.util.Map;

/**
 * test if map is null, then use it directly ok?
 * @author I332445
 *
 */
public class NullMapGet {

    public static void main(String[] args) {
        Map map = null;
        if(map.get("test")!=null){
            System.out.println("OK!");
        }
    }

}
