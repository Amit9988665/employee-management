package com.in2it;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ValidationExampleApplicationTests {

	@Test
	void contextLoads() {
		int expected=15;
		int actualResult=10+5;
		
		assertThat(actualResult).isEqualTo(expected);
	}
	 
	
}
