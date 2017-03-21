package generalTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class TransferMaptoBean {

    public static void main(String[] args) {
        Map map = new HashMap();
        Map listMap = new HashMap();
        listMap.put("name", "bean2");
        listMap.put("sex", "feamle");

        List beanList = new ArrayList();
        beanList.add(listMap);

        map.put("name", "bean1");
        map.put("beanList",beanList);

        String str = "{name=vicky, beanList=[{sex=feamle}]}";
        //System.out.println(map.toString());
        //String outputStr="{type=Email, fromName=king li, replyToAddress=15708484687@163.com, replyToName=Chen wenxin, toAddress=vicky.chen@sap.com, toName=Vicky chen, to=[{address=vicky.chen@sap.com, name=vicky}, {address=frey.chen@sap.com, name=frey}]}";

        Gson gson = new Gson();
        OutputChannel bean = gson.fromJson(map.toString(), OutputChannel.class);
        System.out.println(bean.getFromName());
    }

}
