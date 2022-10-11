package com.in2it.config;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.cache.RedisCacheManagerBuilderCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;

@Configuration
@EnableCaching
public class RedisConfi {

//	public JedisConnectionFactory jedisConnectionFactory() {
//		RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
//		redisStandaloneConfiguration.setHostName("127.0.0.1");
//		redisStandaloneConfiguration.setPort(6379);
//		
//		/* redisStandaloneConfiguration.setPassword("password"); */
//
//		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(redisStandaloneConfiguration);
//		jedisConnectionFactory.afterPropertiesSet();
//		return jedisConnectionFactory;
//	}
//
//	@Bean
//	public RedisTemplate<String, UserTest> redisTemplate() {
//		RedisTemplate<String, UserTest> redisTemplate=new RedisTemplate<>();
//		redisTemplate.setConnectionFactory(jedisConnectionFactory());
//		redisTemplate.setKeySerializer(new StringRedisSerializer());
//		redisTemplate.setHashKeySerializer(new StringRedisSerializer());
//		redisTemplate.setHashKeySerializer(new JdkSerializationRedisSerializer());
//		redisTemplate.setHashValueSerializer(new JdkSerializationRedisSerializer());
//		redisTemplate.setEnableTransactionSupport(true);
////		redisTemplate.afterPropertiesSet();
//		return redisTemplate;
//	}
	@Bean
	RedisCacheManagerBuilderCustomizer redisCacheManagerBuilderCustomizer() {
		// builder is reference of the RedisCacheManagerBuilder.
		return (builder) -> {
			Map<String, RedisCacheConfiguration> map = new HashMap<>();
			map.put("cache1", RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofSeconds(20)));
			map.put("cache2", RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(10)));
			builder.withInitialCacheConfigurations(map);
		};

	}
}
