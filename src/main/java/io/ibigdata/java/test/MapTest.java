package io.ibigdata.java.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangLijun
 * @Title: MapTest
 * @ProjectName bigdata-scala
 * @Description: TODO
 * @contact: ljzhang@icarevision.cn
 * @date 2018-11-2715:05
 */
public class MapTest {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        map2.put("test1",new Integer(12345));
        map2.put("test2",new Integer(12346));
        map2.put("test3",new Integer(12347));
        map2.put("test4",new Integer(12348));

        map.putAll(map2);
        map2.clear();

        System.out.println(map2.size());
        System.out.println(map.size());
        for (String key:map.keySet()){
            System.out.println(key + ":" + map.get(key));
        }

    }
}
