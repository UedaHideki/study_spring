package hi.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import hi.config.MvcWebConfig;
import hi.service.ServiceEx1;

@SpringJUnitWebConfig(classes = {MvcWebConfig.class})
class ServiceExTest {
	
	@Autowired
	ServiceEx1 s;

	@Test
	@DisplayName("最初のテスト")
	void testGetIncrementValue() {
		
		assertEquals(2,  s.getIncrementValue(1));
		
	}

}
