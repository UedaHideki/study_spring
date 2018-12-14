package group.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServiceExTest {

	@Test
	void testGetIncrementValue() {
		ServiceEx1 s = new ServiceEx1();
		assertEquals(2,  s.getIncrementValue(1));
		
	}

}
