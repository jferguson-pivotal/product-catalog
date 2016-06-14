package io.pivotal.product.catalog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import io.pivotal.product.PhotoService.PhotoServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PhotoServiceApplication.class)
@WebAppConfiguration
public class PhotoServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
