package connectPool

import redis.clients.jedis.{Jedis, JedisPool, JedisPoolConfig}

object JedisConnectionPool {

  val config = new JedisPoolConfig

  config.setMaxTotal(30)// 最大连接

  config.setMaxIdle(10)// 最大空闲

  val pool = new JedisPool(config,"192.168.17.10",6379,10000)

  // 获取Jedis对象
  def getConnection():Jedis={
    pool.getResource
  }

}
