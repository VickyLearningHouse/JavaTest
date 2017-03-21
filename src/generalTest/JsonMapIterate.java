package generalTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringEscapeUtils;

public class JsonMapIterate {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("key1", "value1 & 1");
        map.put("key2", "value2 & 2");

        HashMap mapInner = new HashMap();
        mapInner.put("vicky", "vicky && you");
        mapInner.put("vicky1", "vicky && you");
        mapInner.put("vicky2", "vicky && you");

        map.put("inner", mapInner);
        map = (HashMap) escapeCharacter(map);


        System.out.println(map.toString());
    }

    public static Map escapeCharacter(Map<String, Object> map){
        for(Map.Entry<String, Object> entry  : map.entrySet()){
            escapeCharacterInnerJSON(map, entry.getKey(),entry.getValue());
        }
        return map;
    }

    public static void escapeCharacterInnerJSON(Map<String, Object> map, String key, Object value){
        //Map map = new HashMap();
        if(value instanceof String){
            map.put(key, StringEscapeUtils.escapeHtml((String) value));
        }else if(value instanceof Map){
            Map<String, Object> mapInner = (Map<String, Object>) value;
            escapeCharacter(mapInner);
        }else if(value instanceof List){
            ArrayList mapArray = (ArrayList) value;
            Iterator it = mapArray.iterator();
            while(it.hasNext()){
                escapeCharacterInnerJSON(map, key, it.next());
            }
        }
       // return map;
    }


}
