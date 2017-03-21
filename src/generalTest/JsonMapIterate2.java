package generalTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringEscapeUtils;

public class JsonMapIterate2 {
    public static void escapeCharacter(Map<String, Object> map){
        for(Map.Entry<String, Object> entry  : map.entrySet()){
            //map.put(entry.getKey(), escapeCharacterInnerJSON(entry.getValue()));

            Object value = entry.getValue();

            Object ret = escapeCharacterInnerJSON(value);


            entry.setValue(ret);
        }
    }

    public static Object escapeCharacterInnerJSON(Object value){
        if(value instanceof String){
            return StringEscapeUtils.escapeHtml((String) value);
        } else if(value instanceof Map){
            Map<String, Object> mapInner = (Map<String, Object>) value;
            for(Map.Entry<String, Object> entry  : mapInner.entrySet()){
                Object value2 = entry.getValue();

                Object ret = escapeCharacterInnerJSON(value2);


                entry.setValue(ret);


                //escapeCharacterInnerJSON(entry.getValue());
            }
            //escapeCharacter(mapInner);

            return mapInner;
        }else if(value instanceof List){
            ArrayList mapArray = (ArrayList) value;
            Iterator it = mapArray.iterator();

            for(int i = 0; i < mapArray.size(); i++) {
                Object obj = escapeCharacterInnerJSON(mapArray.get(i));;
                mapArray.set(i, obj);
            }

   //         while(it.hasNext()){
     //           escapeCharacterInnerJSON(it.next());
       //     }

            return mapArray;
        }
        return value;
    }
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("key1", "value1 & 1");
        map.put("key2", "value2 & 2");

        HashMap mapInner = new HashMap();
        mapInner.put("vicky", "vicky && you");
        mapInner.put("vicky1", "vicky && you");
        mapInner.put("vicky2", "vicky && you");

        //map.put("inner", mapInner);


        List list = new ArrayList();
        list.add("111 & 222");
        list.add("333 & 444");
        list.add(mapInner);
        map.put("array", list);



        escapeCharacterInnerJSON(map);


        System.out.println(map.toString());
    }




}
