package com.demo.wsclientdemo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.wsdemo.HelloWorldService;

@ContextConfiguration(locations = { "classpath:META-INF/spring/soa-client-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SoaClientTest {

	@Autowired
	private HelloWorldService client;

	@Test
	public void testSimpleProperties() throws Exception {
		String response = client.greet("Dheren");
		assertEquals("Hello Dheren", response);
	}

}
