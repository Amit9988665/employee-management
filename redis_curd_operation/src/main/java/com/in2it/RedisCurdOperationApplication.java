package com.in2it;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.RedisCacheManagerBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheConfiguration;

@SpringBootApplication
public class RedisCurdOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisCurdOperationApplication.class, args);
	}

	@Bean
	RedisCacheManagerBuilderCustomizer redisCacheManagerBuilderCustomizer()
	{
	    //builder is reference of the RedisCacheManagerBuilder.
	    return (builder)->{     
	        Map<String,RedisCacheConfiguration> map=new HashMap<>();
	        map.put("cache1",RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofSeconds(20)));
	        map.put("cache2",RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(10)));
	    builder.withInitialCacheConfigurations(map);
	    };

}
}
