package com.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitTestingApplicationTests {
	
	private Calculator c= new Calculator();

	@Test
	void contextLoads() {
		
		
	}
    @Test
    @Disabled
	void testSum() 
    {
    	//expectedResult
    	int expectedResult=18;
    	
    	//actual
		int actualResult = c.doSum(5, 7, 6);
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}
    
    @Test
   	void testProduct() 
       {
       	//expectedResult
       	int expectedResult=30;
       	
       	//actual
   		int actualResult = c.doMulti(5,6);
   		
   		assertThat(actualResult).isEqualTo(expectedResult);
   	}
    
    @Test
   	void testCompare() 
       {
       	
       	
       	//actual
   		boolean actualResult = c.compareTwoNumber(3, 3);
   		
   		assertThat(actualResult).isTrue();
   	}
}
