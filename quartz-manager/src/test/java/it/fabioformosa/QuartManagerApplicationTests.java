package it.fabioformosa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import br.patrickmonte.QuartManagerApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = QuartManagerApplication.class)
@WebAppConfiguration
public class QuartManagerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
