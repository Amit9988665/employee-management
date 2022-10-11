package com.in2it.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.in2it.model.UserTest;

@Repository
public class UserDaoImpl implements UserRepo {
	/**
	 *  private RedisTemplate<String, UserTest> redisTemplate;
	 */
	private HashOperations<String, Integer, UserTest> hashOperations;

	/**
	 * // private ListOperations<String, UserTest> listOperations;
	 */
	public UserDaoImpl(@Autowired RedisTemplate<String, UserTest> redisTemplate) {
		super();
		/**
		 * this.redisTemplate = redisTemplate;
		 */
		this.hashOperations = redisTemplate.opsForHash();
	}

	private static final String KEY = "user1";

	@Override
	public boolean saveUser(UserTest user) {
		try {
			hashOperations.put(KEY, user.getId(), user);
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<UserTest> fetchAllUser() {

		return hashOperations.values(KEY);
	}

	@Override
	public UserTest fetchById(Integer id) {
		String stsString = id.toString();
		return hashOperations.get(KEY, stsString);
	}

}
