package com.github.gongfuboy.redis.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.util.Pool;

/**
 * @author GongFuBoy
 * @date 2018/1/30
 * @time 15:46
 */
public class TestJedis {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("39.106.189.211");
        Pool<Jedis> jedisPool = new JedisPool();
        jedis.auth("personalRedis");
        System.out.println("redis服务器连接成功");
        jedis.set("tempString", "tempString");
        System.out.println(jedis.get("tempString"));
    }

}
