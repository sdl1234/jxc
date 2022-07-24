package com.atguigu.jxc.util;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

import java.util.*;

/**
 * @PackageName: com.atguigu.jxc.util
 * @ClassName: RedisUtilTest
 * @Description:
 * @author: sdl
 * @date: 2022/4/14/10:34
 */
@SpringBootTest
public class RedisUtilTest {

    @Test
    public void saveTest(){

        Jedis jedis = new Jedis("192.168.0.128", 6379);

/*        String s = jedis.get("1123");
        System.out.println("s = " + s);*/


        //获取redis中所有的key
/*        Set<String> keys = jedis.keys("*");


        for (Iterator iterator = keys.iterator(); iterator.hasNext();){
            String next = (String) iterator.next();
            System.out.println("next = " + next);

        }
        System.out.println("jedis.exists(\"k2\") = " + jedis.exists("k2"));
        System.out.println("jedis.ttl(\"k1\") = " + jedis.ttl("k1"));
        System.out.println("jedis.ttl(\"wcy\") = " + jedis.ttl("wcy"));*/


        //string
       /* jedis.set("k4","k4_Reids");
        System.out.println(jedis.get("k4"));
        System.out.println("--------------------------------------------");
        jedis.mset("str1","v1","str2","v2","str3","v3");
        System.out.println(jedis.mget("str1", "str2", "str3"));*/


        //List

        /*List<String> list = jedis.lrange("myList", 0, -1);
        for (String s : list) {
            System.out.println("s = " + s);
        }
*/


        //hash
        /*jedis.hset("hash1","userName","lisi");
        System.out.println(jedis.hget("hash1","userName"));
        Map<String,String> map = new HashMap<String,String>();
        map.put("telphone","13810169999");
        map.put("address","atguigu");
        map.put("email","abc@163.com");
        jedis.hmset("hash2",map);
        List<String> result = jedis.hmget("hash2", "telphone","email");
        for (String element : result) {
            System.out.println(element);
        }*/


        //zset

        jedis.zadd("zset01",60d,"v1");
        jedis.zadd("zset01",70d,"v2");
        jedis.zadd("zset01",80d,"v3");
        jedis.zadd("zset01",90d,"v4");
        Set<String> s1 = jedis.zrange("zset01",0,-2);
        for (Iterator iterator = s1.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            System.out.println(string);
        }



    }

}
